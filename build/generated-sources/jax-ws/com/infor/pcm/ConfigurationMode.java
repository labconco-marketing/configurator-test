
package com.infor.pcm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigurationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConfigurationMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="InteractiveRuleset"/&gt;
 *     &lt;enumeration value="PostConfigurationRuleset"/&gt;
 *     &lt;enumeration value="Constraints"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfigurationMode")
@XmlEnum
public enum ConfigurationMode {

    @XmlEnumValue("InteractiveRuleset")
    INTERACTIVE_RULESET("InteractiveRuleset"),
    @XmlEnumValue("PostConfigurationRuleset")
    POST_CONFIGURATION_RULESET("PostConfigurationRuleset"),
    @XmlEnumValue("Constraints")
    CONSTRAINTS("Constraints");
    private final String value;

    ConfigurationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationMode fromValue(String v) {
        for (ConfigurationMode c: ConfigurationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
