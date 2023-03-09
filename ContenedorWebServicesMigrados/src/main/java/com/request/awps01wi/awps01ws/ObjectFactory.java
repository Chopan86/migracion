//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.09 a las 02:24:26 PM CLST 
//


package com.request.awps01wi.awps01ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.request.awps01wi.awps01ws package. 
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

    private final static QName _AWPS01WSOperation_QNAME = new QName("http://www.AWPS01WS.AWPS01WI.Request.com", "AWPS01WSOperation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.request.awps01wi.awps01ws
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
     * Create an instance of {@link ProgramInterface.Awps01CoEntrada }
     * 
     */
    public ProgramInterface.Awps01CoEntrada createProgramInterfaceAwps01CoEntrada() {
        return new ProgramInterface.Awps01CoEntrada();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.AWPS01WS.AWPS01WI.Request.com", name = "AWPS01WSOperation")
    public JAXBElement<ProgramInterface> createAWPS01WSOperation(ProgramInterface value) {
        return new JAXBElement<ProgramInterface>(_AWPS01WSOperation_QNAME, ProgramInterface.class, null, value);
    }

}
