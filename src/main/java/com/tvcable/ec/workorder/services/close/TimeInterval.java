package com.tvcable.ec.workorder.services.close;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for TimeInterval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeInterval">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInterval", propOrder = {
		"dateFrom",
		"dateTo"
})
public class TimeInterval {

	@XmlElement(name = "dateFrom", required = true)
	protected Date dateFrom;
	@XmlElement(name = "dateTo", required = true)
	protected Date dateTo;
	
	/**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDateFrom(Date value) {
        this.dateFrom = value;
    }
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setdateTo(Date value) {
        this.dateTo = value;
    }
}
