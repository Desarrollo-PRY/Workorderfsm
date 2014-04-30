package com.tvcable.ec.workorder.services.close;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for AdministrationUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdministrationUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="administrationUnit" type="{http://www.example.org/WorkCloseOrderInt/}administrationUnit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdministrationUnit", propOrder = {
		"id",
		"level",
		"name",
		"administrationUnit"
})
public class AdministrationUnit {
	
	@XmlElement(name = "id", required = true)
	protected String id;
	@XmlElement(name = "level", required = true)
	protected String level;
	@XmlElement(name = "name", required = true)
	protected String name;
	@XmlElement(name = "administrationUnit", required = true)
	protected AdministrationUnit administrationUnit;
	


	/**
	 * Gets the value of the target property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getId() {
	    return id;
	}

	/**
	 * Sets the value of the target property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setId(String value) {
	    this.id = value;
	}


/**
 * Gets the value of the target property.
 * 
 * @return
 *     possible object is
 *     {@link String }
 *     
 */
public String getLevel() {
    return level;
}

/**
 * Sets the value of the target property.
 * 
 * @param value
 *     allowed object is
 *     {@link String }
 *     
 */
public void setLevel(String value) {
    this.level = value;
}

/**
 * Gets the value of the target property.
 * 
 * @return
 *     possible object is
 *     {@link String }
 *     
 */
public String getName() {
    return name;
}

/**
 * Sets the value of the target property.
 * 
 * @param value
 *     allowed object is
 *     {@link String }
 *     
 */
public void setName(String value) {
    this.name = value;
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

}
