
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RapidOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RapidOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValueExpression" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VariableName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RapidOption", propOrder = {
    "valueExpression",
    "variableName"
})
public class RapidOption {

    @XmlElement(name = "ValueExpression", required = true, nillable = true)
    protected String valueExpression;
    @XmlElement(name = "VariableName", required = true, nillable = true)
    protected String variableName;

    /**
     * Gets the value of the valueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueExpression() {
        return valueExpression;
    }

    /**
     * Sets the value of the valueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueExpression(String value) {
        this.valueExpression = value;
    }

    /**
     * Gets the value of the variableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableName() {
        return variableName;
    }

    /**
     * Sets the value of the variableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableName(String value) {
        this.variableName = value;
    }

}
