
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScreenDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScreenDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://infor.com/pcm/v3}BaseDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PageId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ScreenOptions" type="{http://infor.com/pcm/v3}ArrayOfScreenOptionDto"/&gt;
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ShowDescription" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowLine" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowTitle" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScreenDto", propOrder = {
    "description",
    "pageId",
    "screenOptions",
    "sequence",
    "showDescription",
    "showLine",
    "showTitle",
    "title",
    "visible"
})
public class ScreenDto
    extends BaseDto
{

    @XmlElement(name = "Description", required = true, nillable = true)
    protected String description;
    @XmlElement(name = "PageId")
    protected long pageId;
    @XmlElement(name = "ScreenOptions", required = true, nillable = true)
    protected ArrayOfScreenOptionDto screenOptions;
    @XmlElement(name = "Sequence")
    protected int sequence;
    @XmlElement(name = "ShowDescription")
    protected boolean showDescription;
    @XmlElement(name = "ShowLine")
    protected boolean showLine;
    @XmlElement(name = "ShowTitle")
    protected boolean showTitle;
    @XmlElement(name = "Title", required = true, nillable = true)
    protected String title;
    @XmlElement(name = "Visible")
    protected boolean visible;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the pageId property.
     * 
     */
    public long getPageId() {
        return pageId;
    }

    /**
     * Sets the value of the pageId property.
     * 
     */
    public void setPageId(long value) {
        this.pageId = value;
    }

    /**
     * Gets the value of the screenOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfScreenOptionDto }
     *     
     */
    public ArrayOfScreenOptionDto getScreenOptions() {
        return screenOptions;
    }

    /**
     * Sets the value of the screenOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfScreenOptionDto }
     *     
     */
    public void setScreenOptions(ArrayOfScreenOptionDto value) {
        this.screenOptions = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     */
    public int getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     */
    public void setSequence(int value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the showDescription property.
     * 
     */
    public boolean isShowDescription() {
        return showDescription;
    }

    /**
     * Sets the value of the showDescription property.
     * 
     */
    public void setShowDescription(boolean value) {
        this.showDescription = value;
    }

    /**
     * Gets the value of the showLine property.
     * 
     */
    public boolean isShowLine() {
        return showLine;
    }

    /**
     * Sets the value of the showLine property.
     * 
     */
    public void setShowLine(boolean value) {
        this.showLine = value;
    }

    /**
     * Gets the value of the showTitle property.
     * 
     */
    public boolean isShowTitle() {
        return showTitle;
    }

    /**
     * Sets the value of the showTitle property.
     * 
     */
    public void setShowTitle(boolean value) {
        this.showTitle = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     */
    public void setVisible(boolean value) {
        this.visible = value;
    }

}
