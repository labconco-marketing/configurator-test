
package com.infor.pcm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfComponentAttributeDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfComponentAttributeDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComponentAttributeDto" type="{http://infor.com/pcm/v3}ComponentAttributeDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfComponentAttributeDto", propOrder = {
    "componentAttributeDto"
})
public class ArrayOfComponentAttributeDto {

    @XmlElement(name = "ComponentAttributeDto", nillable = true)
    protected List<ComponentAttributeDto> componentAttributeDto;

    /**
     * Gets the value of the componentAttributeDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentAttributeDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentAttributeDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentAttributeDto }
     * 
     * 
     */
    public List<ComponentAttributeDto> getComponentAttributeDto() {
        if (componentAttributeDto == null) {
            componentAttributeDto = new ArrayList<ComponentAttributeDto>();
        }
        return this.componentAttributeDto;
    }

}
