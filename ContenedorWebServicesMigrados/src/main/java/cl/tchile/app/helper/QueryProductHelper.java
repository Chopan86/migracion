/**
 * 
 */
package cl.tchile.app.helper;

import javax.xml.bind.JAXBException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.telefonica.midrange.queryproductservice.types.Product;
import com.telefonica.midrange.queryproductservice.types.QueryproductResponse;
import com.telefonica.midrange.queryproductservice.types.ResponseMsj;

import cl.tchile.app.vo.QueryProductResponseVO;


/**
 * 
 *
 */
@Component
public class QueryProductHelper {
	
	public QueryproductResponse setResponseQueryProduct() throws JAXBException{
//		String xmlR ="";
		String xmlR ="<ResponseMsj>\r\n"
				+ "            <codError>000</codError>\r\n"
				+ "            <msgError>Proceso Exitoso.</msgError>\r\n"
				+ "         </ResponseMsj>\r\n"
				+ "         <ResponseData>\r\n"
				+ "            <idType>fonoFijo</idType>\r\n"
				+ "            <id>000000000000000228353426</id>\r\n"
				+ "            <name>VOZ+BA</name>\r\n"
				+ "            <description>DUO MULTILINEA</description>\r\n"
				+ "            <productBundle>\r\n"
				+ "               <idType>fonoFijo</idType>\r\n"
				+ "               <id>000000000000000228353426</id>\r\n"
				+ "               <name>VOZ</name>\r\n"
				+ "               <description>TDM</description>\r\n"
				+ "               <productStatus>VIGENTE</productStatus>\r\n"
				+ "               <productSerialNumber>107288385325</productSerialNumber>\r\n"
				+ "               <validFor>\r\n"
				+ "                  <startDateTime>2014-09-29T03:00:00.000Z</startDateTime>\r\n"
				+ "                  <endDateTime>9999-01-01T03:00:00.000Z</endDateTime>\r\n"
				+ "               </validFor>\r\n"
				+ "               <productCharacteristic>\r\n"
				+ "                  <idPs>000007187</idPs>\r\n"
				+ "                  <descPs>NO AFECTO UMBRAL B. ANCHA FIJA</descPs>\r\n"
				+ "                  <idFam>03</idFam>\r\n"
				+ "                  <descFam>OTROS</descFam>\r\n"
				+ "                  <idSubg1>00303</idSubg1>\r\n"
				+ "                  <descSubg1>MARCAS ESPECIALES</descSubg1>\r\n"
				+ "                  <idSubg2>30305</idSubg2>\r\n"
				+ "                  <descSubg2>Marca de Lineas</descSubg2>\r\n"
				+ "                  <talla/>\r\n"
				+ "                  <validFor>\r\n"
				+ "                     <startDateTime>2016-01-19T03:00:00.000Z</startDateTime>\r\n"
				+ "                     <endDateTime>9999-01-01T03:00:00.000Z</endDateTime>\r\n"
				+ "                  </validFor>\r\n"
				+ "               </productCharacteristic>\r\n"
				+ "               <productCharacteristic>\r\n"
				+ "                  <idPs>000005825</idPs>\r\n"
				+ "                  <descPs>PLAN MIN ILIMITADO LOC HOGAR</descPs>\r\n"
				+ "                  <idFam>04</idFam>\r\n"
				+ "                  <descFam>STB</descFam>\r\n"
				+ "                  <idSubg1>00407</idSubg1>\r\n"
				+ "                  <descSubg1>PLANES DE MINUTOS</descSubg1>\r\n"
				+ "                  <idSubg2>40701</idSubg2>\r\n"
				+ "                  <descSubg2>Planes Alto Consumo</descSubg2>\r\n"
				+ "                  <talla/>\r\n"
				+ "                  <validFor>\r\n"
				+ "                     <startDateTime>2014-09-29T03:00:00.000Z</startDateTime>\r\n"
				+ "                     <endDateTime>9999-01-01T03:00:00.000Z</endDateTime>\r\n"
				+ "                  </validFor>\r\n"
				+ "               </productCharacteristic>\r\n"
				+ "               <productCharacteristic>\r\n"
				+ "                  <idPs>000005659</idPs>\r\n"
				+ "                  <descPs>GARANTIA SERV TELEF NEGOCIOS</descPs>\r\n"
				+ "                  <idFam>03</idFam>\r\n"
				+ "                  <descFam>OTROS</descFam>\r\n"
				+ "                  <idSubg1>00303</idSubg1>\r\n"
				+ "                  <descSubg1>MARCAS ESPECIALES</descSubg1>\r\n"
				+ "                  <idSubg2>30305</idSubg2>\r\n"
				+ "                  <descSubg2>Marca de Lineas</descSubg2>\r\n"
				+ "                  <talla/>\r\n"
				+ "                  <validFor>\r\n"
				+ "                     <startDateTime>2012-11-24T03:00:00.000Z</startDateTime>\r\n"
				+ "                     <endDateTime>9999-01-01T03:00:00.000Z</endDateTime>\r\n"
				+ "                  </validFor>\r\n"
				+ "               </productCharacteristic>\r\n"
				+ "               <productCharacteristic>\r\n"
				+ "                  <idPs>000005657</idPs>\r\n"
				+ "                  <descPs>PLAN TARIFARIO MOVIL TN</descPs>\r\n"
				+ "                  <idFam>01</idFam>\r\n"
				+ "                  <descFam>EQUIPOS</descFam>\r\n"
				+ "                  <idSubg1>00104</idSubg1>\r\n"
				+ "                  <descSubg1>EQUIPOS RESIDENCIALES</descSubg1>\r\n"
				+ "                  <idSubg2>10415</idSubg2>\r\n"
				+ "                  <descSubg2>Servicios No Catalogados</descSubg2>\r\n"
				+ "                  <talla/>\r\n"
				+ "                  <validFor>\r\n"
				+ "                     <startDateTime>2012-11-24T03:00:00.000Z</startDateTime>\r\n"
				+ "                     <endDateTime>9999-01-01T03:00:00.000Z</endDateTime>\r\n"
				+ "                  </validFor>\r\n"
				+ "               </productCharacteristic>\r\n"
				+ "               <productCharacteristic>\r\n"
				+ "                  <idPs>000000007</idPs>\r\n"
				+ "                  <descPs>ITI 1RA LINEA C/EQUIPO</descPs>\r\n"
				+ "                  <idFam>03</idFam>\r\n"
				+ "                  <descFam>OTROS</descFam>\r\n"
				+ "                  <idSubg1>00306</idSubg1>\r\n"
				+ "                  <descSubg1>PRUEBAS</descSubg1>\r\n"
				+ "                  <idSubg2>30601</idSubg2>\r\n"
				+ "                  <descSubg2>Servicios No Catalogados</descSubg2>\r\n"
				+ "                  <talla/>\r\n"
				+ "                  <validFor>\r\n"
				+ "                     <startDateTime>2012-11-24T03:00:00.000Z</startDateTime>\r\n"
				+ "                     <endDateTime>9999-01-01T03:00:00.000Z</endDateTime>\r\n"
				+ "                  </validFor>\r\n"
				+ "               </productCharacteristic>\r\n"
				+ "               <customerFacingService>\r\n"
				+ "                  <isServiceEnabled>false</isServiceEnabled>\r\n"
				+ "                  <hasStarted>false</hasStarted>\r\n"
				+ "                  <isMandatory>false</isMandatory>\r\n"
				+ "                  <startMode>0</startMode>\r\n"
				+ "                  <isStateful>false</isStateful>\r\n"
				+ "                  <commonName>000007095</commonName>\r\n"
				+ "                  <description>PLAN 300 MINUTOS FIJO MOVIL</description>\r\n"
				+ "                  <objectID>348953506140</objectID>\r\n"
				+ "                  <cfsStatus>0</cfsStatus>\r\n"
				+ "               </customerFacingService>\r\n"
				+ "            </productBundle>\r\n"
				+ "            <productBundle>\r\n"
				+ "               <idType>fonoFijo</idType>\r\n"
				+ "               <id>000000000000000228353426</id>\r\n"
				+ "               <name>BA</name>\r\n"
				+ "               <description>ADSL+S</description>\r\n"
				+ "               <productStatus>VIGENTE</productStatus>\r\n"
				+ "               <productSerialNumber>548549190419</productSerialNumber>\r\n"
				+ "               <validFor>\r\n"
				+ "                  <startDateTime>2019-07-05T04:00:00.000Z</startDateTime>\r\n"
				+ "                  <endDateTime>9999-01-01T03:00:00.000Z</endDateTime>\r\n"
				+ "               </validFor>\r\n"
				+ "               <productCharacteristic>\r\n"
				+ "                  <idPs>000007425</idPs>\r\n"
				+ "                  <descPs>DUOBA ADSL HASTA 8MB (DUO)</descPs>\r\n"
				+ "                  <idFam>02</idFam>\r\n"
				+ "                  <descFam>INTERNET</descFam>\r\n"
				+ "                  <idSubg1>00208</idSubg1>\r\n"
				+ "                  <descSubg1>PLANES BANDA ANCHA MS VOZ</descSubg1>\r\n"
				+ "                  <idSubg2>20817</idSubg2>\r\n"
				+ "                  <descSubg2>Mono Usuario 300</descSubg2>\r\n"
				+ "                  <talla/>\r\n"
				+ "                  <validFor>\r\n"
				+ "                     <startDateTime>2019-07-05T04:00:00.000Z</startDateTime>\r\n"
				+ "                     <endDateTime>9999-01-01T03:00:00.000Z</endDateTime>\r\n"
				+ "                  </validFor>\r\n"
				+ "               </productCharacteristic>\r\n"
				+ "               <productCharacteristic>\r\n"
				+ "                  <idPs>000007153</idPs>\r\n"
				+ "                  <descPs>PLAN ADSL 6MB/550KB</descPs>\r\n"
				+ "                  <idFam>02</idFam>\r\n"
				+ "                  <descFam>INTERNET</descFam>\r\n"
				+ "                  <idSubg1>00204</idSubg1>\r\n"
				+ "                  <descSubg1>CONTRATOS INTERNET</descSubg1>\r\n"
				+ "                  <idSubg2>20401</idSubg2>\r\n"
				+ "                  <descSubg2>Planes Acceso Speedy</descSubg2>\r\n"
				+ "                  <talla>S</talla>\r\n"
				+ "                  <validFor>\r\n"
				+ "                     <startDateTime>2019-07-05T04:00:00.000Z</startDateTime>\r\n"
				+ "                     <endDateTime>9999-01-01T03:00:00.000Z</endDateTime>\r\n"
				+ "                  </validFor>\r\n"
				+ "               </productCharacteristic>\r\n"
				+ "               <productCharacteristic>\r\n"
				+ "                  <idPs>000007152</idPs>\r\n"
				+ "                  <descPs>ACCESO ADSL 6MB</descPs>\r\n"
				+ "                  <idFam>02</idFam>\r\n"
				+ "                  <descFam>INTERNET</descFam>\r\n"
				+ "                  <idSubg1>00201</idSubg1>\r\n"
				+ "                  <descSubg1>ACCESO XDSL</descSubg1>\r\n"
				+ "                  <idSubg2>20101</idSubg2>\r\n"
				+ "                  <descSubg2>Complementos Speedy</descSubg2>\r\n"
				+ "                  <talla>S</talla>\r\n"
				+ "                  <validFor>\r\n"
				+ "                     <startDateTime>2019-07-05T04:00:00.000Z</startDateTime>\r\n"
				+ "                     <endDateTime>9999-01-01T03:00:00.000Z</endDateTime>\r\n"
				+ "                  </validFor>\r\n"
				+ "               </productCharacteristic>\r\n"
				+ "               <productCharacteristic>\r\n"
				+ "                  <idPs>000001203</idPs>\r\n"
				+ "                  <descPs>PROCESO PROVISION SPEEDY</descPs>\r\n"
				+ "                  <idFam>02</idFam>\r\n"
				+ "                  <descFam>INTERNET</descFam>\r\n"
				+ "                  <idSubg1>00211</idSubg1>\r\n"
				+ "                  <descSubg1>SERVICIO INTERNET</descSubg1>\r\n"
				+ "                  <idSubg2>21101</idSubg2>\r\n"
				+ "                  <descSubg2>Casillas</descSubg2>\r\n"
				+ "                  <talla/>\r\n"
				+ "                  <validFor>\r\n"
				+ "                     <startDateTime>2012-11-24T03:00:00.000Z</startDateTime>\r\n"
				+ "                     <endDateTime>9999-01-01T03:00:00.000Z</endDateTime>\r\n"
				+ "                  </validFor>\r\n"
				+ "               </productCharacteristic>\r\n"
				+ "               <productCharacteristic>\r\n"
				+ "                  <idPs>000001199</idPs>\r\n"
				+ "                  <descPs>MODEM SPEEDY</descPs>\r\n"
				+ "                  <idFam>12</idFam>\r\n"
				+ "                  <descFam>SVA DE BA</descFam>\r\n"
				+ "                  <idSubg1>01201</idSubg1>\r\n"
				+ "                  <descSubg1>VARIOS BA</descSubg1>\r\n"
				+ "                  <idSubg2>12011</idSubg2>\r\n"
				+ "                  <descSubg2>VARIOS BA</descSubg2>\r\n"
				+ "                  <talla/>\r\n"
				+ "                  <validFor>\r\n"
				+ "                     <startDateTime>2012-11-24T03:00:00.000Z</startDateTime>\r\n"
				+ "                     <endDateTime>9999-01-01T03:00:00.000Z</endDateTime>\r\n"
				+ "                  </validFor>\r\n"
				+ "               </productCharacteristic>\r\n"
				+ "               <customerFacingService>\r\n"
				+ "                  <isServiceEnabled>false</isServiceEnabled>\r\n"
				+ "                  <hasStarted>false</hasStarted>\r\n"
				+ "                  <isMandatory>false</isMandatory>\r\n"
				+ "                  <startMode>0</startMode>\r\n"
				+ "                  <isStateful>false</isStateful>\r\n"
				+ "                  <commonName>000007095</commonName>\r\n"
				+ "                  <description>PLAN 300 MINUTOS FIJO MOVIL</description>\r\n"
				+ "                  <objectID>348953506140</objectID>\r\n"
				+ "                  <cfsStatus>0</cfsStatus>\r\n"
				+ "               </customerFacingService>\r\n"
				+ "            </productBundle>\r\n"
				+ "         </ResponseData>\r\n"
				+ "";
		QueryproductResponse response = new QueryproductResponse();
		ResponseMsj salidaMsj = new ResponseMsj();
		try {
			xmlR = xmlR.replace("resp", "");
			JSONObject soapDatainJsonObject = XML.toJSONObject(xmlR);
			
			
			
			String sJson = new Gson().toJson(soapDatainJsonObject);
			
			//recorrer json - modificar a listas.
			
			QueryProductResponseVO rBD = new Gson().fromJson(soapDatainJsonObject.toString(), QueryProductResponseVO.class);
			salidaMsj.setCodError(rBD.getResponseMsj().getCodError());
			salidaMsj.setMsgError(rBD.getResponseMsj().getMsgError());
			
			Product responseData = new Product();
			responseData.setIdType(rBD.getResponseData().getIdType());
			responseData.setId(rBD.getResponseData().getId());
			responseData.setDescription(rBD.getResponseData().getDescription());
			responseData.setName(rBD.getResponseData().getName());
			//continuar

			response.setResponseMsj(salidaMsj);
			response.getResponseData().set(0, responseData);
		}catch(Exception e) {
			System.out.println();
		}
		return response;
	}
}
