
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummaryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PrintCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PrintSequence" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryDetail", propOrder = {
    "description",
    "printCode",
    "printSequence",
    "value"
})
public class SummaryDetail {

    @XmlElement(name = "Description", required = true, nillable = true)
    protected String description;
    @XmlElement(name = "PrintCode", required = true, nillable = true)
    protected String printCode;
    @XmlElement(name = "PrintSequence")
    protected int printSequence;
    @XmlElement(name = "Value", required = true, nillable = true)
    protected String value;

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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
