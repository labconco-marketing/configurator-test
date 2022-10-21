
package com.infor.pcm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="String"/&gt;
 *     &lt;enumeration value="Number"/&gt;
 *     &lt;enumeration value="Boolean"/&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *     &lt;enumeration value="StringArray"/&gt;
 *     &lt;enumeration value="NumberArray"/&gt;
 *     &lt;enumeration value="BooleanArray"/&gt;
 *     &lt;enumeration value="Collection"/&gt;
 *     &lt;enumeration value="CollectionArray"/&gt;
 *     &lt;enumeration value="ArrayArray"/&gt;
 *     &lt;enumeration value="UnassignedArray"/&gt;
 *     &lt;enumeration value="Unassigned"/&gt;
 *     &lt;enumeration value="DateTimeArray"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataType")
@XmlEnum
public enum DataType {

    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Number")
    NUMBER("Number"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("StringArray")
    STRING_ARRAY("StringArray"),
    @XmlEnumValue("NumberArray")
    NUMBER_ARRAY("NumberArray"),
    @XmlEnumValue("BooleanArray")
    BOOLEAN_ARRAY("BooleanArray"),
    @XmlEnumValue("Collection")
    COLLECTION("Collection"),
    @XmlEnumValue("CollectionArray")
    COLLECTION_ARRAY("CollectionArray"),
    @XmlEnumValue("ArrayArray")
    ARRAY_ARRAY("ArrayArray"),
    @XmlEnumValue("UnassignedArray")
    UNASSIGNED_ARRAY("UnassignedArray"),
    @XmlEnumValue("Unassigned")
    UNASSIGNED("Unassigned"),
    @XmlEnumValue("DateTimeArray")
    DATE_TIME_ARRAY("DateTimeArray");
    private final String value;

    DataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataType fromValue(String v) {
        for (DataType c: DataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
