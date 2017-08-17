package com.gornix.web.helpers;

import com.alibaba.fastjson.JSON;
import org.apache.avro.generic.GenericContainer;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.io.JsonEncoder;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecord;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

@ControllerAdvice
public class AvroResponseBodyAdvice implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return returnType.hasMethodAnnotation(AvroResponseBody.class);
    }

    @Override
    public Object beforeBodyWrite(Object body,
                                  MethodParameter returnType,
                                  MediaType selectedContentType,
                                  Class<? extends HttpMessageConverter<?>> selectedConverterType,
                                  ServerHttpRequest request,
                                  ServerHttpResponse response) {
        if (body instanceof GenericContainer) {
            GenericContainer record = (GenericContainer) body;
            try (final ByteArrayOutputStream out = new ByteArrayOutputStream()) {
                final JsonEncoder encoder = EncoderFactory.get().jsonEncoder(record.getSchema(), out);

                DatumWriter<GenericContainer> writer = new GenericDatumWriter<GenericContainer>();
                if (body instanceof SpecificRecord) {
                    writer = new SpecificDatumWriter<GenericContainer>();
                }

                writer.setSchema(record.getSchema());
                writer.write(record, encoder);
                encoder.flush();
                String bodyString = new String(out.toByteArray(), Charset.forName("UTF-8"));
                out.close();

                return JSON.parseObject(bodyString);
            } catch (final IOException e) {
                throw new RuntimeException(e);
            }
        }

        return body;
    }

};

