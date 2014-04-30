package com.tvcable.ec.workorder.services.close;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemKey" type="{http://www.example.org/WorkCloseOrderInt/}itemKey"/>
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemFullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="relatedItems" type="{http://www.example.org/WorkCloseOrderInt/}(relatedItemsType)"/>
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
@XmlType(name = "Item", propOrder = {
		"itemKey",
		"itemName",
		"itemFullName",
		"status",
		"quantity",
		"relatedItems",
		"attributes"
})
public class Item {
	
	@XmlElement(name = "itemKey", required = true)
	protected ItemKey itemKey;
	@XmlElement(name = "itemName", required = true)
	protected String itemName;
	@XmlElement(name = "itemFullName", required = true)
	protected String itemFullName;
	@XmlElement(name = "status", required = true)
	protected String status;
	@XmlElement(name = "quantity", required = true)
	protected Double quantity;
	@XmlElement(name = "relatedItems", required = true)
	protected RelatedItemsType relatedItems;
	@XmlElement(name = "attributes", required = true)
	protected Attributes attributes;
	
	
	/**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link ItemKey }
     *     
     */
    public ItemKey getItemKey() {
        return itemKey;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemKey }
     *     
     */
    public void setItemKey(ItemKey value) {
        this.itemKey = value;
    }
	
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }
    
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemFullName() {
        return itemFullName;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemFullName(String value) {
        this.itemFullName = value;
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
     *     {@link Double }
     *     
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity(Double value) {
        this.quantity = value;
    }
    
    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedItemsType }
     *     
     */
    public RelatedItemsType getRelatedItems() {
        return relatedItems;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedItemsType }
     *     
     */
    public void setRelatedItems(RelatedItemsType value) {
        this.relatedItems = value;
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
