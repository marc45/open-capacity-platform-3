
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package cn.chinaunicom.ws.srenewser;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.open.capacity.service.SrenewSerUtils;

/**
 * This class was generated by Apache CXF 2.2.12 Tue Apr 17 09:41:55 GMT+08:00
 * 2018 Generated source version: 2.2.12
 * 
 */

@javax.jws.WebService(serviceName = "SrenewSer", portName = "SrenewSerSOAP", targetNamespace = "http://ws.chinaunicom.cn/SrenewSer/", wsdlLocation = "classpath:META-INF/SrenewSer/META-INF/SrenewSer.wsdl", endpointInterface = "cn.chinaunicom.ws.srenewser.SrenewSer")

public class SrenewSerImpl implements SrenewSer {

	private static final Logger LOG = Logger.getLogger(SrenewSerImpl.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.chinaunicom.ws.srenewser.SrenewSer#qryChgProd(cn.chinaunicom.ws.
	 * srenewser.unibssbody.QRYCHGPRODINPUT parameters )*
	 */
	public cn.chinaunicom.ws.srenewser.unibssbody.QRYCHGPRODOUTPUT qryChgProd(
			cn.chinaunicom.ws.srenewser.unibssbody.QRYCHGPRODINPUT parameters) {

		try {
			cn.chinaunicom.ws.srenewser.unibssbody.QRYCHGPRODOUTPUT _return = SrenewSerUtils.getInstance()
					.qryChgProd(parameters);
			return _return;
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.chinaunicom.ws.srenewser.SrenewSer#srenewTrade(cn.chinaunicom.ws.
	 * srenewser.unibssbody.SRENEWTRADEINPUT parameters )*
	 */
	public cn.chinaunicom.ws.srenewser.unibssbody.SRENEWTRADEOUTPUT srenewTrade(
			cn.chinaunicom.ws.srenewser.unibssbody.SRENEWTRADEINPUT parameters) {

		try {
			cn.chinaunicom.ws.srenewser.unibssbody.SRENEWTRADEOUTPUT _return = SrenewSerUtils.getInstance()
					.srenewTrade(parameters);
			return _return;
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.chinaunicom.ws.srenewser.SrenewSer#srenewSub(cn.chinaunicom.ws.
	 * srenewser.unibssbody.SRENEWSUBINPUT parameters )*
	 */
	public cn.chinaunicom.ws.srenewser.unibssbody.SRENEWSUBOUTPUT srenewSub(
			cn.chinaunicom.ws.srenewser.unibssbody.SRENEWSUBINPUT parameters) {

		try {
			cn.chinaunicom.ws.srenewser.unibssbody.SRENEWSUBOUTPUT _return = SrenewSerUtils.getInstance()
					.srenewSub(parameters);
			return _return;
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

}