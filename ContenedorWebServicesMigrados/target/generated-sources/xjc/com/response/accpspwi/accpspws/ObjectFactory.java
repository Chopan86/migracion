//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.08 a las 12:48:28 AM CLST 
//


package com.response.accpspwi.accpspws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.response.accpspwi.accpspws package. 
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

    private final static QName _ACCPSPWSOperationResponse_QNAME = new QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", "ACCPSPWSOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.response.accpspwi.accpspws
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
     * Create an instance of {@link ProgramInterface.AccpspwoSalida }
     * 
     */
    public ProgramInterface.AccpspwoSalida createProgramInterfaceAccpspwoSalida() {
        return new ProgramInterface.AccpspwoSalida();
    }

    /**
     * Create an instance of {@link ProgramInterface.AccpspwoSalida.AccpspwoOLineas }
     * 
     */
    public ProgramInterface.AccpspwoSalida.AccpspwoOLineas createProgramInterfaceAccpspwoSalidaAccpspwoOLineas() {
        return new ProgramInterface.AccpspwoSalida.AccpspwoOLineas();
    }

    /**
     * Create an instance of {@link ProgramInterface.AccpspwoSalida.AccpspwoOLineas.AccpspwoPsLineas }
     * 
     */
    public ProgramInterface.AccpspwoSalida.AccpspwoOLineas.AccpspwoPsLineas createProgramInterfaceAccpspwoSalidaAccpspwoOLineasAccpspwoPsLineas() {
        return new ProgramInterface.AccpspwoSalida.AccpspwoOLineas.AccpspwoPsLineas();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ACCPSPWS.ACCPSPWI.Response.com", name = "ACCPSPWSOperationResponse")
    public JAXBElement<ProgramInterface> createACCPSPWSOperationResponse(ProgramInterface value) {
        return new JAXBElement<ProgramInterface>(_ACCPSPWSOperationResponse_QNAME, ProgramInterface.class, null, value);
    }

}
