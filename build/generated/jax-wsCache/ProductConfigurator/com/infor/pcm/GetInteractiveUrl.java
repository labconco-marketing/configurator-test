
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
 *         &lt;element name="inputParameters" type="{http://infor.com/pcm/v3}InputParameters" minOccurs="0"/&gt;
 *         &lt;element name="pageCaption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redirectUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "inputParameters",
    "pageCaption",
    "redirectUrl"
})
@XmlRootElement(name = "GetInteractiveUrl")
public class GetInteractiveUrl {

    @XmlElementRef(name = "inputParameters", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<InputParameters> inputParameters;
    @XmlElementRef(name = "pageCaption", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pageCaption;
    @XmlElementRef(name = "redirectUrl", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redirectUrl;

    /**
     * Gets the value of the inputParameters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InputParameters }{@code >}
     *     
     */
    public JAXBElement<InputParameters> getInputParameters() {
        return inputParameters;
    }

    /**
     * Sets the value of the inputParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InputParameters }{@code >}
     *     
     */
    public void setInputParameters(JAXBElement<InputParameters> value) {
        this.inputParameters = value;
    }

    /**
     * Gets the value of the pageCaption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPageCaption() {
        return pageCaption;
    }

    /**
     * Sets the value of the pageCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPageCaption(JAXBElement<String> value) {
        this.pageCaption = value;
    }

    /**
     * Gets the value of the redirectUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Sets the value of the redirectUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedirectUrl(JAXBElement<String> value) {
        this.redirectUrl = value;
    }

}
