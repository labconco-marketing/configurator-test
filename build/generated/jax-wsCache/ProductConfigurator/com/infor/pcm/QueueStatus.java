
package com.infor.pcm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueueStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="QueueStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Processing"/&gt;
 *     &lt;enumeration value="Completed"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="OnHold"/&gt;
 *     &lt;enumeration value="NotFound"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QueueStatus")
@XmlEnum
public enum QueueStatus {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Processing")
    PROCESSING("Processing"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("OnHold")
    ON_HOLD("OnHold"),
    @XmlEnumValue("NotFound")
    NOT_FOUND("NotFound");
    private final String value;

    QueueStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueueStatus fromValue(String v) {
        for (QueueStatus c: QueueStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
