
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntegrationParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntegrationParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://infor.com/pcm/v3}Parameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsJsonObject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegrationParameter", propOrder = {
    "isJsonObject"
})
public class IntegrationParameter
    extends Parameter
{

    @XmlElement(name = "IsJsonObject")
    protected Boolean isJsonObject;

    /**
     * Gets the value of the isJsonObject property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsJsonObject() {
        return isJsonObject;
    }

    /**
     * Sets the value of the isJsonObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsJsonObject(Boolean value) {
        this.isJsonObject = value;
    }

}
