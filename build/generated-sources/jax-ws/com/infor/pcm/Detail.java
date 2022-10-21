
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Detail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Detail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataType" type="{http://infor.com/pcm/v3}DataType"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DetailSequence" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PrintCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PrintSequence" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SimpleValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Type" type="{http://infor.com/pcm/v3}DetailType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Detail", propOrder = {
    "dataType",
    "description",
    "detailSequence",
    "printCode",
    "printSequence",
    "simpleValue",
    "type"
})
public class Detail {

    @XmlElement(name = "DataType", required = true)
    @XmlSchemaType(name = "string")
    protected DataType dataType;
    @XmlElement(name = "Description", required = true, nillable = true)
    protected String description;
    @XmlElement(name = "DetailSequence")
    protected int detailSequence;
    @XmlElement(name = "PrintCode", required = true, nillable = true)
    protected String printCode;
    @XmlElement(name = "PrintSequence")
    protected int printSequence;
    @XmlElement(name = "SimpleValue", required = true, nillable = true)
    protected String simpleValue;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected DetailType type;

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setDataType(DataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the detailSequence property.
     * 
     */
    public int getDetailSequence() {
        return detailSequence;
    }

    /**
     * Sets the value of the detailSequence property.
     * 
     */
    public void setDetailSequence(int value) {
        this.detailSequence = value;
    }

    /**
     * Gets the value of the printCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintCode() {
        return printCode;
    }

    /**
     * Sets the value of the printCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintCode(String value) {
        this.printCode = value;
    }

    /**
     * Gets the value of the printSequence property.
     * 
     */
    public int getPrintSequence() {
        return printSequence;
    }

    /**
     * Sets the value of the printSequence property.
     * 
     */
    public void setPrintSequence(int value) {
        this.printSequence = value;
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
     *     {@link DetailType }
     *     
     */
    public DetailType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailType }
     *     
     */
    public void setType(DetailType value) {
        this.type = value;
    }

}
