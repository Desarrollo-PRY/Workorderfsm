package com.tvcable.ec.workorder.services.close;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkOrderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkOrderItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="processId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="processSignature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workOrderURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tasks" type="{http://www.example.org/WorkCloseOrderInt/}tasksList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkOrderItem", propOrder = {
		"sourceSystem",
		"processId",
		"processSignature",
		"workOrderId",
		"workOrderURL",
		"status",
		"tasks"
})

public class WorkOrderItem {
	
	@XmlElement(name = "sourceSystem", required = true)
	protected String sourceSystem;
	@XmlElement(name = "processId", required = true)
	protected String processId;
	@XmlElement(name = "processSignature", required = true)
	protected String processSignature;
	@XmlElement(name = "workOrderId", required = true)
	protected String workOrderId;
	@XmlElement(name = "workOrderURL", required = true)
	protected String workOrderURL;
	@XmlElement(name = "status", required = true)
	protected String status;
	@XmlElement(name = "tasks", required = true)
	protected TasksList tasks;
	
	/**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessId(String value) {
        this.processId = value;
    }
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessSignature() {
        return processSignature;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessSignature(String value) {
        this.processSignature = value;
    }
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderId() {
        return workOrderId;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderId(String value) {
        this.workOrderId = value;
    }
    
       
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderURL() {
        return workOrderURL;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderURL(String value) {
        this.workOrderURL = value;
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
     *     {@link TasksList }
     *     
     */
    public TasksList getTasksList() {
        return tasks;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link TasksList }
     *     
     */
    public void setTasksList(TasksList value) {
        this.tasks = value;
    }

}
