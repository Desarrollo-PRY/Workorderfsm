package com.tvcable.ec.workorder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.switchyard.component.bean.Service;

import com.tvcable.ec.workorder.jpa.YtblRequesCloseWorkOrder;


@Service(InterfaceWorkCloseOrder.class)
public class TransactionRequestCWO implements InterfaceWorkCloseOrder{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void saveYtblRequest(YtblRequesCloseWorkOrder ytblRequesCloseWorkOrder){
		em.persist(ytblRequesCloseWorkOrder);
	}

}
