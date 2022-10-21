
package com.infor.pcm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFileContentDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFileContentDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FileContentDto" type="{http://infor.com/pcm/v3}FileContentDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFileContentDto", propOrder = {
    "fileContentDto"
})
public class ArrayOfFileContentDto {

    @XmlElement(name = "FileContentDto", nillable = true)
    protected List<FileContentDto> fileContentDto;

    /**
     * Gets the value of the fileContentDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileContentDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileContentDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileContentDto }
     * 
     * 
     */
    public List<FileContentDto> getFileContentDto() {
        if (fileContentDto == null) {
            fileContentDto = new ArrayList<FileContentDto>();
        }
        return this.fileContentDto;
    }

}
