
package com.infor.pcm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBomComponentDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBomComponentDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BomComponentDto" type="{http://infor.com/pcm/v3}BomComponentDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBomComponentDto", propOrder = {
    "bomComponentDto"
})
public class ArrayOfBomComponentDto {

    @XmlElement(name = "BomComponentDto", nillable = true)
    protected List<BomComponentDto> bomComponentDto;

    /**
     * Gets the value of the bomComponentDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bomComponentDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBomComponentDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BomComponentDto }
     * 
     * 
     */
    public List<BomComponentDto> getBomComponentDto() {
        if (bomComponentDto == null) {
            bomComponentDto = new ArrayList<BomComponentDto>();
        }
        return this.bomComponentDto;
    }

}
