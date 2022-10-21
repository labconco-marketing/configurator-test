
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkInstructionDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkInstructionDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://infor.com/pcm/v3}BaseDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Attributes" type="{http://infor.com/pcm/v3}ArrayOfAttributeDto"/&gt;
 *         &lt;element name="InstructionNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OperationId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkInstructionDto", propOrder = {
    "attributes",
    "instructionNo",
    "operationId"
})
public class WorkInstructionDto
    extends BaseDto
{

    @XmlElement(name = "Attributes", required = true, nillable = true)
    protected ArrayOfAttributeDto attributes;
    @XmlElement(name = "InstructionNo", required = true, nillable = true)
    protected String instructionNo;
    @XmlElement(name = "OperationId")
    protected long operationId;

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
     * Gets the value of the instructionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructionNo() {
        return instructionNo;
    }

    /**
     * Sets the value of the instructionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructionNo(String value) {
        this.instructionNo = value;
    }

    /**
     * Gets the value of the operationId property.
     * 
     */
    public long getOperationId() {
        return operationId;
    }

    /**
     * Sets the value of the operationId property.
     * 
     */
    public void setOperationId(long value) {
        this.operationId = value;
    }

}
