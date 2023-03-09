//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.09 a las 01:48:07 AM CLST 
//


package com.response.awmps02i.awps02co;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.response.awmps02i.awps02co package. 
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

    private final static QName _AWPS02COOperationResponse_QNAME = new QName("http://www.AWPS02CO.AWMPS02I.Response.com", "AWPS02COOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.response.awmps02i.awps02co
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
     * Create an instance of {@link ProgramInterface.Awps02CoSalida }
     * 
     */
    public ProgramInterface.Awps02CoSalida createProgramInterfaceAwps02CoSalida() {
        return new ProgramInterface.Awps02CoSalida();
    }

    /**
     * Create an instance of {@link ProgramInterface.Awps02CoSalida.Awps02CoOPiCliente }
     * 
     */
    public ProgramInterface.Awps02CoSalida.Awps02CoOPiCliente createProgramInterfaceAwps02CoSalidaAwps02CoOPiCliente() {
        return new ProgramInterface.Awps02CoSalida.Awps02CoOPiCliente();
    }

    /**
     * Create an instance of {@link ProgramInterface.Awps02CoSalida.Awps02CoOPiCliente.Awps02CoOPiCliente2 }
     * 
     */
    public ProgramInterface.Awps02CoSalida.Awps02CoOPiCliente.Awps02CoOPiCliente2 createProgramInterfaceAwps02CoSalidaAwps02CoOPiClienteAwps02CoOPiCliente2() {
        return new ProgramInterface.Awps02CoSalida.Awps02CoOPiCliente.Awps02CoOPiCliente2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.AWPS02CO.AWMPS02I.Response.com", name = "AWPS02COOperationResponse")
    public JAXBElement<ProgramInterface> createAWPS02COOperationResponse(ProgramInterface value) {
        return new JAXBElement<ProgramInterface>(_AWPS02COOperationResponse_QNAME, ProgramInterface.class, null, value);
    }

}
