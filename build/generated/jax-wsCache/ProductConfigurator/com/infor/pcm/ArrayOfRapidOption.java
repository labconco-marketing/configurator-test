
package com.infor.pcm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRapidOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRapidOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RapidOption" type="{http://infor.com/pcm/v3}RapidOption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRapidOption", propOrder = {
    "rapidOption"
})
public class ArrayOfRapidOption {

    @XmlElement(name = "RapidOption", nillable = true)
    protected List<RapidOption> rapidOption;

    /**
     * Gets the value of the rapidOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rapidOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRapidOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RapidOption }
     * 
     * 
     */
    public List<RapidOption> getRapidOption() {
        if (rapidOption == null) {
            rapidOption = new ArrayList<RapidOption>();
        }
        return this.rapidOption;
    }

}
