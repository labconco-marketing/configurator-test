
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComponentDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://infor.com/pcm/v3}BaseDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComponentAttributes" type="{http://infor.com/pcm/v3}ArrayOfComponentAttributeDto"/&gt;
 *         &lt;element name="ComponentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ComponentSequence" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Details" type="{http://infor.com/pcm/v3}ArrayOfDetailDto"/&gt;
 *         &lt;element name="Namespace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ParentId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="RulesetName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentDto", propOrder = {
    "componentAttributes",
    "componentName",
    "componentSequence",
    "details",
    "namespace",
    "parentId",
    "rulesetName"
})
public class ComponentDto
    extends BaseDto
{

    @XmlElement(name = "ComponentAttributes", required = true, nillable = true)
    protected ArrayOfComponentAttributeDto componentAttributes;
    @XmlElement(name = "ComponentName", required = true, nillable = true)
    protected String componentName;
    @XmlElement(name = "ComponentSequence")
    protected int componentSequence;
    @XmlElement(name = "Details", required = true, nillable = true)
    protected ArrayOfDetailDto details;
    @XmlElement(name = "Namespace", required = true, nillable = true)
    protected String namespace;
    @XmlElement(name = "ParentId", required = true, type = Long.class, nillable = true)
    protected Long parentId;
    @XmlElement(name = "RulesetName", required = true, nillable = true)
    protected String rulesetName;

    /**
     * Gets the value of the componentAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfComponentAttributeDto }
     *     
     */
    public ArrayOfComponentAttributeDto getComponentAttributes() {
        return componentAttributes;
    }

    /**
     * Sets the value of the componentAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfComponentAttributeDto }
     *     
     */
    public void setComponentAttributes(ArrayOfComponentAttributeDto value) {
        this.componentAttributes = value;
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
     * Gets the value of the componentSequence property.
     * 
     */
    public int getComponentSequence() {
        return componentSequence;
    }

    /**
     * Sets the value of the componentSequence property.
     * 
     */
    public void setComponentSequence(int value) {
        this.componentSequence = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDetailDto }
     *     
     */
    public ArrayOfDetailDto getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDetailDto }
     *     
     */
    public void setDetails(ArrayOfDetailDto value) {
        this.details = value;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
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

    /**
     * Gets the value of the rulesetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRulesetName() {
        return rulesetName;
    }

    /**
     * Sets the value of the rulesetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRulesetName(String value) {
        this.rulesetName = value;
    }

}
