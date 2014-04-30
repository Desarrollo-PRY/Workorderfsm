package com.tvcable.ec.workorder.services.close;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;



/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tvcable.ec.workorder.services.close package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */

@XmlRegistry
public class ObjectFactory {
	
	
	 private final static QName _CloseWorkOrder_QName = new QName("http://soap.integration.fsm.comarch.com/}","CloseWorkOrder");
	
	/**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tvcable.ec.workorder.services.close
     * 
     */
    public ObjectFactory() {
    }
    
    /**
     * Create an instance of {@link AdditionalAttribute }
     * 
     */
    public AdditionalAttribute createAdditionalAttribute() {
        return new AdditionalAttribute();
    }
    
    /**
     * Create an instance of {@link AdministrationUnit }
     * 
     */
    public AdministrationUnit createAdministrationUnit() {
        return new AdministrationUnit();
    }
    
    /**
     * Create an instance of {@link AssignedExecutor }
     * 
     */
    public AssignedExecutor createAssignedExecutor() {
        return new AssignedExecutor();
    }
    
    /**
     * Create an instance of {@link Attributes }
     * 
     */
    public Attributes createAttributes() {
        return new Attributes();
    }
    
    /**
     * Create an instance of {@link CloseWorkOrder }
     * 
     */
    public CloseWorkOrder createCloseWorkOrder() {
        return new CloseWorkOrder();
    }
    
    /**
     * Create an instance of {@link CloseWorkOrderResponse }
     * 
     */
    public CloseWorkOrderResponse createCloseWorkOrderResponse() {
        return new CloseWorkOrderResponse();
    }
    
    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }
    
    /**
     * Create an instance of {@link Contacts }
     * 
     */
    public Contacts createContacts() {
        return new Contacts();
    }
    
    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }
    
    /**
     * Create an instance of {@link CustomerTypeEnum }
     * 
     */
    public CustomerTypeEnum createCustomerTypeEnum() {
        return new CustomerTypeEnum();
    }
    
    /**
     * Create an instance of {@link Inventory }
     * 
     */
    public Inventory createInventory() {
        return new Inventory();
    }
    
    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }
    
    /**
     * Create an instance of {@link Items }
     * 
     */
    public Items createItems() {
        return new Items();
    }
    
    /**
     * Create an instance of {@link ItemKey }
     * 
     */
    public ItemKey createItemKey() {
        return new ItemKey();
    }
    
    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }
    
    /**
     * Create an instance of {@link Node }
     * 
     */
    public Node createNode() {
        return new Node();
    }
    
    /**
     * Create an instance of {@link RelatedItemsType }
     * 
     */
    public RelatedItemsType createRelatedItemsType() {
        return new RelatedItemsType();
    }
    
    /**
     * Create an instance of {@link TaskList }
     * 
     */
    public TaskList createTaskList() {
        return new TaskList();
    }
    
    /**
     * Create an instance of {@link TasksList }
     * 
     */
    public TasksList createTasksList() {
        return new TasksList();
    }
    
    /**
     * Create an instance of {@link TimeInterval }
     * 
     */
    public TimeInterval createTimeInterval() {
        return new TimeInterval();
    }
    
    /**
     * Create an instance of {@link WorkOrderItem }
     * 
     */
    public WorkOrderItem createWorkOrderItem() {
        return new WorkOrderItem();
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseWorkOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.integration.fsm.comarch.com/}", name = "CloseWorkOrder")
    public JAXBElement<CloseWorkOrder> createCloseWorkOrder(CloseWorkOrder value){
    	return new JAXBElement<CloseWorkOrder>(_CloseWorkOrder_QName, CloseWorkOrder.class, null, value);
    }
    
    
}
