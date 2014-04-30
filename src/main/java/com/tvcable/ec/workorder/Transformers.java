package com.tvcable.ec.workorder;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.tvcable.ec.workorder.services.close.CloseWorkOrder;
import org.switchyard.annotations.Transformer;

public class Transformers {
	
	private final static QName _CloseWorkOrder_QName = new QName("http://soap.integration.fsm.comarch.com/","CloseWorkOrder");
	
	@Transformer(from = "{urn:com.tvcable.ec.workorder:close-work-order:1.0}CloseWorkOrder")
	public JAXBElement<CloseWorkOrder> Capturar(CloseWorkOrder value) {
		return new JAXBElement<CloseWorkOrder>(_CloseWorkOrder_QName, CloseWorkOrder.class, null, value);
	}

}
