
package com.infor.pcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Application" type="{http://infor.com/pcm/v3}Application"/&gt;
 *         &lt;element name="HeaderDetail" type="{http://infor.com/pcm/v3}HeaderDetail"/&gt;
 *         &lt;element name="IntegrationParameters" type="{http://infor.com/pcm/v3}ArrayOfIntegrationParameter"/&gt;
 *         &lt;element name="Mode" type="{http://infor.com/pcm/v3}ConfigurationMode"/&gt;
 *         &lt;element name="Part" type="{http://infor.com/pcm/v3}Part"/&gt;
 *         &lt;element name="Profile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RapidOptions" type="{http://infor.com/pcm/v3}ArrayOfRapidOption"/&gt;
 *         &lt;element name="SourceHeaderDetail" type="{http://infor.com/pcm/v3}HeaderDetail"/&gt;
 *         &lt;element name="VariantKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputParameters", propOrder = {
    "application",
    "headerDetail",
    "integrationParameters",
    "mode",
    "part",
    "profile",
    "rapidOptions",
    "sourceHeaderDetail",
    "variantKey"
})
public class InputParameters {

    @XmlElement(name = "Application", required = true, nillable = true)
    protected Application application;
    @XmlElement(name = "HeaderDetail", required = true, nillable = true)
    protected HeaderDetail headerDetail;
    @XmlElement(name = "IntegrationParameters", required = true, nillable = true)
    protected ArrayOfIntegrationParameter integrationParameters;
    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected ConfigurationMode mode;
    @XmlElement(name = "Part", required = true, nillable = true)
    protected Part part;
    @XmlElement(name = "Profile", required = true, nillable = true)
    protected String profile;
    @XmlElement(name = "RapidOptions", required = true, nillable = true)
    protected ArrayOfRapidOption rapidOptions;
    @XmlElement(name = "SourceHeaderDetail", required = true, nillable = true)
    protected HeaderDetail sourceHeaderDetail;
    @XmlElement(name = "VariantKey", required = true, nillable = true)
    protected String variantKey;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link Application }
     *     
     */
    public Application getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link Application }
     *     
     */
    public void setApplication(Application value) {
        this.application = value;
    }

    /**
     * Gets the value of the headerDetail property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderDetail }
     *     
     */
    public HeaderDetail getHeaderDetail() {
        return headerDetail;
    }

    /**
     * Sets the value of the headerDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderDetail }
     *     
     */
    public void setHeaderDetail(HeaderDetail value) {
        this.headerDetail = value;
    }

    /**
     * Gets the value of the integrationParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIntegrationParameter }
     *     
     */
    public ArrayOfIntegrationParameter getIntegrationParameters() {
        return integrationParameters;
    }

    /**
     * Sets the value of the integrationParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIntegrationParameter }
     *     
     */
    public void setIntegrationParameters(ArrayOfIntegrationParameter value) {
        this.integrationParameters = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationMode }
     *     
     */
    public ConfigurationMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationMode }
     *     
     */
    public void setMode(ConfigurationMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the part property.
     * 
     * @return
     *     possible object is
     *     {@link Part }
     *     
     */
    public Part getPart() {
        return part;
    }

    /**
     * Sets the value of the part property.
     * 
     * @param value
     *     allowed object is
     *     {@link Part }
     *     
     */
    public void setPart(Part value) {
        this.part = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile(String value) {
        this.profile = value;
    }

    /**
     * Gets the value of the rapidOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRapidOption }
     *     
     */
    public ArrayOfRapidOption getRapidOptions() {
        return rapidOptions;
    }

    /**
     * Sets the value of the rapidOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRapidOption }
     *     
     */
    public void setRapidOptions(ArrayOfRapidOption value) {
        this.rapidOptions = value;
    }

    /**
     * Gets the value of the sourceHeaderDetail property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderDetail }
     *     
     */
    public HeaderDetail getSourceHeaderDetail() {
        return sourceHeaderDetail;
    }

    /**
     * Sets the value of the sourceHeaderDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderDetail }
     *     
     */
    public void setSourceHeaderDetail(HeaderDetail value) {
        this.sourceHeaderDetail = value;
    }

    /**
     * Gets the value of the variantKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariantKey() {
        return variantKey;
    }

    /**
     * Sets the value of the variantKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariantKey(String value) {
        this.variantKey = value;
    }

}
