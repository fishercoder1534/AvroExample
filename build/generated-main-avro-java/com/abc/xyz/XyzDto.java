/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.abc.xyz;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class XyzDto extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3839902023079039260L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"XyzDto\",\"namespace\":\"com.abc.xyz\",\"fields\":[{\"name\":\"vendorItemInfos\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"VendorItemInfo\",\"fields\":[{\"name\":\"vendorItemId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"price\",\"type\":\"long\"},{\"name\":\"deliveryChargeType\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<com.abc.xyz.VendorItemInfo> vendorItemInfos;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public XyzDto() {}

  /**
   * All-args constructor.
   * @param vendorItemInfos The new value for vendorItemInfos
   */
  public XyzDto(java.util.List<com.abc.xyz.VendorItemInfo> vendorItemInfos) {
    this.vendorItemInfos = vendorItemInfos;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return vendorItemInfos;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: vendorItemInfos = (java.util.List<com.abc.xyz.VendorItemInfo>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'vendorItemInfos' field.
   * @return The value of the 'vendorItemInfos' field.
   */
  public java.util.List<com.abc.xyz.VendorItemInfo> getVendorItemInfos() {
    return vendorItemInfos;
  }

  /**
   * Sets the value of the 'vendorItemInfos' field.
   * @param value the value to set.
   */
  public void setVendorItemInfos(java.util.List<com.abc.xyz.VendorItemInfo> value) {
    this.vendorItemInfos = value;
  }

  /**
   * Creates a new XyzDto RecordBuilder.
   * @return A new XyzDto RecordBuilder
   */
  public static com.abc.xyz.XyzDto.Builder newBuilder() {
    return new com.abc.xyz.XyzDto.Builder();
  }

  /**
   * Creates a new XyzDto RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new XyzDto RecordBuilder
   */
  public static com.abc.xyz.XyzDto.Builder newBuilder(com.abc.xyz.XyzDto.Builder other) {
    return new com.abc.xyz.XyzDto.Builder(other);
  }

  /**
   * Creates a new XyzDto RecordBuilder by copying an existing XyzDto instance.
   * @param other The existing instance to copy.
   * @return A new XyzDto RecordBuilder
   */
  public static com.abc.xyz.XyzDto.Builder newBuilder(com.abc.xyz.XyzDto other) {
    return new com.abc.xyz.XyzDto.Builder(other);
  }

  /**
   * RecordBuilder for XyzDto instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<XyzDto>
    implements org.apache.avro.data.RecordBuilder<XyzDto> {

    private java.util.List<com.abc.xyz.VendorItemInfo> vendorItemInfos;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.abc.xyz.XyzDto.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.vendorItemInfos)) {
        this.vendorItemInfos = data().deepCopy(fields()[0].schema(), other.vendorItemInfos);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing XyzDto instance
     * @param other The existing instance to copy.
     */
    private Builder(com.abc.xyz.XyzDto other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.vendorItemInfos)) {
        this.vendorItemInfos = data().deepCopy(fields()[0].schema(), other.vendorItemInfos);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'vendorItemInfos' field.
      * @return The value.
      */
    public java.util.List<com.abc.xyz.VendorItemInfo> getVendorItemInfos() {
      return vendorItemInfos;
    }

    /**
      * Sets the value of the 'vendorItemInfos' field.
      * @param value The value of 'vendorItemInfos'.
      * @return This builder.
      */
    public com.abc.xyz.XyzDto.Builder setVendorItemInfos(java.util.List<com.abc.xyz.VendorItemInfo> value) {
      validate(fields()[0], value);
      this.vendorItemInfos = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'vendorItemInfos' field has been set.
      * @return True if the 'vendorItemInfos' field has been set, false otherwise.
      */
    public boolean hasVendorItemInfos() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'vendorItemInfos' field.
      * @return This builder.
      */
    public com.abc.xyz.XyzDto.Builder clearVendorItemInfos() {
      vendorItemInfos = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public XyzDto build() {
      try {
        XyzDto record = new XyzDto();
        record.vendorItemInfos = fieldSetFlags()[0] ? this.vendorItemInfos : (java.util.List<com.abc.xyz.VendorItemInfo>) defaultValue(fields()[0]);
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