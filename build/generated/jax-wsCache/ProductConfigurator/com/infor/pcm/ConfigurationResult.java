
package com.infor.pcm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigurationResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConfigurationResult"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="FatalError"/&gt;
 *     &lt;enumeration value="PartialSave"/&gt;
 *     &lt;enumeration value="Cancel"/&gt;
 *     &lt;enumeration value="Queued"/&gt;
 *     &lt;enumeration value="Processing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfigurationResult")
@XmlEnum
public enum ConfigurationResult {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("FatalError")
    FATAL_ERROR("FatalError"),
    @XmlEnumValue("PartialSave")
    PARTIAL_SAVE("PartialSave"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("Queued")
    QUEUED("Queued"),
    @XmlEnumValue("Processing")
    PROCESSING("Processing");
    private final String value;

    ConfigurationResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationResult fromValue(String v) {
        for (ConfigurationResult c: ConfigurationResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
