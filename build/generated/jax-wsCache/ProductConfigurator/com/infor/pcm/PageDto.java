
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PageDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://infor.com/pcm/v3}BaseDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Caption" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Screens" type="{http://infor.com/pcm/v3}ArrayOfScreenDto"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageDto", propOrder = {
    "caption",
    "number",
    "screens"
})
public class PageDto
    extends BaseDto
{

    @XmlElement(name = "Caption", required = true, nillable = true)
    protected String caption;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "Screens", required = true, nillable = true)
    protected ArrayOfScreenDto screens;

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the screens property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfScreenDto }
     *     
     */
    public ArrayOfScreenDto getScreens() {
        return screens;
    }

    /**
     * Sets the value of the screens property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfScreenDto }
     *     
     */
    public void setScreens(ArrayOfScreenDto value) {
        this.screens = value;
    }

}
