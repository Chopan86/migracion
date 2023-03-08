//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.08 a las 12:48:28 AM CLST 
//


package com.response.awlc01wi.awlc01ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.response.awlc01wi.awlc01ws package. 
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

    private final static QName _AWLC01WSOperationResponse_QNAME = new QName("http://www.AWLC01WS.AWLC01WI.Response.com", "AWLC01WSOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.response.awlc01wi.awlc01ws
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
     * Create an instance of {@link ProgramInterface.Awlc01Z3Salida }
     * 
     */
    public ProgramInterface.Awlc01Z3Salida createProgramInterfaceAwlc01Z3Salida() {
        return new ProgramInterface.Awlc01Z3Salida();
    }

    /**
     * Create an instance of {@link ProgramInterface.Awlc01Z3Salida.Awlc01Z3OLineas }
     * 
     */
    public ProgramInterface.Awlc01Z3Salida.Awlc01Z3OLineas createProgramInterfaceAwlc01Z3SalidaAwlc01Z3OLineas() {
        return new ProgramInterface.Awlc01Z3Salida.Awlc01Z3OLineas();
    }

    /**
     * Create an instance of {@link ProgramInterface.Awlc01Z3Salida.Awlc01Z3OLineas.Awlc01Z3ODireccionCob }
     * 
     */
    public ProgramInterface.Awlc01Z3Salida.Awlc01Z3OLineas.Awlc01Z3ODireccionCob createProgramInterfaceAwlc01Z3SalidaAwlc01Z3OLineasAwlc01Z3ODireccionCob() {
        return new ProgramInterface.Awlc01Z3Salida.Awlc01Z3OLineas.Awlc01Z3ODireccionCob();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.AWLC01WS.AWLC01WI.Response.com", name = "AWLC01WSOperationResponse")
    public JAXBElement<ProgramInterface> createAWLC01WSOperationResponse(ProgramInterface value) {
        return new JAXBElement<ProgramInterface>(_AWLC01WSOperationResponse_QNAME, ProgramInterface.class, null, value);
    }

}
