
package com.infor.pcm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIntegrationOutputDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIntegrationOutputDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntegrationOutputDto" type="{http://infor.com/pcm/v3}IntegrationOutputDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIntegrationOutputDto", propOrder = {
    "integrationOutputDto"
})
public class ArrayOfIntegrationOutputDto {

    @XmlElement(name = "IntegrationOutputDto", nillable = true)
    protected List<IntegrationOutputDto> integrationOutputDto;

    /**
     * Gets the value of the integrationOutputDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integrationOutputDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegrationOutputDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntegrationOutputDto }
     * 
     * 
     */
    public List<IntegrationOutputDto> getIntegrationOutputDto() {
        if (integrationOutputDto == null) {
            integrationOutputDto = new ArrayList<IntegrationOutputDto>();
        }
        return this.integrationOutputDto;
    }

}
