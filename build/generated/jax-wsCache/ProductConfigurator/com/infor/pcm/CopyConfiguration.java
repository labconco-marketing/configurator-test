
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
 *         &lt;element name="source" type="{http://infor.com/pcm/v3}HeaderDetail" minOccurs="0"/&gt;
 *         &lt;element name="target" type="{http://infor.com/pcm/v3}HeaderDetail" minOccurs="0"/&gt;
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
    "source",
    "target",
    "deleteSource",
    "overwriteTarget"
})
@XmlRootElement(name = "CopyConfiguration")
public class CopyConfiguration {

    @XmlElementRef(name = "application", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<Application> application;
    @XmlElementRef(name = "source", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<HeaderDetail> source;
    @XmlElementRef(name = "target", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<HeaderDetail> target;
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
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     *     
     */
    public JAXBElement<HeaderDetail> getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     *     
     */
    public void setSource(JAXBElement<HeaderDetail> value) {
        this.source = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     *     
     */
    public JAXBElement<HeaderDetail> getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     *     
     */
    public void setTarget(JAXBElement<HeaderDetail> value) {
        this.target = value;
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
