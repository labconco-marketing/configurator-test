
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
 *         &lt;element name="queueConfigurationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "queueConfigurationType"
})
@XmlRootElement(name = "QueueConfiguration")
public class QueueConfiguration {

    @XmlElementRef(name = "inputParameters", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<InputParameters> inputParameters;
    @XmlElementRef(name = "queueConfigurationType", namespace = "http://infor.com/pcm/v3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> queueConfigurationType;

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
     * Gets the value of the queueConfigurationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQueueConfigurationType() {
        return queueConfigurationType;
    }

    /**
     * Sets the value of the queueConfigurationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQueueConfigurationType(JAXBElement<String> value) {
        this.queueConfigurationType = value;
    }

}
