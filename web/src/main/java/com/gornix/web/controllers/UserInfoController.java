package com.gornix.web.controllers;

import com.gornix.model.pojo.Salary;
import com.gornix.model.pojo.UserInfo;
import com.gornix.model.pojo.Employee;
import com.gornix.services.UserInfoService;

import com.gornix.web.helpers.AvroResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@ControllerAdvice
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoSerivce;

    @RequestMapping(value = "/{userName}")
    public List<UserInfo> fetchUserByName(@PathVariable("userName") String name) {
        return userInfoSerivce.fetchUserInfoByName(name);
    }

    //curl -v "http://localhost:8080/user/create" -d '{"id":1,"name":"zhang", "age":"40"}' -X POST --header "Content-Type:application/json"
    @RequestMapping(value = "/create", method =  RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createEmployee(@RequestBody UserInfo userInfo) {
        System.out.println(userInfo.toString());
    }

    @RequestMapping(value = "/avro/get")
    public @AvroResponseBody Employee fetchAvroTest() {
        return Employee.newBuilder()
                .setFirstName("Qing").setLastName("Zhang")
                .setAge(15).setPhoneNumber("123456789")
                .setSalary(Salary.newBuilder().setSerialNo(12).setAmount("$10000/m").build())
                .build();
    }

    @RequestMapping(value = "avro/create", method =  RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createEmployee(@RequestBody Employee employee) {
        System.out.println(employee.toString());
    }
}
