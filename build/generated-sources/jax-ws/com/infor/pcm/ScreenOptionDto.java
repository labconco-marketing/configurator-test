
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScreenOptionDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScreenOptionDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://infor.com/pcm/v3}BaseDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Caption" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ComponentAttributeId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="DataType" type="{http://infor.com/pcm/v3}DataType"/&gt;
 *         &lt;element name="Locked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PrintCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ScreenId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ValueDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ScreenOptionDto", propOrder = {
    "caption",
    "componentAttributeId",
    "dataType",
    "locked",
    "printCode",
    "screenId",
    "sequence",
    "valueDescription",
    "visible"
})
public class ScreenOptionDto
    extends BaseDto
{

    @XmlElement(name = "Caption", required = true, nillable = true)
    protected String caption;
    @XmlElement(name = "ComponentAttributeId", required = true, type = Long.class, nillable = true)
    protected Long componentAttributeId;
    @XmlElement(name = "DataType", required = true)
    @XmlSchemaType(name = "string")
    protected DataType dataType;
    @XmlElement(name = "Locked")
    protected boolean locked;
    @XmlElement(name = "PrintCode", required = true, nillable = true)
    protected String printCode;
    @XmlElement(name = "ScreenId")
    protected long screenId;
    @XmlElement(name = "Sequence")
    protected int sequence;
    @XmlElement(name = "ValueDescription", required = true, nillable = true)
    protected String valueDescription;
    @XmlElement(name = "Visible")
    protected boolean visible;

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Gets the value of the componentAttributeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getComponentAttributeId() {
        return componentAttributeId;
    }

    /**
     * Sets the value of the componentAttributeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setComponentAttributeId(Long value) {
        this.componentAttributeId = value;
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
     * Gets the value of the locked property.
     * 
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     */
    public void setLocked(boolean value) {
        this.locked = value;
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
     * Gets the value of the screenId property.
     * 
     */
    public long getScreenId() {
        return screenId;
    }

    /**
     * Sets the value of the screenId property.
     * 
     */
    public void setScreenId(long value) {
        this.screenId = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     */
    public int getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     */
    public void setSequence(int value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the valueDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueDescription() {
        return valueDescription;
    }

    /**
     * Sets the value of the valueDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueDescription(String value) {
        this.valueDescription = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     */
    public void setVisible(boolean value) {
        this.visible = value;
    }

}
