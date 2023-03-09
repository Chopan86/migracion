//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.09 a las 02:27:30 PM CLST 
//


package com.response.awmlip8i.awliw8co;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.response.awmlip8i.awliw8co package. 
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

    private final static QName _AWLIW8COOperationResponse_QNAME = new QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "AWLIW8COOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.response.awmlip8i.awliw8co
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
     * Create an instance of {@link ProgramInterface.Awlip8CoSalida }
     * 
     */
    public ProgramInterface.Awlip8CoSalida createProgramInterfaceAwlip8CoSalida() {
        return new ProgramInterface.Awlip8CoSalida();
    }

    /**
     * Create an instance of {@link ProgramInterface.Awlip8CoSalida.Awlip8CoOPiCliente }
     * 
     */
    public ProgramInterface.Awlip8CoSalida.Awlip8CoOPiCliente createProgramInterfaceAwlip8CoSalidaAwlip8CoOPiCliente() {
        return new ProgramInterface.Awlip8CoSalida.Awlip8CoOPiCliente();
    }

    /**
     * Create an instance of {@link ProgramInterface.Awlip8CoSalida.Awlip8CoOPiCliente.Awlip8CoOPiCliente2 }
     * 
     */
    public ProgramInterface.Awlip8CoSalida.Awlip8CoOPiCliente.Awlip8CoOPiCliente2 createProgramInterfaceAwlip8CoSalidaAwlip8CoOPiClienteAwlip8CoOPiCliente2() {
        return new ProgramInterface.Awlip8CoSalida.Awlip8CoOPiCliente.Awlip8CoOPiCliente2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.AWLIW8CO.AWMLIP8I.Response.com", name = "AWLIW8COOperationResponse")
    public JAXBElement<ProgramInterface> createAWLIW8COOperationResponse(ProgramInterface value) {
        return new JAXBElement<ProgramInterface>(_AWLIW8COOperationResponse_QNAME, ProgramInterface.class, null, value);
    }

}
