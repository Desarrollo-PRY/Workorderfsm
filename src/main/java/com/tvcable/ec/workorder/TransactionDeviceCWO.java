package com.tvcable.ec.workorder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.switchyard.component.bean.Service;

import com.tvcable.ec.workorder.jpa.Ytbl_Device;

@Service(InterfaceDevice.class)
public class TransactionDeviceCWO implements InterfaceDevice{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void saveDevice(Ytbl_Device ytblDevice){
		em.persist(ytblDevice);
		
	}
	

}
