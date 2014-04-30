package com.tvcable.ec.workorder.services.close;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for Inventory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Inventory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="node" type="{http://www.example.org/WorkCloseOrderInt/}node"/>
 *         &lt;element name="items" type="{http://www.example.org/WorkCloseOrderInt/}items"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Inventory", propOrder = {
		"node",
		"items"
})

public class Inventory {

	@XmlElement(name = "node", required = true)
	protected Node node;
	@XmlElement(name = "items", required = true)
	protected Items items;
	
	/**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Node }
     *     
     */
    public Node getNode() {
        return node;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Node }
     *     
     */
    public void setNode(Node value) {
        this.node = value;
    }
    
    
	/**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Items }
     *     
     */
    public Items getItems() {
        return items;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Items }
     *     
     */
    public void setItems(Items value) {
        this.items = value;
    }
    
}
