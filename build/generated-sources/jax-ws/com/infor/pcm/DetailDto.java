
package com.infor.pcm;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://infor.com/pcm/v3}BaseDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComponentId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="DataType" type="{http://infor.com/pcm/v3}DataType"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DetailSequence" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DetailValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PrintCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PrintSequence" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ReferenceVariable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Type" type="{http://infor.com/pcm/v3}DetailType"/&gt;
 *         &lt;element name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailDto", propOrder = {
    "componentId",
    "dataType",
    "description",
    "detailSequence",
    "detailValue",
    "printCode",
    "printSequence",
    "referenceVariable",
    "type",
    "visible"
})
public class DetailDto
    extends BaseDto
{

    @XmlElement(name = "ComponentId")
    protected long componentId;
    @XmlElement(name = "DataType", required = true)
    @XmlSchemaType(name = "string")
    protected DataType dataType;
    @XmlElement(name = "Description", required = true, nillable = true)
    protected String description;
    @XmlElement(name = "DetailSequence")
    protected int detailSequence;
    @XmlElement(name = "DetailValue", required = true, nillable = true)
    protected String detailValue;
    @XmlElement(name = "PrintCode", required = true, nillable = true)
    protected String printCode;
    @XmlElement(name = "PrintSequence", required = true, nillable = true)
    protected BigDecimal printSequence;
    @XmlElement(name = "ReferenceVariable", required = true, nillable = true)
    protected String referenceVariable;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected DetailType type;
    @XmlElement(name = "Visible", required = true, type = Boolean.class, nillable = true)
    protected Boolean visible;

    /**
     * Gets the value of the componentId property.
     * 
     */
    public long getComponentId() {
        return componentId;
    }

    /**
     * Sets the value of the componentId property.
     * 
     */
    public void setComponentId(long value) {
        this.componentId = value;
    }

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
     * Gets the value of the detailValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailValue() {
        return detailValue;
    }

    /**
     * Sets the value of the detailValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailValue(String value) {
        this.detailValue = value;
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
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrintSequence() {
        return printSequence;
    }

    /**
     * Sets the value of the printSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrintSequence(BigDecimal value) {
        this.printSequence = value;
    }

    /**
     * Gets the value of the referenceVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceVariable() {
        return referenceVariable;
    }

    /**
     * Sets the value of the referenceVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceVariable(String value) {
        this.referenceVariable = value;
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

    /**
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

}
