
package com.infor.pcm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWorkInstructionDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWorkInstructionDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WorkInstructionDto" type="{http://infor.com/pcm/v3}WorkInstructionDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWorkInstructionDto", propOrder = {
    "workInstructionDto"
})
public class ArrayOfWorkInstructionDto {

    @XmlElement(name = "WorkInstructionDto", nillable = true)
    protected List<WorkInstructionDto> workInstructionDto;

    /**
     * Gets the value of the workInstructionDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workInstructionDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkInstructionDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkInstructionDto }
     * 
     * 
     */
    public List<WorkInstructionDto> getWorkInstructionDto() {
        if (workInstructionDto == null) {
            workInstructionDto = new ArrayList<WorkInstructionDto>();
        }
        return this.workInstructionDto;
    }

}
