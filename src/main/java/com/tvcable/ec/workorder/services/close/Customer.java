package com.tvcable.ec.workorder.services.close;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerType" type="{http://www.example.org/WorkCloseOrderInt/}customerTypeEnum"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="businessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNumber1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNumber2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNumber3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contacts" type="{http://www.example.org/WorkCloseOrderInt/}contacts"/>
 *         &lt;element name="location" type="{http://www.example.org/WorkCloseOrderInt/}location"/>
 *         &lt;element name="attributes" type="{http://www.example.org/WorkCloseOrderInt/}attributes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
		"customerId",
		"customerType",
		"firstName",
		"lastName",
		"businessName",
		"phoneNumber1",
		"phoneNumber2",
		"phoneNumber3",
		"email",
		"contacts",
		"location",
		"attributes"
})
public class Customer {
	
	@XmlElement(name = "customerId", required = true)
	protected String customerId;
	@XmlElement(name = "customerType", required = true)
	protected CustomerTypeEnum customerType;
	@XmlElement(name = "firstName", required = true)
	protected String firstName;
	@XmlElement(name = "lastName", required = true)
	protected String lastName;
	@XmlElement(name = "businessName", required = true)
	protected String businessName;
	@XmlElement(name = "phoneNumber1", required = true)
	protected String phoneNumber1;
	@XmlElement(name = "phoneNumber2", required = true)
	protected String phoneNumber2;
	@XmlElement(name = "phoneNumber3", required = true)
	protected String phoneNumber3;
	@XmlElement(name = "email", required = true)
	protected String email;
	@XmlElement(name = "contacts", required = true)
	protected Contacts contacts;
	@XmlElement(name = "location", required = true)
	protected Location location;
	@XmlElement(name = "attributes", required = true)
	protected Attributes attributes;
	
	/**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerTypeEnum }
     *     
     */
    public CustomerTypeEnum getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerTypeEnum }
     *     
     */
    public void setCustomerType(CustomerTypeEnum value) {
        this.customerType = value;
    }
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }
   
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }
    
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }
    
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber1(String value) {
        this.phoneNumber1 = value;
    }
    
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber2(String value) {
        this.phoneNumber2 = value;
    }
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber3() {
        return phoneNumber3;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber3(String value) {
        this.phoneNumber3 = value;
    }
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Contacts }
     *     
     */
    public Contacts getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contacts }
     *     
     */
    public void setContacts(Contacts value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Attributes }
     *     
     */
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attributes }
     *     
     */
    public void setAttributes(Attributes value) {
        this.attributes = value;
    }
    

}
