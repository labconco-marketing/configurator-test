
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeaderDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DetailId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HeaderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderDetail", propOrder = {
    "detailId",
    "headerId"
})
public class HeaderDetail {

    @XmlElement(name = "DetailId", required = true, nillable = true)
    protected String detailId;
    @XmlElement(name = "HeaderId", required = true, nillable = true)
    protected String headerId;

    /**
     * Gets the value of the detailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailId() {
        return detailId;
    }

    /**
     * Sets the value of the detailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailId(String value) {
        this.detailId = value;
    }

    /**
     * Gets the value of the headerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderId() {
        return headerId;
    }

    /**
     * Sets the value of the headerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderId(String value) {
        this.headerId = value;
    }

}
