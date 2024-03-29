package com.tvcable.ec.workorder;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.log4j.Logger;

public class JabxConverter {

	private static Logger logger = Logger.getLogger(WorkOrderBean.class);
	
	public static  <T>  String objectToXMLString(T object){
		try {
			JAXBContext context = JAXBContext.newInstance(object.getClass());
			Marshaller marshaller = context.createMarshaller();
			StringWriter sw = new StringWriter();
			marshaller.marshal(object, sw);
			return sw.toString();
		} catch (JAXBException e) {
			logger.error(e);
			return null;
		}
	}
}
