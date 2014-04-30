package com.tvcable.ec.workorder.services.close;


import java.util.Date;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for TaskList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="realizationInterval" type="{http://www.example.org/WorkCloseOrderInt/}timeInterval"/>
 *         &lt;element name="scheduleInterval" type="{http://www.example.org/WorkCloseOrderInt/}timeInterval"/>
 *         &lt;element name="executor" type="{http://www.example.org/WorkCloseOrderInt/}assignedExecutor"/>
 *         &lt;element name="finishDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="location" type="{http://www.example.org/WorkCloseOrderInt/}location"/>
 *         &lt;element name="inventory" type="{http://www.example.org/WorkCloseOrderInt/}inventory"/>
 *         &lt;element name="customer" type="{http://www.example.org/WorkCloseOrderInt/}customer"/>
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
@XmlType(name = "TaskList", propOrder = {
		"taskId",
		"status",
		"realizationInterval",
		"scheduleInterval",
		"executor",
		"finishDate",
		"location",
		"inventory",
		"customer",
		"attributes"
})

public class TaskList {
	
	@XmlElement(name = "taskId", required = true)
	protected String taskId;
	@XmlElement(name = "status", required = true)
	protected String status;
	@XmlElement(name = "realizationInterval", required = true)
	protected TimeInterval realizationInterval;
	@XmlElement(name = "scheduleInterval", required  = true)
	protected TimeInterval scheduleInterval;
	@XmlElement(name = "executor", required = true)
	protected AssignedExecutor executor;
	@XmlElement(name = "finishDate", required = true)
	protected Date finishDate;
	@XmlElement(name = "location", required = true)
	protected Location location;
	@XmlElement(name = "inventory", required = true)
	protected Inventory inventory;
	@XmlElement(name = "customer", required = true)
	protected Customer customer;
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
    public String getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }
    
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInterval }
     *     
     */
    public TimeInterval getRealizationInterval() {
        return realizationInterval;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInterval }
     *     
     */
    public void setRealizationInterval(TimeInterval value) {
        this.realizationInterval = value;
    }
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInterval }
     *     
     */
    public TimeInterval getScheduleInterval() {
        return scheduleInterval;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInterval }
     *     
     */
    public void setScheduleInterval(TimeInterval value) {
        this.scheduleInterval = value;
    }
   
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedExecutor }
     *     
     */
    public AssignedExecutor getExecutor() {
        return executor;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedExecutor }
     *     
     */
    public void setExecutor(AssignedExecutor value) {
        this.executor = value;
    }
    
    
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFinishDate() {
        return finishDate;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFinishDate(Date value) {
        this.finishDate = value;
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
     *     {@link Inventory }
     *     
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inventory }
     *     
     */
    public void setInventory(Inventory value) {
        this.inventory = value;
    }
    
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
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
