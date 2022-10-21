
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
 *         &lt;element name="headerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "headerId",
    "detailId"
})
@XmlRootElement(name = "Exists")
public class Exists {

    @XmlElementRef(name = "contractApplication", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<Application> contractApplication;
    @XmlElementRef(name = "headerId", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> headerId;
    @XmlElementRef(name = "detailId", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> detailId;

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
     * Gets the value of the headerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHeaderId() {
        return headerId;
    }

    /**
     * Sets the value of the headerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHeaderId(JAXBElement<String> value) {
        this.headerId = value;
    }

    /**
     * Gets the value of the detailId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDetailId() {
        return detailId;
    }

    /**
     * Sets the value of the detailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDetailId(JAXBElement<String> value) {
        this.detailId = value;
    }

}
