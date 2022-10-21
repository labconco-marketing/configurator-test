
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://infor.com/pcm/v3}BaseDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Attributes" type="{http://infor.com/pcm/v3}ArrayOfAttributeDto"/&gt;
 *         &lt;element name="BomComponenetId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="OperationNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WorkInstructions" type="{http://infor.com/pcm/v3}ArrayOfWorkInstructionDto"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationDto", propOrder = {
    "attributes",
    "bomComponenetId",
    "operationNo",
    "workInstructions"
})
public class OperationDto
    extends BaseDto
{

    @XmlElement(name = "Attributes", required = true, nillable = true)
    protected ArrayOfAttributeDto attributes;
    @XmlElement(name = "BomComponenetId")
    protected long bomComponenetId;
    @XmlElement(name = "OperationNo", required = true, nillable = true)
    protected String operationNo;
    @XmlElement(name = "WorkInstructions", required = true, nillable = true)
    protected ArrayOfWorkInstructionDto workInstructions;

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
     * Gets the value of the bomComponenetId property.
     * 
     */
    public long getBomComponenetId() {
        return bomComponenetId;
    }

    /**
     * Sets the value of the bomComponenetId property.
     * 
     */
    public void setBomComponenetId(long value) {
        this.bomComponenetId = value;
    }

    /**
     * Gets the value of the operationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationNo() {
        return operationNo;
    }

    /**
     * Sets the value of the operationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationNo(String value) {
        this.operationNo = value;
    }

    /**
     * Gets the value of the workInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorkInstructionDto }
     *     
     */
    public ArrayOfWorkInstructionDto getWorkInstructions() {
        return workInstructions;
    }

    /**
     * Sets the value of the workInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorkInstructionDto }
     *     
     */
    public void setWorkInstructions(ArrayOfWorkInstructionDto value) {
        this.workInstructions = value;
    }

}
