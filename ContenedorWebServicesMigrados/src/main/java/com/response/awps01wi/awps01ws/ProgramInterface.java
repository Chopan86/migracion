//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.09 a las 02:24:26 PM CLST 
//


package com.response.awps01wi.awps01ws;

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
 *         &lt;element name="awps01co_salida"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="awps01co_o_cod_ret"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awps01co_o_desc_cod_ret"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awps01co_o_finpaginacion"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awps01co_o_numregistros"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awps01co_o_pi_cliente" maxOccurs="20" minOccurs="20"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="awps01co_o_sec_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="12"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_cod_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_desc_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_cod_op"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_desc_op"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_cant_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_tip_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="1"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_desc_tip_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_ind_fact_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="1"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_est_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_fec_alta_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_fec_baja_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_cod_familia"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_desc_familia"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_valor_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="13"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_valor_ps_red"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="13"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_moneda"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_cod_cf"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_cod_conf"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_desc_cf"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_sec_paq"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="12"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_cod_paq"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_nombre_paq"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="8"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_cod_fam"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="5"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_des_fam"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_subg1_cod"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="5"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_des_subg1"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="35"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_subg2_cod"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="5"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_des_subg2"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="35"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps01co_o_pi_cliente2" maxOccurs="15" minOccurs="15"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="awps01co_o_sec_car"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awps01co_o_cod_car"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awps01co_o_cod_dom"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awps01co_o_tip_dom"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="1"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awps01co_o_valor_dom"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="30"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awps01co_o_plan_minuto"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
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
@XmlType(name = "ProgramInterface", propOrder = {
    "awps01CoSalida"
})
public class ProgramInterface {

    @XmlElement(name = "awps01co_salida", required = true)
    protected ProgramInterface.Awps01CoSalida awps01CoSalida;

    /**
     * Obtiene el valor de la propiedad awps01CoSalida.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInterface.Awps01CoSalida }
     *     
     */
    public ProgramInterface.Awps01CoSalida getAwps01CoSalida() {
        return awps01CoSalida;
    }

    /**
     * Define el valor de la propiedad awps01CoSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInterface.Awps01CoSalida }
     *     
     */
    public void setAwps01CoSalida(ProgramInterface.Awps01CoSalida value) {
        this.awps01CoSalida = value;
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
     *         &lt;element name="awps01co_o_cod_ret"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awps01co_o_desc_cod_ret"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awps01co_o_finpaginacion"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awps01co_o_numregistros"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="2"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awps01co_o_pi_cliente" maxOccurs="20" minOccurs="20"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="awps01co_o_sec_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="12"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_cod_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_desc_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_cod_op"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_desc_op"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_cant_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_tip_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="1"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_desc_tip_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="20"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_ind_fact_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="1"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_est_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="20"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_fec_alta_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="10"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_fec_baja_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="10"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_cod_familia"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_desc_familia"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_valor_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="13"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_valor_ps_red"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="13"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_moneda"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_cod_cf"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_cod_conf"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_desc_cf"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_sec_paq"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="12"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_cod_paq"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_nombre_paq"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="8"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_cod_fam"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="5"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_des_fam"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="20"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_subg1_cod"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="5"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_des_subg1"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="35"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_subg2_cod"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="5"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_des_subg2"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="35"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps01co_o_pi_cliente2" maxOccurs="15" minOccurs="15"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="awps01co_o_sec_car"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awps01co_o_cod_car"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awps01co_o_cod_dom"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awps01co_o_tip_dom"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="1"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awps01co_o_valor_dom"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="30"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
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
     *         &lt;element name="awps01co_o_plan_minuto"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
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
        "awps01CoOCodRet",
        "awps01CoODescCodRet",
        "awps01CoOFinpaginacion",
        "awps01CoONumregistros",
        "awps01CoOPiCliente",
        "awps01CoOPlanMinuto"
    })
    public static class Awps01CoSalida {

        @XmlElement(name = "awps01co_o_cod_ret", required = true)
        protected String awps01CoOCodRet;
        @XmlElement(name = "awps01co_o_desc_cod_ret", required = true)
        protected String awps01CoODescCodRet;
        @XmlElement(name = "awps01co_o_finpaginacion", required = true)
        protected String awps01CoOFinpaginacion;
        @XmlElement(name = "awps01co_o_numregistros", required = true)
        protected String awps01CoONumregistros;
        @XmlElement(name = "awps01co_o_pi_cliente", required = true)
        protected List<ProgramInterface.Awps01CoSalida.Awps01CoOPiCliente> awps01CoOPiCliente;
        @XmlElement(name = "awps01co_o_plan_minuto", required = true)
        protected String awps01CoOPlanMinuto;

        /**
         * Obtiene el valor de la propiedad awps01CoOCodRet.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwps01CoOCodRet() {
            return awps01CoOCodRet;
        }

        /**
         * Define el valor de la propiedad awps01CoOCodRet.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwps01CoOCodRet(String value) {
            this.awps01CoOCodRet = value;
        }

        /**
         * Obtiene el valor de la propiedad awps01CoODescCodRet.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwps01CoODescCodRet() {
            return awps01CoODescCodRet;
        }

        /**
         * Define el valor de la propiedad awps01CoODescCodRet.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwps01CoODescCodRet(String value) {
            this.awps01CoODescCodRet = value;
        }

        /**
         * Obtiene el valor de la propiedad awps01CoOFinpaginacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwps01CoOFinpaginacion() {
            return awps01CoOFinpaginacion;
        }

        /**
         * Define el valor de la propiedad awps01CoOFinpaginacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwps01CoOFinpaginacion(String value) {
            this.awps01CoOFinpaginacion = value;
        }

        /**
         * Obtiene el valor de la propiedad awps01CoONumregistros.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwps01CoONumregistros() {
            return awps01CoONumregistros;
        }

        /**
         * Define el valor de la propiedad awps01CoONumregistros.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwps01CoONumregistros(String value) {
            this.awps01CoONumregistros = value;
        }

        /**
         * Gets the value of the awps01CoOPiCliente property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the awps01CoOPiCliente property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAwps01CoOPiCliente().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProgramInterface.Awps01CoSalida.Awps01CoOPiCliente }
         * 
         * 
         */
        public List<ProgramInterface.Awps01CoSalida.Awps01CoOPiCliente> getAwps01CoOPiCliente() {
            if (awps01CoOPiCliente == null) {
                awps01CoOPiCliente = new ArrayList<ProgramInterface.Awps01CoSalida.Awps01CoOPiCliente>();
            }
            return this.awps01CoOPiCliente;
        }

        /**
         * Obtiene el valor de la propiedad awps01CoOPlanMinuto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwps01CoOPlanMinuto() {
            return awps01CoOPlanMinuto;
        }

        /**
         * Define el valor de la propiedad awps01CoOPlanMinuto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwps01CoOPlanMinuto(String value) {
            this.awps01CoOPlanMinuto = value;
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
         *         &lt;element name="awps01co_o_sec_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="12"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_cod_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_desc_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_cod_op"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_desc_op"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_cant_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_tip_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="1"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_desc_tip_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="20"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_ind_fact_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="1"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_est_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="20"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_fec_alta_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="10"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_fec_baja_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="10"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_cod_familia"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_desc_familia"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_valor_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="13"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_valor_ps_red"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="13"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_moneda"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_cod_cf"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_cod_conf"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_desc_cf"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_sec_paq"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="12"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_cod_paq"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_nombre_paq"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="8"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_cod_fam"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="5"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_des_fam"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="20"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_subg1_cod"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="5"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_des_subg1"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="35"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_subg2_cod"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="5"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_des_subg2"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="35"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps01co_o_pi_cliente2" maxOccurs="15" minOccurs="15"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="awps01co_o_sec_car"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awps01co_o_cod_car"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awps01co_o_cod_dom"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awps01co_o_tip_dom"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="1"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awps01co_o_valor_dom"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="30"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
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
            "awps01CoOSecPs",
            "awps01CoOCodPs",
            "awps01CoODescPs",
            "awps01CoOCodOp",
            "awps01CoODescOp",
            "awps01CoOCantPs",
            "awps01CoOTipPs",
            "awps01CoODescTipPs",
            "awps01CoOIndFactPs",
            "awps01CoOEstPs",
            "awps01CoOFecAltaPs",
            "awps01CoOFecBajaPs",
            "awps01CoOCodFamilia",
            "awps01CoODescFamilia",
            "awps01CoOValorPs",
            "awps01CoOValorPsRed",
            "awps01CoOMoneda",
            "awps01CoOCodCf",
            "awps01CoOCodConf",
            "awps01CoODescCf",
            "awps01CoOSecPaq",
            "awps01CoOCodPaq",
            "awps01CoONombrePaq",
            "awps01CoOCodFam",
            "awps01CoODesFam",
            "awps01CoOSubg1Cod",
            "awps01CoODesSubg1",
            "awps01CoOSubg2Cod",
            "awps01CoODesSubg2",
            "awps01CoOPiCliente2"
        })
        public static class Awps01CoOPiCliente {

            @XmlElement(name = "awps01co_o_sec_ps", required = true)
            protected String awps01CoOSecPs;
            @XmlElement(name = "awps01co_o_cod_ps", required = true)
            protected String awps01CoOCodPs;
            @XmlElement(name = "awps01co_o_desc_ps", required = true)
            protected String awps01CoODescPs;
            @XmlElement(name = "awps01co_o_cod_op", required = true)
            protected String awps01CoOCodOp;
            @XmlElement(name = "awps01co_o_desc_op", required = true)
            protected String awps01CoODescOp;
            @XmlElement(name = "awps01co_o_cant_ps", required = true)
            protected String awps01CoOCantPs;
            @XmlElement(name = "awps01co_o_tip_ps", required = true)
            protected String awps01CoOTipPs;
            @XmlElement(name = "awps01co_o_desc_tip_ps", required = true)
            protected String awps01CoODescTipPs;
            @XmlElement(name = "awps01co_o_ind_fact_ps", required = true)
            protected String awps01CoOIndFactPs;
            @XmlElement(name = "awps01co_o_est_ps", required = true)
            protected String awps01CoOEstPs;
            @XmlElement(name = "awps01co_o_fec_alta_ps", required = true)
            protected String awps01CoOFecAltaPs;
            @XmlElement(name = "awps01co_o_fec_baja_ps", required = true)
            protected String awps01CoOFecBajaPs;
            @XmlElement(name = "awps01co_o_cod_familia", required = true)
            protected String awps01CoOCodFamilia;
            @XmlElement(name = "awps01co_o_desc_familia", required = true)
            protected String awps01CoODescFamilia;
            @XmlElement(name = "awps01co_o_valor_ps", required = true)
            protected String awps01CoOValorPs;
            @XmlElement(name = "awps01co_o_valor_ps_red", required = true)
            protected String awps01CoOValorPsRed;
            @XmlElement(name = "awps01co_o_moneda", required = true)
            protected String awps01CoOMoneda;
            @XmlElement(name = "awps01co_o_cod_cf", required = true)
            protected String awps01CoOCodCf;
            @XmlElement(name = "awps01co_o_cod_conf", required = true)
            protected String awps01CoOCodConf;
            @XmlElement(name = "awps01co_o_desc_cf", required = true)
            protected String awps01CoODescCf;
            @XmlElement(name = "awps01co_o_sec_paq", required = true)
            protected String awps01CoOSecPaq;
            @XmlElement(name = "awps01co_o_cod_paq", required = true)
            protected String awps01CoOCodPaq;
            @XmlElement(name = "awps01co_o_nombre_paq", required = true)
            protected String awps01CoONombrePaq;
            @XmlElement(name = "awps01co_o_cod_fam", required = true)
            protected String awps01CoOCodFam;
            @XmlElement(name = "awps01co_o_des_fam", required = true)
            protected String awps01CoODesFam;
            @XmlElement(name = "awps01co_o_subg1_cod", required = true)
            protected String awps01CoOSubg1Cod;
            @XmlElement(name = "awps01co_o_des_subg1", required = true)
            protected String awps01CoODesSubg1;
            @XmlElement(name = "awps01co_o_subg2_cod", required = true)
            protected String awps01CoOSubg2Cod;
            @XmlElement(name = "awps01co_o_des_subg2", required = true)
            protected String awps01CoODesSubg2;
            @XmlElement(name = "awps01co_o_pi_cliente2", required = true)
            protected List<ProgramInterface.Awps01CoSalida.Awps01CoOPiCliente.Awps01CoOPiCliente2> awps01CoOPiCliente2;

            /**
             * Obtiene el valor de la propiedad awps01CoOSecPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOSecPs() {
                return awps01CoOSecPs;
            }

            /**
             * Define el valor de la propiedad awps01CoOSecPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOSecPs(String value) {
                this.awps01CoOSecPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoOCodPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOCodPs() {
                return awps01CoOCodPs;
            }

            /**
             * Define el valor de la propiedad awps01CoOCodPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOCodPs(String value) {
                this.awps01CoOCodPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoODescPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoODescPs() {
                return awps01CoODescPs;
            }

            /**
             * Define el valor de la propiedad awps01CoODescPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoODescPs(String value) {
                this.awps01CoODescPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoOCodOp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOCodOp() {
                return awps01CoOCodOp;
            }

            /**
             * Define el valor de la propiedad awps01CoOCodOp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOCodOp(String value) {
                this.awps01CoOCodOp = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoODescOp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoODescOp() {
                return awps01CoODescOp;
            }

            /**
             * Define el valor de la propiedad awps01CoODescOp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoODescOp(String value) {
                this.awps01CoODescOp = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoOCantPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOCantPs() {
                return awps01CoOCantPs;
            }

            /**
             * Define el valor de la propiedad awps01CoOCantPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOCantPs(String value) {
                this.awps01CoOCantPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoOTipPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOTipPs() {
                return awps01CoOTipPs;
            }

            /**
             * Define el valor de la propiedad awps01CoOTipPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOTipPs(String value) {
                this.awps01CoOTipPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoODescTipPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoODescTipPs() {
                return awps01CoODescTipPs;
            }

            /**
             * Define el valor de la propiedad awps01CoODescTipPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoODescTipPs(String value) {
                this.awps01CoODescTipPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoOIndFactPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOIndFactPs() {
                return awps01CoOIndFactPs;
            }

            /**
             * Define el valor de la propiedad awps01CoOIndFactPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOIndFactPs(String value) {
                this.awps01CoOIndFactPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoOEstPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOEstPs() {
                return awps01CoOEstPs;
            }

            /**
             * Define el valor de la propiedad awps01CoOEstPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOEstPs(String value) {
                this.awps01CoOEstPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoOFecAltaPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOFecAltaPs() {
                return awps01CoOFecAltaPs;
            }

            /**
             * Define el valor de la propiedad awps01CoOFecAltaPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOFecAltaPs(String value) {
                this.awps01CoOFecAltaPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoOFecBajaPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOFecBajaPs() {
                return awps01CoOFecBajaPs;
            }

            /**
             * Define el valor de la propiedad awps01CoOFecBajaPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOFecBajaPs(String value) {
                this.awps01CoOFecBajaPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoOCodFamilia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOCodFamilia() {
                return awps01CoOCodFamilia;
            }

            /**
             * Define el valor de la propiedad awps01CoOCodFamilia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOCodFamilia(String value) {
                this.awps01CoOCodFamilia = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoODescFamilia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoODescFamilia() {
                return awps01CoODescFamilia;
            }

            /**
             * Define el valor de la propiedad awps01CoODescFamilia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoODescFamilia(String value) {
                this.awps01CoODescFamilia = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoOValorPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOValorPs() {
                return awps01CoOValorPs;
            }

            /**
             * Define el valor de la propiedad awps01CoOValorPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOValorPs(String value) {
                this.awps01CoOValorPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoOValorPsRed.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOValorPsRed() {
                return awps01CoOValorPsRed;
            }

            /**
             * Define el valor de la propiedad awps01CoOValorPsRed.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOValorPsRed(String value) {
                this.awps01CoOValorPsRed = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoOMoneda.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOMoneda() {
                return awps01CoOMoneda;
            }

            /**
             * Define el valor de la propiedad awps01CoOMoneda.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOMoneda(String value) {
                this.awps01CoOMoneda = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoOCodCf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOCodCf() {
                return awps01CoOCodCf;
            }

            /**
             * Define el valor de la propiedad awps01CoOCodCf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOCodCf(String value) {
                this.awps01CoOCodCf = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoOCodConf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOCodConf() {
                return awps01CoOCodConf;
            }

            /**
             * Define el valor de la propiedad awps01CoOCodConf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOCodConf(String value) {
                this.awps01CoOCodConf = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoODescCf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoODescCf() {
                return awps01CoODescCf;
            }

            /**
             * Define el valor de la propiedad awps01CoODescCf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoODescCf(String value) {
                this.awps01CoODescCf = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoOSecPaq.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOSecPaq() {
                return awps01CoOSecPaq;
            }

            /**
             * Define el valor de la propiedad awps01CoOSecPaq.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOSecPaq(String value) {
                this.awps01CoOSecPaq = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoOCodPaq.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOCodPaq() {
                return awps01CoOCodPaq;
            }

            /**
             * Define el valor de la propiedad awps01CoOCodPaq.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOCodPaq(String value) {
                this.awps01CoOCodPaq = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoONombrePaq.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoONombrePaq() {
                return awps01CoONombrePaq;
            }

            /**
             * Define el valor de la propiedad awps01CoONombrePaq.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoONombrePaq(String value) {
                this.awps01CoONombrePaq = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoOCodFam.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOCodFam() {
                return awps01CoOCodFam;
            }

            /**
             * Define el valor de la propiedad awps01CoOCodFam.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOCodFam(String value) {
                this.awps01CoOCodFam = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoODesFam.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoODesFam() {
                return awps01CoODesFam;
            }

            /**
             * Define el valor de la propiedad awps01CoODesFam.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoODesFam(String value) {
                this.awps01CoODesFam = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoOSubg1Cod.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOSubg1Cod() {
                return awps01CoOSubg1Cod;
            }

            /**
             * Define el valor de la propiedad awps01CoOSubg1Cod.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOSubg1Cod(String value) {
                this.awps01CoOSubg1Cod = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoODesSubg1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoODesSubg1() {
                return awps01CoODesSubg1;
            }

            /**
             * Define el valor de la propiedad awps01CoODesSubg1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoODesSubg1(String value) {
                this.awps01CoODesSubg1 = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoOSubg2Cod.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoOSubg2Cod() {
                return awps01CoOSubg2Cod;
            }

            /**
             * Define el valor de la propiedad awps01CoOSubg2Cod.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoOSubg2Cod(String value) {
                this.awps01CoOSubg2Cod = value;
            }

            /**
             * Obtiene el valor de la propiedad awps01CoODesSubg2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps01CoODesSubg2() {
                return awps01CoODesSubg2;
            }

            /**
             * Define el valor de la propiedad awps01CoODesSubg2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps01CoODesSubg2(String value) {
                this.awps01CoODesSubg2 = value;
            }

            /**
             * Gets the value of the awps01CoOPiCliente2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the awps01CoOPiCliente2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAwps01CoOPiCliente2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProgramInterface.Awps01CoSalida.Awps01CoOPiCliente.Awps01CoOPiCliente2 }
             * 
             * 
             */
            public List<ProgramInterface.Awps01CoSalida.Awps01CoOPiCliente.Awps01CoOPiCliente2> getAwps01CoOPiCliente2() {
                if (awps01CoOPiCliente2 == null) {
                    awps01CoOPiCliente2 = new ArrayList<ProgramInterface.Awps01CoSalida.Awps01CoOPiCliente.Awps01CoOPiCliente2>();
                }
                return this.awps01CoOPiCliente2;
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
             *         &lt;element name="awps01co_o_sec_car"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="12"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awps01co_o_cod_car"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="12"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awps01co_o_cod_dom"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="12"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awps01co_o_tip_dom"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="1"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awps01co_o_valor_dom"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="30"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
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
                "awps01CoOSecCar",
                "awps01CoOCodCar",
                "awps01CoOCodDom",
                "awps01CoOTipDom",
                "awps01CoOValorDom"
            })
            public static class Awps01CoOPiCliente2 {

                @XmlElement(name = "awps01co_o_sec_car", required = true)
                protected String awps01CoOSecCar;
                @XmlElement(name = "awps01co_o_cod_car", required = true)
                protected String awps01CoOCodCar;
                @XmlElement(name = "awps01co_o_cod_dom", required = true)
                protected String awps01CoOCodDom;
                @XmlElement(name = "awps01co_o_tip_dom", required = true)
                protected String awps01CoOTipDom;
                @XmlElement(name = "awps01co_o_valor_dom", required = true)
                protected String awps01CoOValorDom;

                /**
                 * Obtiene el valor de la propiedad awps01CoOSecCar.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwps01CoOSecCar() {
                    return awps01CoOSecCar;
                }

                /**
                 * Define el valor de la propiedad awps01CoOSecCar.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwps01CoOSecCar(String value) {
                    this.awps01CoOSecCar = value;
                }

                /**
                 * Obtiene el valor de la propiedad awps01CoOCodCar.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwps01CoOCodCar() {
                    return awps01CoOCodCar;
                }

                /**
                 * Define el valor de la propiedad awps01CoOCodCar.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwps01CoOCodCar(String value) {
                    this.awps01CoOCodCar = value;
                }

                /**
                 * Obtiene el valor de la propiedad awps01CoOCodDom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwps01CoOCodDom() {
                    return awps01CoOCodDom;
                }

                /**
                 * Define el valor de la propiedad awps01CoOCodDom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwps01CoOCodDom(String value) {
                    this.awps01CoOCodDom = value;
                }

                /**
                 * Obtiene el valor de la propiedad awps01CoOTipDom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwps01CoOTipDom() {
                    return awps01CoOTipDom;
                }

                /**
                 * Define el valor de la propiedad awps01CoOTipDom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwps01CoOTipDom(String value) {
                    this.awps01CoOTipDom = value;
                }

                /**
                 * Obtiene el valor de la propiedad awps01CoOValorDom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwps01CoOValorDom() {
                    return awps01CoOValorDom;
                }

                /**
                 * Define el valor de la propiedad awps01CoOValorDom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwps01CoOValorDom(String value) {
                    this.awps01CoOValorDom = value;
                }

            }

        }

    }

}
