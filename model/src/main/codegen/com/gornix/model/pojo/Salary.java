/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.gornix.model.pojo;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Salary extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 29940993965471527L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Salary\",\"namespace\":\"com.gornix.model.pojo\",\"fields\":[{\"name\":\"serialNo\",\"type\":\"long\"},{\"name\":\"amount\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private long serialNo;
   private java.lang.String amount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Salary() {}

  /**
   * All-args constructor.
   * @param serialNo The new value for serialNo
   * @param amount The new value for amount
   */
  public Salary(java.lang.Long serialNo, java.lang.String amount) {
    this.serialNo = serialNo;
    this.amount = amount;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return serialNo;
    case 1: return amount;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: serialNo = (java.lang.Long)value$; break;
    case 1: amount = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'serialNo' field.
   * @return The value of the 'serialNo' field.
   */
  public java.lang.Long getSerialNo() {
    return serialNo;
  }

  /**
   * Sets the value of the 'serialNo' field.
   * @param value the value to set.
   */
  public void setSerialNo(java.lang.Long value) {
    this.serialNo = value;
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The value of the 'amount' field.
   */
  public java.lang.String getAmount() {
    return amount;
  }

  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(java.lang.String value) {
    this.amount = value;
  }

  /**
   * Creates a new Salary RecordBuilder.
   * @return A new Salary RecordBuilder
   */
  public static com.gornix.model.pojo.Salary.Builder newBuilder() {
    return new com.gornix.model.pojo.Salary.Builder();
  }

  /**
   * Creates a new Salary RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Salary RecordBuilder
   */
  public static com.gornix.model.pojo.Salary.Builder newBuilder(com.gornix.model.pojo.Salary.Builder other) {
    return new com.gornix.model.pojo.Salary.Builder(other);
  }

  /**
   * Creates a new Salary RecordBuilder by copying an existing Salary instance.
   * @param other The existing instance to copy.
   * @return A new Salary RecordBuilder
   */
  public static com.gornix.model.pojo.Salary.Builder newBuilder(com.gornix.model.pojo.Salary other) {
    return new com.gornix.model.pojo.Salary.Builder(other);
  }

  /**
   * RecordBuilder for Salary instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Salary>
    implements org.apache.avro.data.RecordBuilder<Salary> {

    private long serialNo;
    private java.lang.String amount;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.gornix.model.pojo.Salary.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.serialNo)) {
        this.serialNo = data().deepCopy(fields()[0].schema(), other.serialNo);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.amount)) {
        this.amount = data().deepCopy(fields()[1].schema(), other.amount);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Salary instance
     * @param other The existing instance to copy.
     */
    private Builder(com.gornix.model.pojo.Salary other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.serialNo)) {
        this.serialNo = data().deepCopy(fields()[0].schema(), other.serialNo);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.amount)) {
        this.amount = data().deepCopy(fields()[1].schema(), other.amount);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'serialNo' field.
      * @return The value.
      */
    public java.lang.Long getSerialNo() {
      return serialNo;
    }

    /**
      * Sets the value of the 'serialNo' field.
      * @param value The value of 'serialNo'.
      * @return This builder.
      */
    public com.gornix.model.pojo.Salary.Builder setSerialNo(long value) {
      validate(fields()[0], value);
      this.serialNo = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'serialNo' field has been set.
      * @return True if the 'serialNo' field has been set, false otherwise.
      */
    public boolean hasSerialNo() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'serialNo' field.
      * @return This builder.
      */
    public com.gornix.model.pojo.Salary.Builder clearSerialNo() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'amount' field.
      * @return The value.
      */
    public java.lang.String getAmount() {
      return amount;
    }

    /**
      * Sets the value of the 'amount' field.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public com.gornix.model.pojo.Salary.Builder setAmount(java.lang.String value) {
      validate(fields()[1], value);
      this.amount = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public com.gornix.model.pojo.Salary.Builder clearAmount() {
      amount = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Salary build() {
      try {
        Salary record = new Salary();
        record.serialNo = fieldSetFlags()[0] ? this.serialNo : (java.lang.Long) defaultValue(fields()[0]);
        record.amount = fieldSetFlags()[1] ? this.amount : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
