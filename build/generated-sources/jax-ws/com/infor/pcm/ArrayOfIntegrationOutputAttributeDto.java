
package com.infor.pcm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIntegrationOutputAttributeDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIntegrationOutputAttributeDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntegrationOutputAttributeDto" type="{http://infor.com/pcm/v3}IntegrationOutputAttributeDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIntegrationOutputAttributeDto", propOrder = {
    "integrationOutputAttributeDto"
})
public class ArrayOfIntegrationOutputAttributeDto {

    @XmlElement(name = "IntegrationOutputAttributeDto", nillable = true)
    protected List<IntegrationOutputAttributeDto> integrationOutputAttributeDto;

    /**
     * Gets the value of the integrationOutputAttributeDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integrationOutputAttributeDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegrationOutputAttributeDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntegrationOutputAttributeDto }
     * 
     * 
     */
    public List<IntegrationOutputAttributeDto> getIntegrationOutputAttributeDto() {
        if (integrationOutputAttributeDto == null) {
            integrationOutputAttributeDto = new ArrayList<IntegrationOutputAttributeDto>();
        }
        return this.integrationOutputAttributeDto;
    }

}
