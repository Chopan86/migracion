//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.07 a las 11:59:19 AM CLST 
//


package com.request.awlc02wi.awlc02ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.request.awlc02wi.awlc02ws package. 
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

    private final static QName _AWLC02WSOperation_QNAME = new QName("http://www.AWLC02WS.AWLC02WI.Request.com", "AWLC02WSOperation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.request.awlc02wi.awlc02ws
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
     * Create an instance of {@link ProgramInterface.Awlc02WiEntrada }
     * 
     */
    public ProgramInterface.Awlc02WiEntrada createProgramInterfaceAwlc02WiEntrada() {
        return new ProgramInterface.Awlc02WiEntrada();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.AWLC02WS.AWLC02WI.Request.com", name = "AWLC02WSOperation")
    public JAXBElement<ProgramInterface> createAWLC02WSOperation(ProgramInterface value) {
        return new JAXBElement<ProgramInterface>(_AWLC02WSOperation_QNAME, ProgramInterface.class, null, value);
    }

}
