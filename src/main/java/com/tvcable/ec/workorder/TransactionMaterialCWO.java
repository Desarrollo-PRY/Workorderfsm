package com.tvcable.ec.workorder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.switchyard.component.bean.Service;

import com.tvcable.ec.workorder.jpa.Ytbl_Materials;

@Service(InterfaceMaterials.class)
public class TransactionMaterialCWO implements InterfaceMaterials{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void saveMaterials(Ytbl_Materials ytblMaterial){
		em.persist(ytblMaterial);
		
	}

}
