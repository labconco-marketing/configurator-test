
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
 *         &lt;element name="LoadFullConfigurationResult" type="{http://infor.com/pcm/v3}ConfigurationDto" minOccurs="0"/&gt;
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
    "loadFullConfigurationResult"
})
@XmlRootElement(name = "LoadFullConfigurationResponse")
public class LoadFullConfigurationResponse {

    @XmlElementRef(name = "LoadFullConfigurationResult", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<ConfigurationDto> loadFullConfigurationResult;

    /**
     * Gets the value of the loadFullConfigurationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConfigurationDto }{@code >}
     *     
     */
    public JAXBElement<ConfigurationDto> getLoadFullConfigurationResult() {
        return loadFullConfigurationResult;
    }

    /**
     * Sets the value of the loadFullConfigurationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConfigurationDto }{@code >}
     *     
     */
    public void setLoadFullConfigurationResult(JAXBElement<ConfigurationDto> value) {
        this.loadFullConfigurationResult = value;
    }

}
