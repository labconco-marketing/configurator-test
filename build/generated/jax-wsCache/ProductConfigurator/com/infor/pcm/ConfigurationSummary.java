
package com.infor.pcm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigurationSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommitParameters" type="{http://infor.com/pcm/v3}ArrayOfCommitParameter"/&gt;
 *         &lt;element name="Content" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="DetailId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HeaderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InputParameters" type="{http://infor.com/pcm/v3}InputParameters"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderDetails" type="{http://infor.com/pcm/v3}ArrayOfDetail"/&gt;
 *         &lt;element name="PricingDetails" type="{http://infor.com/pcm/v3}ArrayOfDetail"/&gt;
 *         &lt;element name="ProofingDetails" type="{http://infor.com/pcm/v3}ArrayOfDetail" minOccurs="0"/&gt;
 *         &lt;element name="Result" type="{http://infor.com/pcm/v3}ConfigurationResult"/&gt;
 *         &lt;element name="SummaryDetails" type="{http://infor.com/pcm/v3}ArrayOfSummaryDetail"/&gt;
 *         &lt;element name="VariantKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationSummary", propOrder = {
    "commitParameters",
    "content",
    "detailId",
    "headerId",
    "inputParameters",
    "message",
    "orderDetails",
    "pricingDetails",
    "proofingDetails",
    "result",
    "summaryDetails",
    "variantKey"
})
public class ConfigurationSummary {

    @XmlElement(name = "CommitParameters", required = true, nillable = true)
    protected ArrayOfCommitParameter commitParameters;
    @XmlElementRef(name = "Content", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> content;
    @XmlElement(name = "DetailId", required = true, nillable = true)
    protected String detailId;
    @XmlElement(name = "HeaderId", required = true, nillable = true)
    protected String headerId;
    @XmlElement(name = "InputParameters", required = true, nillable = true)
    protected InputParameters inputParameters;
    @XmlElement(name = "Message", required = true, nillable = true)
    protected String message;
    @XmlElement(name = "OrderDetails", required = true, nillable = true)
    protected ArrayOfDetail orderDetails;
    @XmlElement(name = "PricingDetails", required = true, nillable = true)
    protected ArrayOfDetail pricingDetails;
    @XmlElementRef(name = "ProofingDetails", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetail> proofingDetails;
    @XmlElement(name = "Result", required = true)
    @XmlSchemaType(name = "string")
    protected ConfigurationResult result;
    @XmlElement(name = "SummaryDetails", required = true, nillable = true)
    protected ArrayOfSummaryDetail summaryDetails;
    @XmlElement(name = "VariantKey", required = true, nillable = true)
    protected String variantKey;

    /**
     * Gets the value of the commitParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommitParameter }
     *     
     */
    public ArrayOfCommitParameter getCommitParameters() {
        return commitParameters;
    }

    /**
     * Sets the value of the commitParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommitParameter }
     *     
     */
    public void setCommitParameters(ArrayOfCommitParameter value) {
        this.commitParameters = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setContent(JAXBElement<ArrayOfstring> value) {
        this.content = value;
    }

    /**
     * Gets the value of the detailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailId() {
        return detailId;
    }

    /**
     * Sets the value of the detailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailId(String value) {
        this.detailId = value;
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
     * Gets the value of the inputParameters property.
     * 
     * @return
     *     possible object is
     *     {@link InputParameters }
     *     
     */
    public InputParameters getInputParameters() {
        return inputParameters;
    }

    /**
     * Sets the value of the inputParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputParameters }
     *     
     */
    public void setInputParameters(InputParameters value) {
        this.inputParameters = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the orderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDetail }
     *     
     */
    public ArrayOfDetail getOrderDetails() {
        return orderDetails;
    }

    /**
     * Sets the value of the orderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDetail }
     *     
     */
    public void setOrderDetails(ArrayOfDetail value) {
        this.orderDetails = value;
    }

    /**
     * Gets the value of the pricingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDetail }
     *     
     */
    public ArrayOfDetail getPricingDetails() {
        return pricingDetails;
    }

    /**
     * Sets the value of the pricingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDetail }
     *     
     */
    public void setPricingDetails(ArrayOfDetail value) {
        this.pricingDetails = value;
    }

    /**
     * Gets the value of the proofingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetail> getProofingDetails() {
        return proofingDetails;
    }

    /**
     * Sets the value of the proofingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetail }{@code >}
     *     
     */
    public void setProofingDetails(JAXBElement<ArrayOfDetail> value) {
        this.proofingDetails = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationResult }
     *     
     */
    public ConfigurationResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationResult }
     *     
     */
    public void setResult(ConfigurationResult value) {
        this.result = value;
    }

    /**
     * Gets the value of the summaryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSummaryDetail }
     *     
     */
    public ArrayOfSummaryDetail getSummaryDetails() {
        return summaryDetails;
    }

    /**
     * Sets the value of the summaryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSummaryDetail }
     *     
     */
    public void setSummaryDetails(ArrayOfSummaryDetail value) {
        this.summaryDetails = value;
    }

    /**
     * Gets the value of the variantKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariantKey() {
        return variantKey;
    }

    /**
     * Sets the value of the variantKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariantKey(String value) {
        this.variantKey = value;
    }

}
