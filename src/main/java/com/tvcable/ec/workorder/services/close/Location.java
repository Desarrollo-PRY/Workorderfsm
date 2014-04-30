package com.tvcable.ec.workorder.services.close;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for Location complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="administrationUnit" type="{http://www.example.org/WorkCloseOrderInt/}administrationUnit"/>
 *         &lt;element name="cityAdministrationUnit" type="{http://www.example.org/WorkCloseOrderInt/}administrationUnit"/>
 *         &lt;element name="cityId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="streetId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="buildingNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flatNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
		"locationId",
		"administrationUnit",
		"cityAdministrationUnit",
		"cityId",
		"cityName",
		"streetId",
		"streetName",
		"buildingNo",
		"flatNo",
		"longitude",
		"latitude",
		"description"
})
public class Location {
	
	@XmlElement(name = "locationId", required = true)
	protected String locationId;
	@XmlElement(name = "administrationUnit", required = true)
	protected AdministrationUnit administrationUnit;
	@XmlElement(name = "cityAdministrationUnit", required = true)
	protected AdministrationUnit cityAdministrationUnit;
	@XmlElement(name = "cityId", required = true)
	protected String cityId;
	@XmlElement(name = "cityName", required = true)
	protected String cityName;
	@XmlElement(name = "streetId", required = true)
	protected String streetId;
	@XmlElement(name = "streetName", required = true)
	protected String streetName;
	@XmlElement(name = "buildingNo", required = true)
	protected String buildingNo;
	@XmlElement(name = "flatNo", required = true)
	protected String flatNo;
	@XmlElement(name = "longitude", required = true)
	protected Integer longitude;
	@XmlElement(name = "latitude", required = true)
	protected Integer latitude;
	@XmlElement(name = "description", required = true)
	protected String description;
	
	
	/**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationId(String value) {
        this.locationId = value;
    }
    
    
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link AdministrationUnit }
     *     
     */
    public AdministrationUnit getAdministrationUnit() {
        return administrationUnit;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrationUnit }
     *     
     */
    public void setAdministrationUnit(AdministrationUnit value) {
        this.administrationUnit = value;
    }
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link AdministrationUnit }
     *     
     */
    public AdministrationUnit getCityAdministrationUnit() {
        return cityAdministrationUnit;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrationUnit }
     *     
     */
    public void setCityAdministrationUnit(AdministrationUnit value) {
        this.cityAdministrationUnit = value;
    }
    
	
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityId(String value) {
        this.cityId = value;
    }
    
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetId() {
        return streetId;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetId(String value) {
        this.streetId = value;
    }
    
    
       
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }
    
       
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingNo() {
        return buildingNo;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingNo(String value) {
        this.buildingNo = value;
    }
       
       
       
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlatNo() {
        return flatNo;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlatNo(String value) {
        this.flatNo = value;
    }
       
       
       
       
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLongitude(Integer value) {
        this.longitude = value;
    }
       
       
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLatitude(Integer value) {
        this.latitude = value;
    }
       
       
    /**
     * Gets the value of the target property.
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
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }
      

}
