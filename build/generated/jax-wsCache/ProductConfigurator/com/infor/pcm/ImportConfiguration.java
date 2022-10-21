
package com.infor.pcm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="application" type="{http://infor.com/pcm/v3}Application" minOccurs="0"/&gt;
 *         &lt;element name="sourceConfigurationXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="targetHeaderDetail" type="{http://infor.com/pcm/v3}HeaderDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "application",
    "sourceConfigurationXml",
    "targetHeaderDetail"
})
@XmlRootElement(name = "ImportConfiguration")
public class ImportConfiguration {

    @XmlElementRef(name = "application", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<Application> application;
    @XmlElementRef(name = "sourceConfigurationXml", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceConfigurationXml;
    @XmlElementRef(name = "targetHeaderDetail", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<HeaderDetail> targetHeaderDetail;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Application }{@code >}
     *     
     */
    public JAXBElement<Application> getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Application }{@code >}
     *     
     */
    public void setApplication(JAXBElement<Application> value) {
        this.application = value;
    }

    /**
     * Gets the value of the sourceConfigurationXml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceConfigurationXml() {
        return sourceConfigurationXml;
    }

    /**
     * Sets the value of the sourceConfigurationXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceConfigurationXml(JAXBElement<String> value) {
        this.sourceConfigurationXml = value;
    }

    /**
     * Gets the value of the targetHeaderDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     *     
     */
    public JAXBElement<HeaderDetail> getTargetHeaderDetail() {
        return targetHeaderDetail;
    }

    /**
     * Sets the value of the targetHeaderDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     *     
     */
    public void setTargetHeaderDetail(JAXBElement<HeaderDetail> value) {
        this.targetHeaderDetail = value;
    }

}
