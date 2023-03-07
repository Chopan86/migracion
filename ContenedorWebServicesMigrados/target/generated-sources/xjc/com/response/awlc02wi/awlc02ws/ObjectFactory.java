//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.07 a las 04:06:18 PM CLST 
//


package com.response.awlc02wi.awlc02ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.response.awlc02wi.awlc02ws package. 
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

    private final static QName _AWLC02WSOperationResponse_QNAME = new QName("http://www.AWLC02WS.AWLC02WI.Response.com", "AWLC02WSOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.response.awlc02wi.awlc02ws
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
     * Create an instance of {@link ProgramInterface.Awlc02WoSalida }
     * 
     */
    public ProgramInterface.Awlc02WoSalida createProgramInterfaceAwlc02WoSalida() {
        return new ProgramInterface.Awlc02WoSalida();
    }

    /**
     * Create an instance of {@link ProgramInterface.Awlc02WoSalida.Awlc02WoOLineas }
     * 
     */
    public ProgramInterface.Awlc02WoSalida.Awlc02WoOLineas createProgramInterfaceAwlc02WoSalidaAwlc02WoOLineas() {
        return new ProgramInterface.Awlc02WoSalida.Awlc02WoOLineas();
    }

    /**
     * Create an instance of {@link ProgramInterface.Awlc02WoSalida.Awlc02WoOLineas.Awlc02WoODireccionCob }
     * 
     */
    public ProgramInterface.Awlc02WoSalida.Awlc02WoOLineas.Awlc02WoODireccionCob createProgramInterfaceAwlc02WoSalidaAwlc02WoOLineasAwlc02WoODireccionCob() {
        return new ProgramInterface.Awlc02WoSalida.Awlc02WoOLineas.Awlc02WoODireccionCob();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.AWLC02WS.AWLC02WI.Response.com", name = "AWLC02WSOperationResponse")
    public JAXBElement<ProgramInterface> createAWLC02WSOperationResponse(ProgramInterface value) {
        return new JAXBElement<ProgramInterface>(_AWLC02WSOperationResponse_QNAME, ProgramInterface.class, null, value);
    }

}
