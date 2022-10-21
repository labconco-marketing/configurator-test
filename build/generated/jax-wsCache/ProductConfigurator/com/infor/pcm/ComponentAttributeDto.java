
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComponentAttributeDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentAttributeDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://infor.com/pcm/v3}AttributeDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Classifications" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/&gt;
 *         &lt;element name="ComponentId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentAttributeDto", propOrder = {
    "classifications",
    "componentId"
})
public class ComponentAttributeDto
    extends AttributeDto
{

    @XmlElement(name = "Classifications", required = true, nillable = true)
    protected ArrayOfstring classifications;
    @XmlElement(name = "ComponentId")
    protected long componentId;

    /**
     * Gets the value of the classifications property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getClassifications() {
        return classifications;
    }

    /**
     * Sets the value of the classifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setClassifications(ArrayOfstring value) {
        this.classifications = value;
    }

    /**
     * Gets the value of the componentId property.
     * 
     */
    public long getComponentId() {
        return componentId;
    }

    /**
     * Sets the value of the componentId property.
     * 
     */
    public void setComponentId(long value) {
        this.componentId = value;
    }

}
