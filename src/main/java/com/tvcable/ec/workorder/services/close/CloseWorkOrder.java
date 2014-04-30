package com.tvcable.ec.workorder.services.close;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkOrderItem" type="{http://www.example.org/WorkCloseOrderInt/}WorkOrderItem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "WorkOrderItem",
    
})
@XmlRootElement(name = "CloseOrderItem")
public class CloseWorkOrder {
	
	@XmlElement(name = "WorkOrderItem", required = true)
	protected WorkOrderItem workOrderItem;
	
	/**
     * Gets the value of the headerRequest property.
     * 
     * @return
     *     possible object is
     *     {@link WorkOrderItem }
     *     
     */
    public WorkOrderItem getWorkOrderItem() {
        return workOrderItem;
    }

    /**
     * Sets the value of the headerRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkOrderItem }
     *     
     */
    public void setWorkOrderItem(WorkOrderItem value) {
        this.workOrderItem = value;
    }

}
