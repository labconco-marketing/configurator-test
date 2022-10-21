
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BomComponentDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BomComponentDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://infor.com/pcm/v3}BaseDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Attributes" type="{http://infor.com/pcm/v3}ArrayOfAttributeDto"/&gt;
 *         &lt;element name="ComponentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ConsumedOperationId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ConsumedOperationNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IsComponent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MfgDetails" type="{http://infor.com/pcm/v3}ArrayOfMfgDetailDto"/&gt;
 *         &lt;element name="Operations" type="{http://infor.com/pcm/v3}ArrayOfOperationDto"/&gt;
 *         &lt;element name="ParentId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BomComponentDto", propOrder = {
    "attributes",
    "componentName",
    "consumedOperationId",
    "consumedOperationNo",
    "isComponent",
    "mfgDetails",
    "operations",
    "parentId"
})
public class BomComponentDto
    extends BaseDto
{

    @XmlElement(name = "Attributes", required = true, nillable = true)
    protected ArrayOfAttributeDto attributes;
    @XmlElement(name = "ComponentName", required = true, nillable = true)
    protected String componentName;
    @XmlElement(name = "ConsumedOperationId", required = true, type = Long.class, nillable = true)
    protected Long consumedOperationId;
    @XmlElement(name = "ConsumedOperationNo", required = true, nillable = true)
    protected String consumedOperationNo;
    @XmlElement(name = "IsComponent")
    protected boolean isComponent;
    @XmlElement(name = "MfgDetails", required = true, nillable = true)
    protected ArrayOfMfgDetailDto mfgDetails;
    @XmlElement(name = "Operations", required = true, nillable = true)
    protected ArrayOfOperationDto operations;
    @XmlElement(name = "ParentId", required = true, type = Long.class, nillable = true)
    protected Long parentId;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttributeDto }
     *     
     */
    public ArrayOfAttributeDto getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttributeDto }
     *     
     */
    public void setAttributes(ArrayOfAttributeDto value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the componentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentName() {
        return componentName;
    }

    /**
     * Sets the value of the componentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentName(String value) {
        this.componentName = value;
    }

    /**
     * Gets the value of the consumedOperationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsumedOperationId() {
        return consumedOperationId;
    }

    /**
     * Sets the value of the consumedOperationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsumedOperationId(Long value) {
        this.consumedOperationId = value;
    }

    /**
     * Gets the value of the consumedOperationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumedOperationNo() {
        return consumedOperationNo;
    }

    /**
     * Sets the value of the consumedOperationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumedOperationNo(String value) {
        this.consumedOperationNo = value;
    }

    /**
     * Gets the value of the isComponent property.
     * 
     */
    public boolean isIsComponent() {
        return isComponent;
    }

    /**
     * Sets the value of the isComponent property.
     * 
     */
    public void setIsComponent(boolean value) {
        this.isComponent = value;
    }

    /**
     * Gets the value of the mfgDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMfgDetailDto }
     *     
     */
    public ArrayOfMfgDetailDto getMfgDetails() {
        return mfgDetails;
    }

    /**
     * Sets the value of the mfgDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMfgDetailDto }
     *     
     */
    public void setMfgDetails(ArrayOfMfgDetailDto value) {
        this.mfgDetails = value;
    }

    /**
     * Gets the value of the operations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOperationDto }
     *     
     */
    public ArrayOfOperationDto getOperations() {
        return operations;
    }

    /**
     * Sets the value of the operations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOperationDto }
     *     
     */
    public void setOperations(ArrayOfOperationDto value) {
        this.operations = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentId(Long value) {
        this.parentId = value;
    }

}
