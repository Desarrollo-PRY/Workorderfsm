package com.tvcable.ec.workorder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.switchyard.component.bean.Service;

import com.tvcable.ec.workorder.jpa.Ytbl_Response_CloseWorkOrder;

@Service(InterfaceResponseCWO.class)
public class TransactionResponseCWO implements InterfaceResponseCWO{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void saveResponse(Ytbl_Response_CloseWorkOrder response){
		em.persist(response);
	}

}
