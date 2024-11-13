/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.amazonaws.services.msf.avro;

@org.apache.avro.specific.AvroGenerated
public interface Out {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"Out\",\"namespace\":\"com.amazonaws.services.msf.avro\",\"types\":[{\"type\":\"record\",\"name\":\"RoomTemperature\",\"fields\":[{\"name\":\"room\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"temperature\",\"type\":\"float\"},{\"name\":\"sampleCount\",\"type\":\"int\"},{\"name\":\"lastSampleTime\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}}]}],\"messages\":{}}");

  @org.apache.avro.specific.AvroGenerated
  public interface Callback extends Out {
    public static final org.apache.avro.Protocol PROTOCOL = com.amazonaws.services.msf.avro.Out.PROTOCOL;
  }
}