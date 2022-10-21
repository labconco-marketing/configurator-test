
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
 *         &lt;element name="LoadUIDataResult" type="{http://infor.com/pcm/v3}ArrayOfPageDto" minOccurs="0"/&gt;
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
    "loadUIDataResult"
})
@XmlRootElement(name = "LoadUIDataResponse")
public class LoadUIDataResponse {

    @XmlElementRef(name = "LoadUIDataResult", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPageDto> loadUIDataResult;

    /**
     * Gets the value of the loadUIDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPageDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPageDto> getLoadUIDataResult() {
        return loadUIDataResult;
    }

    /**
     * Sets the value of the loadUIDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPageDto }{@code >}
     *     
     */
    public void setLoadUIDataResult(JAXBElement<ArrayOfPageDto> value) {
        this.loadUIDataResult = value;
    }

}
