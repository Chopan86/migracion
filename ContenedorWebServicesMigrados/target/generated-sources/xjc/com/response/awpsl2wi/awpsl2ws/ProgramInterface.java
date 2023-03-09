//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.09 a las 03:51:20 PM CLST 
//


package com.response.awpsl2wi.awpsl2ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProgramInterface complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProgramInterface"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="awpsl2wo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="awpsl2wo_salida" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="awpsl2wo_cod_ret"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_desc_ret"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_cod_db"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="4"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_parrafo"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_servicio"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="8"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_finpag"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="1"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_numreg"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                                   &lt;maxInclusive value="99"/&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awpsl2wo_lista_ps" maxOccurs="20" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="awpsl2wo_cod_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_desc_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_tip_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="1"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_fec_alta_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_cod_op"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_desc_op"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_cod_paq"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_nombre_paq"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="8"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_cod_fam"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="5"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_cod_sg1"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="5"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_cod_sg2"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="5"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_marca_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="1"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_cod_isp"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="2"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_des_subg1"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="35"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_des_subg2"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="35"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_est_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awpsl2wo_cant_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                                   &lt;maxInclusive value="999999999"/&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramInterface", propOrder = {
    "awpsl2Wo"
})
public class ProgramInterface {

    @XmlElement(name = "awpsl2wo")
    protected ProgramInterface.Awpsl2Wo awpsl2Wo;

    /**
     * Obtiene el valor de la propiedad awpsl2Wo.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInterface.Awpsl2Wo }
     *     
     */
    public ProgramInterface.Awpsl2Wo getAwpsl2Wo() {
        return awpsl2Wo;
    }

    /**
     * Define el valor de la propiedad awpsl2Wo.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInterface.Awpsl2Wo }
     *     
     */
    public void setAwpsl2Wo(ProgramInterface.Awpsl2Wo value) {
        this.awpsl2Wo = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="awpsl2wo_salida" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="awpsl2wo_cod_ret"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_desc_ret"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_cod_db"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="4"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_parrafo"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_servicio"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="8"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_finpag"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="1"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_numreg"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *                         &lt;maxInclusive value="99"/&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awpsl2wo_lista_ps" maxOccurs="20" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="awpsl2wo_cod_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_desc_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_tip_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="1"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_fec_alta_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="10"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_cod_op"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_desc_op"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_cod_paq"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_nombre_paq"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="8"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_cod_fam"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="5"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_cod_sg1"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="5"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_cod_sg2"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="5"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_marca_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="1"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_cod_isp"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="2"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_des_subg1"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="35"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_des_subg2"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="35"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_est_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="20"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awpsl2wo_cant_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *                         &lt;maxInclusive value="999999999"/&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "awpsl2WoSalida",
        "awpsl2WoListaPs"
    })
    public static class Awpsl2Wo {

        @XmlElement(name = "awpsl2wo_salida")
        protected ProgramInterface.Awpsl2Wo.Awpsl2WoSalida awpsl2WoSalida;
        @XmlElement(name = "awpsl2wo_lista_ps")
        protected List<ProgramInterface.Awpsl2Wo.Awpsl2WoListaPs> awpsl2WoListaPs;

        /**
         * Obtiene el valor de la propiedad awpsl2WoSalida.
         * 
         * @return
         *     possible object is
         *     {@link ProgramInterface.Awpsl2Wo.Awpsl2WoSalida }
         *     
         */
        public ProgramInterface.Awpsl2Wo.Awpsl2WoSalida getAwpsl2WoSalida() {
            return awpsl2WoSalida;
        }

        /**
         * Define el valor de la propiedad awpsl2WoSalida.
         * 
         * @param value
         *     allowed object is
         *     {@link ProgramInterface.Awpsl2Wo.Awpsl2WoSalida }
         *     
         */
        public void setAwpsl2WoSalida(ProgramInterface.Awpsl2Wo.Awpsl2WoSalida value) {
            this.awpsl2WoSalida = value;
        }

        /**
         * Gets the value of the awpsl2WoListaPs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the awpsl2WoListaPs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAwpsl2WoListaPs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProgramInterface.Awpsl2Wo.Awpsl2WoListaPs }
         * 
         * 
         */
        public List<ProgramInterface.Awpsl2Wo.Awpsl2WoListaPs> getAwpsl2WoListaPs() {
            if (awpsl2WoListaPs == null) {
                awpsl2WoListaPs = new ArrayList<ProgramInterface.Awpsl2Wo.Awpsl2WoListaPs>();
            }
            return this.awpsl2WoListaPs;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="awpsl2wo_cod_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_desc_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_tip_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="1"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_fec_alta_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="10"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_cod_op"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_desc_op"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_cod_paq"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_nombre_paq"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="8"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_cod_fam"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="5"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_cod_sg1"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="5"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_cod_sg2"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="5"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_marca_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="1"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_cod_isp"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="2"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_des_subg1"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="35"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_des_subg2"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="35"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_est_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="20"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_cant_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
         *               &lt;maxInclusive value="999999999"/&gt;
         *               &lt;minInclusive value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "awpsl2WoCodPs",
            "awpsl2WoDescPs",
            "awpsl2WoTipPs",
            "awpsl2WoFecAltaPs",
            "awpsl2WoCodOp",
            "awpsl2WoDescOp",
            "awpsl2WoCodPaq",
            "awpsl2WoNombrePaq",
            "awpsl2WoCodFam",
            "awpsl2WoCodSg1",
            "awpsl2WoCodSg2",
            "awpsl2WoMarcaPs",
            "awpsl2WoCodIsp",
            "awpsl2WoDesSubg1",
            "awpsl2WoDesSubg2",
            "awpsl2WoEstPs",
            "awpsl2WoCantPs"
        })
        public static class Awpsl2WoListaPs {

            @XmlElement(name = "awpsl2wo_cod_ps", required = true, nillable = true)
            protected String awpsl2WoCodPs;
            @XmlElement(name = "awpsl2wo_desc_ps", required = true, nillable = true)
            protected String awpsl2WoDescPs;
            @XmlElement(name = "awpsl2wo_tip_ps", required = true, nillable = true)
            protected String awpsl2WoTipPs;
            @XmlElement(name = "awpsl2wo_fec_alta_ps", required = true, nillable = true)
            protected String awpsl2WoFecAltaPs;
            @XmlElement(name = "awpsl2wo_cod_op", required = true, nillable = true)
            protected String awpsl2WoCodOp;
            @XmlElement(name = "awpsl2wo_desc_op", required = true, nillable = true)
            protected String awpsl2WoDescOp;
            @XmlElement(name = "awpsl2wo_cod_paq", required = true, nillable = true)
            protected String awpsl2WoCodPaq;
            @XmlElement(name = "awpsl2wo_nombre_paq", required = true, nillable = true)
            protected String awpsl2WoNombrePaq;
            @XmlElement(name = "awpsl2wo_cod_fam", required = true, nillable = true)
            protected String awpsl2WoCodFam;
            @XmlElement(name = "awpsl2wo_cod_sg1", required = true, nillable = true)
            protected String awpsl2WoCodSg1;
            @XmlElement(name = "awpsl2wo_cod_sg2", required = true, nillable = true)
            protected String awpsl2WoCodSg2;
            @XmlElement(name = "awpsl2wo_marca_ps", required = true, nillable = true)
            protected String awpsl2WoMarcaPs;
            @XmlElement(name = "awpsl2wo_cod_isp", required = true, nillable = true)
            protected String awpsl2WoCodIsp;
            @XmlElement(name = "awpsl2wo_des_subg1", required = true, nillable = true)
            protected String awpsl2WoDesSubg1;
            @XmlElement(name = "awpsl2wo_des_subg2", required = true, nillable = true)
            protected String awpsl2WoDesSubg2;
            @XmlElement(name = "awpsl2wo_est_ps", required = true, nillable = true)
            protected String awpsl2WoEstPs;
            @XmlElement(name = "awpsl2wo_cant_ps", required = true, type = Long.class, nillable = true)
            protected Long awpsl2WoCantPs;

            /**
             * Obtiene el valor de la propiedad awpsl2WoCodPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoCodPs() {
                return awpsl2WoCodPs;
            }

            /**
             * Define el valor de la propiedad awpsl2WoCodPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoCodPs(String value) {
                this.awpsl2WoCodPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoDescPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoDescPs() {
                return awpsl2WoDescPs;
            }

            /**
             * Define el valor de la propiedad awpsl2WoDescPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoDescPs(String value) {
                this.awpsl2WoDescPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoTipPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoTipPs() {
                return awpsl2WoTipPs;
            }

            /**
             * Define el valor de la propiedad awpsl2WoTipPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoTipPs(String value) {
                this.awpsl2WoTipPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoFecAltaPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoFecAltaPs() {
                return awpsl2WoFecAltaPs;
            }

            /**
             * Define el valor de la propiedad awpsl2WoFecAltaPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoFecAltaPs(String value) {
                this.awpsl2WoFecAltaPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoCodOp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoCodOp() {
                return awpsl2WoCodOp;
            }

            /**
             * Define el valor de la propiedad awpsl2WoCodOp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoCodOp(String value) {
                this.awpsl2WoCodOp = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoDescOp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoDescOp() {
                return awpsl2WoDescOp;
            }

            /**
             * Define el valor de la propiedad awpsl2WoDescOp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoDescOp(String value) {
                this.awpsl2WoDescOp = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoCodPaq.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoCodPaq() {
                return awpsl2WoCodPaq;
            }

            /**
             * Define el valor de la propiedad awpsl2WoCodPaq.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoCodPaq(String value) {
                this.awpsl2WoCodPaq = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoNombrePaq.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoNombrePaq() {
                return awpsl2WoNombrePaq;
            }

            /**
             * Define el valor de la propiedad awpsl2WoNombrePaq.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoNombrePaq(String value) {
                this.awpsl2WoNombrePaq = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoCodFam.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoCodFam() {
                return awpsl2WoCodFam;
            }

            /**
             * Define el valor de la propiedad awpsl2WoCodFam.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoCodFam(String value) {
                this.awpsl2WoCodFam = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoCodSg1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoCodSg1() {
                return awpsl2WoCodSg1;
            }

            /**
             * Define el valor de la propiedad awpsl2WoCodSg1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoCodSg1(String value) {
                this.awpsl2WoCodSg1 = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoCodSg2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoCodSg2() {
                return awpsl2WoCodSg2;
            }

            /**
             * Define el valor de la propiedad awpsl2WoCodSg2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoCodSg2(String value) {
                this.awpsl2WoCodSg2 = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoMarcaPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoMarcaPs() {
                return awpsl2WoMarcaPs;
            }

            /**
             * Define el valor de la propiedad awpsl2WoMarcaPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoMarcaPs(String value) {
                this.awpsl2WoMarcaPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoCodIsp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoCodIsp() {
                return awpsl2WoCodIsp;
            }

            /**
             * Define el valor de la propiedad awpsl2WoCodIsp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoCodIsp(String value) {
                this.awpsl2WoCodIsp = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoDesSubg1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoDesSubg1() {
                return awpsl2WoDesSubg1;
            }

            /**
             * Define el valor de la propiedad awpsl2WoDesSubg1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoDesSubg1(String value) {
                this.awpsl2WoDesSubg1 = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoDesSubg2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoDesSubg2() {
                return awpsl2WoDesSubg2;
            }

            /**
             * Define el valor de la propiedad awpsl2WoDesSubg2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoDesSubg2(String value) {
                this.awpsl2WoDesSubg2 = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoEstPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoEstPs() {
                return awpsl2WoEstPs;
            }

            /**
             * Define el valor de la propiedad awpsl2WoEstPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoEstPs(String value) {
                this.awpsl2WoEstPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoCantPs.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAwpsl2WoCantPs() {
                return awpsl2WoCantPs;
            }

            /**
             * Define el valor de la propiedad awpsl2WoCantPs.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAwpsl2WoCantPs(Long value) {
                this.awpsl2WoCantPs = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="awpsl2wo_cod_ret"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_desc_ret"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_cod_db"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="4"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_parrafo"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_servicio"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="8"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_finpag"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="1"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awpsl2wo_numreg"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
         *               &lt;maxInclusive value="99"/&gt;
         *               &lt;minInclusive value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "awpsl2WoCodRet",
            "awpsl2WoDescRet",
            "awpsl2WoCodDb",
            "awpsl2WoParrafo",
            "awpsl2WoServicio",
            "awpsl2WoFinpag",
            "awpsl2WoNumreg"
        })
        public static class Awpsl2WoSalida {

            @XmlElement(name = "awpsl2wo_cod_ret", required = true, nillable = true)
            protected String awpsl2WoCodRet;
            @XmlElement(name = "awpsl2wo_desc_ret", required = true, nillable = true)
            protected String awpsl2WoDescRet;
            @XmlElement(name = "awpsl2wo_cod_db", required = true, nillable = true)
            protected String awpsl2WoCodDb;
            @XmlElement(name = "awpsl2wo_parrafo", required = true, nillable = true)
            protected String awpsl2WoParrafo;
            @XmlElement(name = "awpsl2wo_servicio", required = true, nillable = true)
            protected String awpsl2WoServicio;
            @XmlElement(name = "awpsl2wo_finpag", required = true, nillable = true)
            protected String awpsl2WoFinpag;
            @XmlElement(name = "awpsl2wo_numreg", required = true, type = Long.class, nillable = true)
            protected Long awpsl2WoNumreg;

            /**
             * Obtiene el valor de la propiedad awpsl2WoCodRet.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoCodRet() {
                return awpsl2WoCodRet;
            }

            /**
             * Define el valor de la propiedad awpsl2WoCodRet.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoCodRet(String value) {
                this.awpsl2WoCodRet = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoDescRet.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoDescRet() {
                return awpsl2WoDescRet;
            }

            /**
             * Define el valor de la propiedad awpsl2WoDescRet.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoDescRet(String value) {
                this.awpsl2WoDescRet = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoCodDb.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoCodDb() {
                return awpsl2WoCodDb;
            }

            /**
             * Define el valor de la propiedad awpsl2WoCodDb.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoCodDb(String value) {
                this.awpsl2WoCodDb = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoParrafo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoParrafo() {
                return awpsl2WoParrafo;
            }

            /**
             * Define el valor de la propiedad awpsl2WoParrafo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoParrafo(String value) {
                this.awpsl2WoParrafo = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoServicio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoServicio() {
                return awpsl2WoServicio;
            }

            /**
             * Define el valor de la propiedad awpsl2WoServicio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoServicio(String value) {
                this.awpsl2WoServicio = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoFinpag.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwpsl2WoFinpag() {
                return awpsl2WoFinpag;
            }

            /**
             * Define el valor de la propiedad awpsl2WoFinpag.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwpsl2WoFinpag(String value) {
                this.awpsl2WoFinpag = value;
            }

            /**
             * Obtiene el valor de la propiedad awpsl2WoNumreg.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAwpsl2WoNumreg() {
                return awpsl2WoNumreg;
            }

            /**
             * Define el valor de la propiedad awpsl2WoNumreg.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAwpsl2WoNumreg(Long value) {
                this.awpsl2WoNumreg = value;
            }

        }

    }

}
