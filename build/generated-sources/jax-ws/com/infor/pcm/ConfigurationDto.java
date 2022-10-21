
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigurationDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://infor.com/pcm/v3}BaseDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicationServerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BomComponents" type="{http://infor.com/pcm/v3}ArrayOfBomComponentDto"/&gt;
 *         &lt;element name="Components" type="{http://infor.com/pcm/v3}ArrayOfComponentDto"/&gt;
 *         &lt;element name="ConfigurationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HeaderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InProgressInputParametersXml" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InProgressOutputParametersXml" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InputParametersXml" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IntegrationOutputs" type="{http://infor.com/pcm/v3}ArrayOfIntegrationOutputDto"/&gt;
 *         &lt;element name="OutputParametersXml" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Pages" type="{http://infor.com/pcm/v3}ArrayOfPageDto"/&gt;
 *         &lt;element name="Partial" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ResourceLinkRoot" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResourcePathRoot" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationDto", propOrder = {
    "applicationServerId",
    "bomComponents",
    "components",
    "configurationId",
    "headerId",
    "inProgressInputParametersXml",
    "inProgressOutputParametersXml",
    "inputParametersXml",
    "integrationOutputs",
    "outputParametersXml",
    "pages",
    "partial",
    "resourceLinkRoot",
    "resourcePathRoot"
})
public class ConfigurationDto
    extends BaseDto
{

    @XmlElement(name = "ApplicationServerId", required = true, nillable = true)
    protected String applicationServerId;
    @XmlElement(name = "BomComponents", required = true, nillable = true)
    protected ArrayOfBomComponentDto bomComponents;
    @XmlElement(name = "Components", required = true, nillable = true)
    protected ArrayOfComponentDto components;
    @XmlElement(name = "ConfigurationId", required = true, nillable = true)
    protected String configurationId;
    @XmlElement(name = "HeaderId", required = true, nillable = true)
    protected String headerId;
    @XmlElement(name = "InProgressInputParametersXml", required = true, nillable = true)
    protected String inProgressInputParametersXml;
    @XmlElement(name = "InProgressOutputParametersXml", required = true, nillable = true)
    protected String inProgressOutputParametersXml;
    @XmlElement(name = "InputParametersXml", required = true, nillable = true)
    protected String inputParametersXml;
    @XmlElement(name = "IntegrationOutputs", required = true, nillable = true)
    protected ArrayOfIntegrationOutputDto integrationOutputs;
    @XmlElement(name = "OutputParametersXml", required = true, nillable = true)
    protected String outputParametersXml;
    @XmlElement(name = "Pages", required = true, nillable = true)
    protected ArrayOfPageDto pages;
    @XmlElement(name = "Partial")
    protected boolean partial;
    @XmlElement(name = "ResourceLinkRoot", required = true, nillable = true)
    protected String resourceLinkRoot;
    @XmlElement(name = "ResourcePathRoot", required = true, nillable = true)
    protected String resourcePathRoot;

    /**
     * Gets the value of the applicationServerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationServerId() {
        return applicationServerId;
    }

    /**
     * Sets the value of the applicationServerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationServerId(String value) {
        this.applicationServerId = value;
    }

    /**
     * Gets the value of the bomComponents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBomComponentDto }
     *     
     */
    public ArrayOfBomComponentDto getBomComponents() {
        return bomComponents;
    }

    /**
     * Sets the value of the bomComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBomComponentDto }
     *     
     */
    public void setBomComponents(ArrayOfBomComponentDto value) {
        this.bomComponents = value;
    }

    /**
     * Gets the value of the components property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfComponentDto }
     *     
     */
    public ArrayOfComponentDto getComponents() {
        return components;
    }

    /**
     * Sets the value of the components property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfComponentDto }
     *     
     */
    public void setComponents(ArrayOfComponentDto value) {
        this.components = value;
    }

    /**
     * Gets the value of the configurationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationId() {
        return configurationId;
    }

    /**
     * Sets the value of the configurationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationId(String value) {
        this.configurationId = value;
    }

    /**
     * Gets the value of the headerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderId() {
        return headerId;
    }

    /**
     * Sets the value of the headerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderId(String value) {
        this.headerId = value;
    }

    /**
     * Gets the value of the inProgressInputParametersXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProgressInputParametersXml() {
        return inProgressInputParametersXml;
    }

    /**
     * Sets the value of the inProgressInputParametersXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProgressInputParametersXml(String value) {
        this.inProgressInputParametersXml = value;
    }

    /**
     * Gets the value of the inProgressOutputParametersXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProgressOutputParametersXml() {
        return inProgressOutputParametersXml;
    }

    /**
     * Sets the value of the inProgressOutputParametersXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProgressOutputParametersXml(String value) {
        this.inProgressOutputParametersXml = value;
    }

    /**
     * Gets the value of the inputParametersXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputParametersXml() {
        return inputParametersXml;
    }

    /**
     * Sets the value of the inputParametersXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputParametersXml(String value) {
        this.inputParametersXml = value;
    }

    /**
     * Gets the value of the integrationOutputs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIntegrationOutputDto }
     *     
     */
    public ArrayOfIntegrationOutputDto getIntegrationOutputs() {
        return integrationOutputs;
    }

    /**
     * Sets the value of the integrationOutputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIntegrationOutputDto }
     *     
     */
    public void setIntegrationOutputs(ArrayOfIntegrationOutputDto value) {
        this.integrationOutputs = value;
    }

    /**
     * Gets the value of the outputParametersXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputParametersXml() {
        return outputParametersXml;
    }

    /**
     * Sets the value of the outputParametersXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputParametersXml(String value) {
        this.outputParametersXml = value;
    }

    /**
     * Gets the value of the pages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPageDto }
     *     
     */
    public ArrayOfPageDto getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPageDto }
     *     
     */
    public void setPages(ArrayOfPageDto value) {
        this.pages = value;
    }

    /**
     * Gets the value of the partial property.
     * 
     */
    public boolean isPartial() {
        return partial;
    }

    /**
     * Sets the value of the partial property.
     * 
     */
    public void setPartial(boolean value) {
        this.partial = value;
    }

    /**
     * Gets the value of the resourceLinkRoot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceLinkRoot() {
        return resourceLinkRoot;
    }

    /**
     * Sets the value of the resourceLinkRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceLinkRoot(String value) {
        this.resourceLinkRoot = value;
    }

    /**
     * Gets the value of the resourcePathRoot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourcePathRoot() {
        return resourcePathRoot;
    }

    /**
     * Sets the value of the resourcePathRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourcePathRoot(String value) {
        this.resourcePathRoot = value;
    }

}
