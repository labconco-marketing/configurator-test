
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
 *         &lt;element name="GetDynamicContentResult" type="{http://infor.com/pcm/v3}ArrayOfFileContentDto" minOccurs="0"/&gt;
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
    "getDynamicContentResult"
})
@XmlRootElement(name = "GetDynamicContentResponse")
public class GetDynamicContentResponse {

    @XmlElementRef(name = "GetDynamicContentResult", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFileContentDto> getDynamicContentResult;

    /**
     * Gets the value of the getDynamicContentResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFileContentDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFileContentDto> getGetDynamicContentResult() {
        return getDynamicContentResult;
    }

    /**
     * Sets the value of the getDynamicContentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFileContentDto }{@code >}
     *     
     */
    public void setGetDynamicContentResult(JAXBElement<ArrayOfFileContentDto> value) {
        this.getDynamicContentResult = value;
    }

}
