
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
 *         &lt;element name="contractApplication" type="{http://infor.com/pcm/v3}Application" minOccurs="0"/&gt;
 *         &lt;element name="headerDetail" type="{http://infor.com/pcm/v3}HeaderDetail" minOccurs="0"/&gt;
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
    "contractApplication",
    "headerDetail"
})
@XmlRootElement(name = "LoadInprogressInputParameters")
public class LoadInprogressInputParameters {

    @XmlElementRef(name = "contractApplication", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<Application> contractApplication;
    @XmlElementRef(name = "headerDetail", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<HeaderDetail> headerDetail;

    /**
     * Gets the value of the contractApplication property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Application }{@code >}
     *     
     */
    public JAXBElement<Application> getContractApplication() {
        return contractApplication;
    }

    /**
     * Sets the value of the contractApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Application }{@code >}
     *     
     */
    public void setContractApplication(JAXBElement<Application> value) {
        this.contractApplication = value;
    }

    /**
     * Gets the value of the headerDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     *     
     */
    public JAXBElement<HeaderDetail> getHeaderDetail() {
        return headerDetail;
    }

    /**
     * Sets the value of the headerDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     *     
     */
    public void setHeaderDetail(JAXBElement<HeaderDetail> value) {
        this.headerDetail = value;
    }

}
