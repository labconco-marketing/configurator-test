
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="GetQueuedStatusResult" type="{http://infor.com/pcm/v3}QueueStatus" minOccurs="0"/&gt;
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
    "getQueuedStatusResult"
})
@XmlRootElement(name = "GetQueuedStatusResponse")
public class GetQueuedStatusResponse {

    @XmlElement(name = "GetQueuedStatusResult")
    @XmlSchemaType(name = "string")
    protected QueueStatus getQueuedStatusResult;

    /**
     * Gets the value of the getQueuedStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link QueueStatus }
     *     
     */
    public QueueStatus getGetQueuedStatusResult() {
        return getQueuedStatusResult;
    }

    /**
     * Sets the value of the getQueuedStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueStatus }
     *     
     */
    public void setGetQueuedStatusResult(QueueStatus value) {
        this.getQueuedStatusResult = value;
    }

}
