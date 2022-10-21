
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
 *         &lt;element name="sourceHeaderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="targetHeaderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deleteSource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="overwriteTarget" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "sourceHeaderId",
    "targetHeaderId",
    "deleteSource",
    "overwriteTarget"
})
@XmlRootElement(name = "CopyAllConfigurations")
public class CopyAllConfigurations {

    @XmlElementRef(name = "application", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<Application> application;
    @XmlElementRef(name = "sourceHeaderId", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceHeaderId;
    @XmlElementRef(name = "targetHeaderId", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> targetHeaderId;
    protected Boolean deleteSource;
    protected Boolean overwriteTarget;

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
     * Gets the value of the sourceHeaderId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceHeaderId() {
        return sourceHeaderId;
    }

    /**
     * Sets the value of the sourceHeaderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceHeaderId(JAXBElement<String> value) {
        this.sourceHeaderId = value;
    }

    /**
     * Gets the value of the targetHeaderId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTargetHeaderId() {
        return targetHeaderId;
    }

    /**
     * Sets the value of the targetHeaderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTargetHeaderId(JAXBElement<String> value) {
        this.targetHeaderId = value;
    }

    /**
     * Gets the value of the deleteSource property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteSource() {
        return deleteSource;
    }

    /**
     * Sets the value of the deleteSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteSource(Boolean value) {
        this.deleteSource = value;
    }

    /**
     * Gets the value of the overwriteTarget property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverwriteTarget() {
        return overwriteTarget;
    }

    /**
     * Sets the value of the overwriteTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverwriteTarget(Boolean value) {
        this.overwriteTarget = value;
    }

}
