
package com.infor.pcm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMfgTemplateAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMfgTemplateAttribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MfgTemplateAttribute" type="{http://infor.com/pcm/v3}MfgTemplateAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMfgTemplateAttribute", propOrder = {
    "mfgTemplateAttribute"
})
public class ArrayOfMfgTemplateAttribute {

    @XmlElement(name = "MfgTemplateAttribute", nillable = true)
    protected List<MfgTemplateAttribute> mfgTemplateAttribute;

    /**
     * Gets the value of the mfgTemplateAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mfgTemplateAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMfgTemplateAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MfgTemplateAttribute }
     * 
     * 
     */
    public List<MfgTemplateAttribute> getMfgTemplateAttribute() {
        if (mfgTemplateAttribute == null) {
            mfgTemplateAttribute = new ArrayList<MfgTemplateAttribute>();
        }
        return this.mfgTemplateAttribute;
    }

}
