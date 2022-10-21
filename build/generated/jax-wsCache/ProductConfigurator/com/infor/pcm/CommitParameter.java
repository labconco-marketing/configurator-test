
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommitParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://infor.com/pcm/v3}Parameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValueElements" type="{http://infor.com/pcm/v3}ArrayOfCommitParameter"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitParameter", propOrder = {
    "valueElements"
})
public class CommitParameter
    extends Parameter
{

    @XmlElement(name = "ValueElements", required = true, nillable = true)
    protected ArrayOfCommitParameter valueElements;

    /**
     * Gets the value of the valueElements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommitParameter }
     *     
     */
    public ArrayOfCommitParameter getValueElements() {
        return valueElements;
    }

    /**
     * Sets the value of the valueElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommitParameter }
     *     
     */
    public void setValueElements(ArrayOfCommitParameter value) {
        this.valueElements = value;
    }

}
