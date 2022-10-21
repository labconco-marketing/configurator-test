
package com.infor.pcm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfScreenOptionDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfScreenOptionDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScreenOptionDto" type="{http://infor.com/pcm/v3}ScreenOptionDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfScreenOptionDto", propOrder = {
    "screenOptionDto"
})
public class ArrayOfScreenOptionDto {

    @XmlElement(name = "ScreenOptionDto", nillable = true)
    protected List<ScreenOptionDto> screenOptionDto;

    /**
     * Gets the value of the screenOptionDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screenOptionDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreenOptionDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreenOptionDto }
     * 
     * 
     */
    public List<ScreenOptionDto> getScreenOptionDto() {
        if (screenOptionDto == null) {
            screenOptionDto = new ArrayList<ScreenOptionDto>();
        }
        return this.screenOptionDto;
    }

}
