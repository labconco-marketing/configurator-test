
package com.infor.pcm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DetailType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Summary"/&gt;
 *     &lt;enumeration value="Pricing"/&gt;
 *     &lt;enumeration value="Order"/&gt;
 *     &lt;enumeration value="Proofing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DetailType")
@XmlEnum
public enum DetailType {

    @XmlEnumValue("Summary")
    SUMMARY("Summary"),
    @XmlEnumValue("Pricing")
    PRICING("Pricing"),
    @XmlEnumValue("Order")
    ORDER("Order"),
    @XmlEnumValue("Proofing")
    PROOFING("Proofing");
    private final String value;

    DetailType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DetailType fromValue(String v) {
        for (DetailType c: DetailType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
