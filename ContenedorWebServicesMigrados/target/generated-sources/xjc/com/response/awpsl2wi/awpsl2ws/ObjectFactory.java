//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.09 a las 03:51:20 PM CLST 
//


package com.response.awpsl2wi.awpsl2ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.response.awpsl2wi.awpsl2ws package. 
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

    private final static QName _AWPSL2WSOperationResponse_QNAME = new QName("http://www.AWPSL2WS.AWPSL2WI.Response.com", "AWPSL2WSOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.response.awpsl2wi.awpsl2ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProgramInterface }
     * 
     */
    public ProgramInterface createProgramInterface() {
        return new ProgramInterface();
    }

    /**
     * Create an instance of {@link ProgramInterface.Awpsl2Wo }
     * 
     */
    public ProgramInterface.Awpsl2Wo createProgramInterfaceAwpsl2Wo() {
        return new ProgramInterface.Awpsl2Wo();
    }

    /**
     * Create an instance of {@link ProgramInterface.Awpsl2Wo.Awpsl2WoSalida }
     * 
     */
    public ProgramInterface.Awpsl2Wo.Awpsl2WoSalida createProgramInterfaceAwpsl2WoAwpsl2WoSalida() {
        return new ProgramInterface.Awpsl2Wo.Awpsl2WoSalida();
    }

    /**
     * Create an instance of {@link ProgramInterface.Awpsl2Wo.Awpsl2WoListaPs }
     * 
     */
    public ProgramInterface.Awpsl2Wo.Awpsl2WoListaPs createProgramInterfaceAwpsl2WoAwpsl2WoListaPs() {
        return new ProgramInterface.Awpsl2Wo.Awpsl2WoListaPs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.AWPSL2WS.AWPSL2WI.Response.com", name = "AWPSL2WSOperationResponse")
    public JAXBElement<ProgramInterface> createAWPSL2WSOperationResponse(ProgramInterface value) {
        return new JAXBElement<ProgramInterface>(_AWPSL2WSOperationResponse_QNAME, ProgramInterface.class, null, value);
    }

}
