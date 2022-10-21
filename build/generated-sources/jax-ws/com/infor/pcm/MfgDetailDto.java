
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MfgDetailDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MfgDetailDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://infor.com/pcm/v3}BaseDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Attributes" type="{http://infor.com/pcm/v3}ArrayOfAttributeDto"/&gt;
 *         &lt;element name="BomComponentId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="CommentNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MfgDetailDto", propOrder = {
    "attributes",
    "bomComponentId",
    "commentNo"
})
public class MfgDetailDto
    extends BaseDto
{

    @XmlElement(name = "Attributes", required = true, nillable = true)
    protected ArrayOfAttributeDto attributes;
    @XmlElement(name = "BomComponentId")
    protected long bomComponentId;
    @XmlElement(name = "CommentNo", required = true, nillable = true)
    protected String commentNo;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttributeDto }
     *     
     */
    public ArrayOfAttributeDto getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttributeDto }
     *     
     */
    public void setAttributes(ArrayOfAttributeDto value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the bomComponentId property.
     * 
     */
    public long getBomComponentId() {
        return bomComponentId;
    }

    /**
     * Sets the value of the bomComponentId property.
     * 
     */
    public void setBomComponentId(long value) {
        this.bomComponentId = value;
    }

    /**
     * Gets the value of the commentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentNo() {
        return commentNo;
    }

    /**
     * Sets the value of the commentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentNo(String value) {
        this.commentNo = value;
    }

}
