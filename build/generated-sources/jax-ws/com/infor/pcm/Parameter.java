
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Parameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Parameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsNull" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SimpleValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Type" type="{http://infor.com/pcm/v3}DataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parameter", propOrder = {
    "isNull",
    "name",
    "simpleValue",
    "type"
})
@XmlSeeAlso({
    IntegrationParameter.class,
    CommitParameter.class
})
public class Parameter {

    @XmlElement(name = "IsNull")
    protected boolean isNull;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "SimpleValue", required = true, nillable = true)
    protected String simpleValue;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected DataType type;

    /**
     * Gets the value of the isNull property.
     * 
     */
    public boolean isIsNull() {
        return isNull;
    }

    /**
     * Sets the value of the isNull property.
     * 
     */
    public void setIsNull(boolean value) {
        this.isNull = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the simpleValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimpleValue() {
        return simpleValue;
    }

    /**
     * Sets the value of the simpleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimpleValue(String value) {
        this.simpleValue = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setType(DataType value) {
        this.type = value;
    }

}
