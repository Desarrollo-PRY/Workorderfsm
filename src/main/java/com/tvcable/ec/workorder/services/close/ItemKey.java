package com.tvcable.ec.workorder.services.close;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ItemKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemKey", propOrder = {
		"itemId",
		"itemClass",
		"itemType"
})
public class ItemKey {
	
	@XmlElement(name = "itemId", required = true)
	protected String itemId;
	@XmlElement(name = "itemClass", required = true)
	protected String itemClass;
	@XmlElement(name = "itemType", required = true)
	protected String itemType;
	
	
	/**
	    * Gets the value of the target property.
	    * 
	    * @return
	    *     possible object is
	    *     {@link String }
	    *     
	    */
	   public String getItemId() {
	       return itemId;
	   }

	   /**
	    * Sets the value of the target property.
	    * 
	    * @param value
	    *     allowed object is
	    *     {@link String }
	    *     
	    */
	   public void setItemId(String value) {
	       this.itemId = value;
	   }
   
   
   /**
    * Gets the value of the target property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getItemClass() {
       return itemClass;
   }

   /**
    * Sets the value of the target property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setItemClass(String value) {
       this.itemClass = value;
   }
   
      
   /**
    * Gets the value of the target property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getItemType() {
       return itemType;
   }

   /**
    * Sets the value of the target property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setitemType(String value) {
       this.itemType = value;
   }

}
