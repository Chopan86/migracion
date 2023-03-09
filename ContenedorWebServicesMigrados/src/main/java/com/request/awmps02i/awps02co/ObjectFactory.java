//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.09 a las 01:48:07 AM CLST 
//


package com.request.awmps02i.awps02co;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.request.awmps02i.awps02co package. 
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

    private final static QName _AWPS02COOperation_QNAME = new QName("http://www.AWPS02CO.AWMPS02I.Request.com", "AWPS02COOperation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.request.awmps02i.awps02co
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
     * Create an instance of {@link ProgramInterface.Awps02CoEntrada }
     * 
     */
    public ProgramInterface.Awps02CoEntrada createProgramInterfaceAwps02CoEntrada() {
        return new ProgramInterface.Awps02CoEntrada();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.AWPS02CO.AWMPS02I.Request.com", name = "AWPS02COOperation")
    public JAXBElement<ProgramInterface> createAWPS02COOperation(ProgramInterface value) {
        return new JAXBElement<ProgramInterface>(_AWPS02COOperation_QNAME, ProgramInterface.class, null, value);
    }

}
