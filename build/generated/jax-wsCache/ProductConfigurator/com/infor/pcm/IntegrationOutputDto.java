
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntegrationOutputDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntegrationOutputDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://infor.com/pcm/v3}BaseDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Attributes" type="{http://infor.com/pcm/v3}ArrayOfIntegrationOutputAttributeDto"/&gt;
 *         &lt;element name="IntegrationOutputId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TemplateName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegrationOutputDto", propOrder = {
    "attributes",
    "integrationOutputId",
    "templateName"
})
public class IntegrationOutputDto
    extends BaseDto
{

    @XmlElement(name = "Attributes", required = true, nillable = true)
    protected ArrayOfIntegrationOutputAttributeDto attributes;
    @XmlElement(name = "IntegrationOutputId", required = true, nillable = true)
    protected String integrationOutputId;
    @XmlElement(name = "TemplateName", required = true, nillable = true)
    protected String templateName;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIntegrationOutputAttributeDto }
     *     
     */
    public ArrayOfIntegrationOutputAttributeDto getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIntegrationOutputAttributeDto }
     *     
     */
    public void setAttributes(ArrayOfIntegrationOutputAttributeDto value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the integrationOutputId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationOutputId() {
        return integrationOutputId;
    }

    /**
     * Sets the value of the integrationOutputId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationOutputId(String value) {
        this.integrationOutputId = value;
    }

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

}
