package com.tvcable.ec.workorder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

import com.tvcable.ec.workorder.jpa.YtblRequesCloseWorkOrder;
import com.tvcable.ec.workorder.jpa.Ytbl_Device;
import com.tvcable.ec.workorder.jpa.Ytbl_Materials;
import com.tvcable.ec.workorder.jpa.Ytbl_Request;
import com.tvcable.ec.workorder.jpa.Ytbl_Response_CloseWorkOrder;
import com.tvcable.ec.workorder.services.close.AdditionalAttribute;
import com.tvcable.ec.workorder.services.close.CloseWorkOrder;
import com.tvcable.ec.workorder.services.close.CloseWorkOrderResponse;
import com.tvcable.ec.workorder.services.close.Item;
import com.tvcable.ec.workorder.services.close.TaskList;
import com.tvcable.ec.workorder.services.close.WorkCloseOrderInt;


@Service(WorkCloseOrderInt.class)
public class WorkOrderBean implements WorkCloseOrderInt {
	
	@Reference
	@Inject
	private InterfaceWorkCloseOrder interfaceWorkCloseOrder;
	
	@Reference
	@Inject
	private InterfaceDevice interfaceDevice;
	
	@Reference
	@Inject
	private InterfaceMaterials interfaceMaterials;
	
	@Reference
	@Inject
	private InterfaceResponseCWO transactionResponseCWO;
	
	private CloseWorkOrder workCloseOrderRequest;
	private YtblRequesCloseWorkOrder wcotmp;
	
	private Ytbl_Request requestYtbl;
	
	private List<TaskList> taskList;
	private List<AdditionalAttribute> addattribute;
	private List<Item> item;
	

	@Override
	public CloseWorkOrderResponse WorkCloseOrderInt(CloseWorkOrder parameters) throws Exception {
		this.workCloseOrderRequest = parameters;
		CloseWorkOrderResponse response = new CloseWorkOrderResponse();
		
		try{
			processTask();
			processAttribute(taskList);
			processItem(taskList);
					
			saveCloseWorkOrder(parameters);
			saveDevices(parameters);
			saveMaterials(parameters);
			
			//saveResponse(parameters);		
			//return response;
		}catch(Exception e){
			saveResponse(e.toString());
		}finally{
			saveResponse("OK");
		}
		
		return response;
		
			
	}
	
	private void saveCloseWorkOrder(CloseWorkOrder cwo){
		YtblRequesCloseWorkOrder cwoTable = new YtblRequesCloseWorkOrder();
		
		    cwoTable.setProcessId(Integer.parseInt(cwo.getWorkOrderItem().getProcessId()));
			cwoTable.setSourceSystem(cwo.getWorkOrderItem().getSourceSystem());
			cwoTable.setWorkOrderId(cwo.getWorkOrderItem().getWorkOrderId());
			cwoTable.setTaskId(getTaskId(taskList));
			cwoTable.setCpartyId(Integer.parseInt(getCparty(taskList)));
			cwoTable.setAccountId(Integer.parseInt(getAccount(addattribute)));
			cwoTable.setProcessCreationDate(getProcessDateCreation(taskList));
			cwoTable.setOrderType(requestYtbl.getOrderType());
			cwoTable.setOrderTechnology(requestYtbl.getOrderTechnology());
			cwoTable.setLocationId(requestYtbl.getLocationId());
			cwoTable.setProvinceId(requestYtbl.getProvinceId());
			cwoTable.setProvinceName(requestYtbl.getProvinceName());
			cwoTable.setSectorid(requestYtbl.getSectorId());
			cwoTable.setSectorName(requestYtbl.getSectorName());
			cwoTable.setZonaId(requestYtbl.getzonaId());
			cwoTable.setZonaName(requestYtbl.getzonaName());
			cwoTable.setCityId(requestYtbl.getcityId());
			cwoTable.setCityName(requestYtbl.getcityName());
			
			cwoTable.setStreetId(requestYtbl.getstreetId());
			cwoTable.setStreetName(requestYtbl.getstreetName());
			cwoTable.setSubSector(requestYtbl.getsubSectorId());
			cwoTable.setSubSectorName(requestYtbl.getsubSectorName());
			cwoTable.setBuildIngno(requestYtbl.getbuildIngno());
			cwoTable.setFlatNo(requestYtbl.getflatNo());
			cwoTable.setLongitude(getLongitude(taskList));
			cwoTable.setLatitude(getLatitude(taskList));
			cwoTable.setCustomerId(requestYtbl.getcustomerId());
			cwoTable.setCustomerType(requestYtbl.getcustomerType());
			cwoTable.setFirstname(requestYtbl.getFirstName());
			cwoTable.setLastName(requestYtbl.getLastName());
			cwoTable.setBusinessName(requestYtbl.getbusinessName());
			cwoTable.setPhoneNumber1(requestYtbl.getphoneNumber1());
			cwoTable.setPhoneNumber2(requestYtbl.getphoneNumber2());
			cwoTable.setPhoneNumber3(requestYtbl.getphoneNumber3());
			cwoTable.setEmail(requestYtbl.getEmail());
			cwoTable.setcontactsContact(requestYtbl.getcontactsContact());
			cwoTable.setContactName(requestYtbl.getcontactName());
			cwoTable.setContactValue(requestYtbl.getcontactValue());
			cwoTable.setExecutor(getExecutor(taskList));
			cwoTable.setDateFrom(getDateFrom(taskList));
			cwoTable.setDateTo(getDateto(taskList));
			
			cwoTable.setProcessSignature(cwo.getWorkOrderItem().getProcessSignature());
			cwoTable.setNote(requestYtbl.getNote());
			cwoTable.setTipoEnvio("3");
			cwoTable.setState(cwo.getWorkOrderItem().getStatus());
			cwoTable.setNodeId(getNodeId(taskList));
			//cwoTable.setCreateDate(requestYtbl.getcreateDate());
			//cwoTable.setUpdateDate(requestYtbl.getupdateDate());
			cwoTable.setErrorDetail(requestYtbl.geterrorDetail());
			
			interfaceWorkCloseOrder.saveYtblRequest(cwoTable);
	}
	
	private void saveDevices(CloseWorkOrder cwo){
		Ytbl_Device device = new Ytbl_Device();
		
		device.setrequestId(wcotmp.getId());
		device.setprocessId(Integer.parseInt(cwo.getWorkOrderItem().getProcessId()));
		device.setworkOrderId(Integer.parseInt(cwo.getWorkOrderItem().getWorkOrderId()));
		
		device.settaskId(getTaskId(taskList));
		
		if(getCitemClass(item).toUpperCase() == "SERVICE")
		   device.setcitemId(getCitemId(item));
		else
			device.setcitemId("");
		
		if((getCitemClass(item).toUpperCase() == "SERVICE") && (getCitemType(item).toUpperCase() == "EQUIPMENT"))
			device.setresourceId(getCitemId(item));	
		else
			device.setresourceId("");
		
		if((getCitemClass(item).toUpperCase() == "SERVICE") && (getCitemType(item).toUpperCase() == "EQUIPMENT") && (getAccount(addattribute).toUpperCase() == "ACCESS_POINT_NUMBER"))
			device.setmacAddress2(getCitemId(item));
		else
			device.setmacAddress2(getCitemId(item));
		
		device.setState(getStatus(item));
		//device.setcreateDate(requestYtbl.getcreateDate());
		//device.setupdateDate(requestYtbl.getupdateDate());
		
		interfaceDevice.saveDevice(device);
	}
	
	public void saveMaterials(CloseWorkOrder cwo){
		Ytbl_Materials material = new Ytbl_Materials();
		
		material.setrequestId(wcotmp.getId());
		material.setprocessId(Integer.parseInt(cwo.getWorkOrderItem().getProcessId()));
		material.setworkOrderId(cwo.getWorkOrderItem().getWorkOrderId());
		
		material.settaskId(getTaskId(taskList));
		//material.setcodeMaterial();
		//material.setnumberMaterial();
		interfaceMaterials.saveMaterials(material);
	}
	
	
	public void saveResponse(String Error){
		Ytbl_Response_CloseWorkOrder response = new Ytbl_Response_CloseWorkOrder();
		Calendar sysdate = new GregorianCalendar();
		
			
		if (Error.equals("OK")) {
			response.setCode("0");
		    response.setDescription(Error);
		}else{
			response.setCode("1");
		    response.setDescription(Error);
		}
			
			
		response.setdateError(sysdate.getTime());
		
		transactionResponseCWO.saveResponse(response);
		
	}
	
	
	private void processTask(){		
		taskList = new ArrayList<TaskList>();
		
		for(TaskList taskListTMP : workCloseOrderRequest.getWorkOrderItem().getTasksList().getTask()){
				taskList.add(taskListTMP);
		}		
	}
	
	  
	 private void processAttribute(List<TaskList> parameter){
		 addattribute = new ArrayList<AdditionalAttribute>();
		 
		 for(TaskList attributesTMP : parameter){
			 addattribute.addAll(attributesTMP.getAttributes().getAttribute());
		 } 
	 }
	 
	 private void processItem(List<TaskList> parameter){
		 item = new ArrayList<Item>();
		 
		 for (TaskList itemTMP : parameter){
			 item.addAll(itemTMP.getInventory().getItems().getItem());
		 }
		 
	 }
	 
	 
	 
	 
		
	 
	
		
	private String getTaskId(List<TaskList> parameter){
		String idTask = new String();
		
		for(TaskList parametro : parameter){
			idTask = parametro.getTaskId();
			
		}
		return idTask;
	}
	
	private String getCparty(List<TaskList> parameter){
		String cparty = new String();
		
		for(TaskList parametro : parameter){
			cparty = parametro.getCustomer().getCustomerId();
		}
		
		return cparty;
	}
	
	private String getAccount(List<AdditionalAttribute> parameter){
		 String account =new  String();
		
		for(AdditionalAttribute parametro : parameter){
			account = parametro.getName();
		}
		return account;
	}
	
	private Date getProcessDateCreation(List<TaskList> parameter){
		Date date = new Date();
		
		for(TaskList parametro : parameter){
			date = parametro.getRealizationInterval().getDateFrom();
		}
		return date;
	}
	
	private String getLongitude(List<TaskList> parameter){
		String longitude = new String();
		
		for(TaskList parametro : parameter){
			longitude = Integer.toString(parametro.getCustomer().getLocation().getLongitude());
		}
		return longitude;
	}
	
	private String getLatitude(List<TaskList> parameter){
		String latitude = new String();
		
		for(TaskList parametro : parameter){
			latitude = Integer.toString(parametro.getCustomer().getLocation().getLongitude());
		}
		return latitude;
	}
	
	private String getExecutor(List<TaskList> parameter){
		String executor = new String();
		
		for(TaskList parametro : parameter){
			executor = parametro.getExecutor().getExecutorId();
		}
		return executor;
	}
	
	private Date getDateFrom(List<TaskList> parameter){
		Date executor = new Date();
		
		for(TaskList parametro : parameter){
			executor = parametro.getRealizationInterval().getDateFrom();
		}
		return executor;
	}
	
	private Date getDateto(List<TaskList> parameter){
		Date executor = new Date();
		
		for(TaskList parametro : parameter){
			executor = parametro.getRealizationInterval().getDateTo();
		}
		return executor;
	}
	
	private String getNodeId(List<TaskList> parameter){
		String executor = new String();
		
		for(TaskList parametro : parameter){
			executor = parametro.getInventory().getNode().getNodeId();
		}
		return executor;
	}
	
	private String getCitemId(List<Item> parameter){
		String dato = new String();
		
		for(Item parametro : parameter){
			dato = parametro.getItemKey().getItemId();
		}
		
		return dato;
	}
	
	private String getCitemClass(List<Item> parameter){
		String dato = new String();
		
		for(Item parametro : parameter){
			dato = parametro.getItemKey().getItemClass();
			
		}
		
		return dato;
	}
	
	private String getCitemType(List<Item> parameter){
		String dato = new String();
		
		for(Item parametro : parameter){
			dato = parametro.getItemKey().getItemType();
		}
		
		return dato;
	}
	
	private String getStatus(List<Item> parameter){
		String dato = new String();
		
		for(Item parametro : parameter){
			dato = parametro.getStatus();
			
		}
		
		return dato;
	}
	
   

}
