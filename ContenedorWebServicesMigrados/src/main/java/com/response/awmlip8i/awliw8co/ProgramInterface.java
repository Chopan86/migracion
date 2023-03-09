//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.09 a las 02:27:30 PM CLST 
//


package com.response.awmlip8i.awliw8co;

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
 *         &lt;element name="awlip8co_salida"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="awlip8co_o_finpaginacion"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_numregistros"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *                         &lt;maxInclusive value="99"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_nom_pag"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_ape1_pag"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_ape2_pag"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_nom_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_ape1_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_ape2_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_rut_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_dvf_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_sec_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                         &lt;maxInclusive value="999999999"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_cod_seg"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_desc_seg"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_fec_alta_li"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_tipo_clie"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_desc_tipo_clie"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_calle"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_num"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="6"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_dpto"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="6"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_post"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="7"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_comun"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_ciuda"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_calle_cob"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_num_cob"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="6"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_dpto_cob"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="6"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_post_cob"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="7"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_comun_cob"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_ciuda_cob"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_zona"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_central"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_pta_comercial"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_fec_instalacion"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_tipo_linea"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_desc_tipo_linea"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_ind_fact"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_est_linea"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_pi_cliente" maxOccurs="15" minOccurs="15"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="awlip8co_o_cod_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                                   &lt;maxInclusive value="999999999"/&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_cod_op"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                                   &lt;maxInclusive value="999999999"/&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_desc_op"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_cant_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_tip_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="1"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_desc_tip_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_ind_fact_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="1"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_est_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_desc_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_fec_alta_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_fec_baja_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_cod_paq"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                                   &lt;maxInclusive value="999999999"/&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_nombre_paq"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="8"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_sec_paq"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="12"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_sec_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
 *                                   &lt;maxInclusive value="999999999999"/&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_cod_familia"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                                   &lt;maxInclusive value="999999999"/&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_desc_familia"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_valor_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
 *                                   &lt;maxInclusive value="9999999999999"/&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_moneda"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_cod_cf"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                                   &lt;maxInclusive value="999999999"/&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_cod_conf"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                                   &lt;maxInclusive value="999999999"/&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_desc_cf"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_cod_fam"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="5"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_des_fam"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="50"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlip8co_o_pi_cliente2" maxOccurs="20" minOccurs="20"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="awlip8co_o_sec_car"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
 *                                             &lt;maxInclusive value="999999999999"/&gt;
 *                                             &lt;minInclusive value="0"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awlip8co_o_cod_car"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
 *                                             &lt;maxInclusive value="999999999999"/&gt;
 *                                             &lt;minInclusive value="0"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awlip8co_o_cod_dom"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awlip8co_o_tip_dom"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="1"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awlip8co_o_valor_dom"&gt;
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
 *                   &lt;element name="awlip8co_o_cod_ret"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_desc_cod_ret"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_cod_sub_seg"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_cod_agencia"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_desc_agencia"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_cod_comun"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_cod_comun_cob"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_desc_zona_cent"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="25"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_desc_sub_seg"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_plan_minuto"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_mail_cliente"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="60"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_fecha_alt_clte"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_o_sec_lin"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
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
    "awlip8CoSalida"
})
public class ProgramInterface {

    @XmlElement(name = "awlip8co_salida", required = true)
    protected ProgramInterface.Awlip8CoSalida awlip8CoSalida;

    /**
     * Obtiene el valor de la propiedad awlip8CoSalida.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInterface.Awlip8CoSalida }
     *     
     */
    public ProgramInterface.Awlip8CoSalida getAwlip8CoSalida() {
        return awlip8CoSalida;
    }

    /**
     * Define el valor de la propiedad awlip8CoSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInterface.Awlip8CoSalida }
     *     
     */
    public void setAwlip8CoSalida(ProgramInterface.Awlip8CoSalida value) {
        this.awlip8CoSalida = value;
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
     *         &lt;element name="awlip8co_o_finpaginacion"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_numregistros"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
     *               &lt;maxInclusive value="99"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_nom_pag"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_ape1_pag"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_ape2_pag"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_nom_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_ape1_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_ape2_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_rut_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="12"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_dvf_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_sec_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *               &lt;maxInclusive value="999999999"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_cod_seg"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_desc_seg"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_fec_alta_li"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="10"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_tipo_clie"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_desc_tipo_clie"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="15"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_calle"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="40"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_num"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="6"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_dpto"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="6"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_post"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="7"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_comun"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="15"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_ciuda"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="15"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_calle_cob"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="40"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_num_cob"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="6"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_dpto_cob"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="6"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_post_cob"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="7"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_comun_cob"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="15"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_ciuda_cob"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="15"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_zona"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="2"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_central"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="2"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_pta_comercial"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="4"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_fec_instalacion"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="10"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_tipo_linea"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="2"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_desc_tipo_linea"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="15"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_ind_fact"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_est_linea"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_pi_cliente" maxOccurs="15" minOccurs="15"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="awlip8co_o_cod_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *                         &lt;maxInclusive value="999999999"/&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_cod_op"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *                         &lt;maxInclusive value="999999999"/&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_desc_op"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_cant_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_tip_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="1"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_desc_tip_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="20"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_ind_fact_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="1"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_est_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="20"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_desc_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_fec_alta_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="10"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_fec_baja_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="10"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_cod_paq"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *                         &lt;maxInclusive value="999999999"/&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_nombre_paq"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="8"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_sec_paq"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="12"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_sec_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
     *                         &lt;maxInclusive value="999999999999"/&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_cod_familia"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *                         &lt;maxInclusive value="999999999"/&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_desc_familia"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_valor_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
     *                         &lt;maxInclusive value="9999999999999"/&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_moneda"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_cod_cf"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *                         &lt;maxInclusive value="999999999"/&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_cod_conf"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *                         &lt;maxInclusive value="999999999"/&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_desc_cf"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_cod_fam"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="5"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_des_fam"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="50"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlip8co_o_pi_cliente2" maxOccurs="20" minOccurs="20"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="awlip8co_o_sec_car"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
     *                                   &lt;maxInclusive value="999999999999"/&gt;
     *                                   &lt;minInclusive value="0"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awlip8co_o_cod_car"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
     *                                   &lt;maxInclusive value="999999999999"/&gt;
     *                                   &lt;minInclusive value="0"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awlip8co_o_cod_dom"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awlip8co_o_tip_dom"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="1"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awlip8co_o_valor_dom"&gt;
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
     *         &lt;element name="awlip8co_o_cod_ret"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_desc_cod_ret"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_cod_sub_seg"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_cod_agencia"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="4"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_desc_agencia"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_cod_comun"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_cod_comun_cob"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_desc_zona_cent"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="25"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_desc_sub_seg"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_plan_minuto"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_mail_cliente"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="60"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_fecha_alt_clte"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="10"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_o_sec_lin"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="12"/&gt;
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
        "awlip8CoOFinpaginacion",
        "awlip8CoONumregistros",
        "awlip8CoONomPag",
        "awlip8CoOApe1Pag",
        "awlip8CoOApe2Pag",
        "awlip8CoONomTit",
        "awlip8CoOApe1Tit",
        "awlip8CoOApe2Tit",
        "awlip8CoORutTit",
        "awlip8CoODvfTit",
        "awlip8CoOSecTit",
        "awlip8CoOCodSeg",
        "awlip8CoODescSeg",
        "awlip8CoOFecAltaLi",
        "awlip8CoOTipoClie",
        "awlip8CoODescTipoClie",
        "awlip8CoOCalle",
        "awlip8CoONum",
        "awlip8CoODpto",
        "awlip8CoOPost",
        "awlip8CoOComun",
        "awlip8CoOCiuda",
        "awlip8CoOCalleCob",
        "awlip8CoONumCob",
        "awlip8CoODptoCob",
        "awlip8CoOPostCob",
        "awlip8CoOComunCob",
        "awlip8CoOCiudaCob",
        "awlip8CoOZona",
        "awlip8CoOCentral",
        "awlip8CoOPtaComercial",
        "awlip8CoOFecInstalacion",
        "awlip8CoOTipoLinea",
        "awlip8CoODescTipoLinea",
        "awlip8CoOIndFact",
        "awlip8CoOEstLinea",
        "awlip8CoOPiCliente",
        "awlip8CoOCodRet",
        "awlip8CoODescCodRet",
        "awlip8CoOCodSubSeg",
        "awlip8CoOCodAgencia",
        "awlip8CoODescAgencia",
        "awlip8CoOCodComun",
        "awlip8CoOCodComunCob",
        "awlip8CoODescZonaCent",
        "awlip8CoODescSubSeg",
        "awlip8CoOPlanMinuto",
        "awlip8CoOMailCliente",
        "awlip8CoOFechaAltClte",
        "awlip8CoOSecLin"
    })
    public static class Awlip8CoSalida {

        @XmlElement(name = "awlip8co_o_finpaginacion", required = true)
        protected String awlip8CoOFinpaginacion;
        @XmlElement(name = "awlip8co_o_numregistros")
        protected int awlip8CoONumregistros;
        @XmlElement(name = "awlip8co_o_nom_pag", required = true)
        protected String awlip8CoONomPag;
        @XmlElement(name = "awlip8co_o_ape1_pag", required = true)
        protected String awlip8CoOApe1Pag;
        @XmlElement(name = "awlip8co_o_ape2_pag", required = true)
        protected String awlip8CoOApe2Pag;
        @XmlElement(name = "awlip8co_o_nom_tit", required = true)
        protected String awlip8CoONomTit;
        @XmlElement(name = "awlip8co_o_ape1_tit", required = true)
        protected String awlip8CoOApe1Tit;
        @XmlElement(name = "awlip8co_o_ape2_tit", required = true)
        protected String awlip8CoOApe2Tit;
        @XmlElement(name = "awlip8co_o_rut_tit", required = true)
        protected String awlip8CoORutTit;
        @XmlElement(name = "awlip8co_o_dvf_tit", required = true)
        protected String awlip8CoODvfTit;
        @XmlElement(name = "awlip8co_o_sec_tit")
        protected long awlip8CoOSecTit;
        @XmlElement(name = "awlip8co_o_cod_seg", required = true)
        protected String awlip8CoOCodSeg;
        @XmlElement(name = "awlip8co_o_desc_seg", required = true)
        protected String awlip8CoODescSeg;
        @XmlElement(name = "awlip8co_o_fec_alta_li", required = true)
        protected String awlip8CoOFecAltaLi;
        @XmlElement(name = "awlip8co_o_tipo_clie", required = true)
        protected String awlip8CoOTipoClie;
        @XmlElement(name = "awlip8co_o_desc_tipo_clie", required = true)
        protected String awlip8CoODescTipoClie;
        @XmlElement(name = "awlip8co_o_calle", required = true)
        protected String awlip8CoOCalle;
        @XmlElement(name = "awlip8co_o_num", required = true)
        protected String awlip8CoONum;
        @XmlElement(name = "awlip8co_o_dpto", required = true)
        protected String awlip8CoODpto;
        @XmlElement(name = "awlip8co_o_post", required = true)
        protected String awlip8CoOPost;
        @XmlElement(name = "awlip8co_o_comun", required = true)
        protected String awlip8CoOComun;
        @XmlElement(name = "awlip8co_o_ciuda", required = true)
        protected String awlip8CoOCiuda;
        @XmlElement(name = "awlip8co_o_calle_cob", required = true)
        protected String awlip8CoOCalleCob;
        @XmlElement(name = "awlip8co_o_num_cob", required = true)
        protected String awlip8CoONumCob;
        @XmlElement(name = "awlip8co_o_dpto_cob", required = true)
        protected String awlip8CoODptoCob;
        @XmlElement(name = "awlip8co_o_post_cob", required = true)
        protected String awlip8CoOPostCob;
        @XmlElement(name = "awlip8co_o_comun_cob", required = true)
        protected String awlip8CoOComunCob;
        @XmlElement(name = "awlip8co_o_ciuda_cob", required = true)
        protected String awlip8CoOCiudaCob;
        @XmlElement(name = "awlip8co_o_zona", required = true)
        protected String awlip8CoOZona;
        @XmlElement(name = "awlip8co_o_central", required = true)
        protected String awlip8CoOCentral;
        @XmlElement(name = "awlip8co_o_pta_comercial", required = true)
        protected String awlip8CoOPtaComercial;
        @XmlElement(name = "awlip8co_o_fec_instalacion", required = true)
        protected String awlip8CoOFecInstalacion;
        @XmlElement(name = "awlip8co_o_tipo_linea", required = true)
        protected String awlip8CoOTipoLinea;
        @XmlElement(name = "awlip8co_o_desc_tipo_linea", required = true)
        protected String awlip8CoODescTipoLinea;
        @XmlElement(name = "awlip8co_o_ind_fact", required = true)
        protected String awlip8CoOIndFact;
        @XmlElement(name = "awlip8co_o_est_linea", required = true)
        protected String awlip8CoOEstLinea;
        @XmlElement(name = "awlip8co_o_pi_cliente", required = true)
        protected List<ProgramInterface.Awlip8CoSalida.Awlip8CoOPiCliente> awlip8CoOPiCliente;
        @XmlElement(name = "awlip8co_o_cod_ret", required = true)
        protected String awlip8CoOCodRet;
        @XmlElement(name = "awlip8co_o_desc_cod_ret", required = true)
        protected String awlip8CoODescCodRet;
        @XmlElement(name = "awlip8co_o_cod_sub_seg", required = true)
        protected String awlip8CoOCodSubSeg;
        @XmlElement(name = "awlip8co_o_cod_agencia", required = true)
        protected String awlip8CoOCodAgencia;
        @XmlElement(name = "awlip8co_o_desc_agencia", required = true)
        protected String awlip8CoODescAgencia;
        @XmlElement(name = "awlip8co_o_cod_comun", required = true)
        protected String awlip8CoOCodComun;
        @XmlElement(name = "awlip8co_o_cod_comun_cob", required = true)
        protected String awlip8CoOCodComunCob;
        @XmlElement(name = "awlip8co_o_desc_zona_cent", required = true)
        protected String awlip8CoODescZonaCent;
        @XmlElement(name = "awlip8co_o_desc_sub_seg", required = true)
        protected String awlip8CoODescSubSeg;
        @XmlElement(name = "awlip8co_o_plan_minuto", required = true)
        protected String awlip8CoOPlanMinuto;
        @XmlElement(name = "awlip8co_o_mail_cliente", required = true)
        protected String awlip8CoOMailCliente;
        @XmlElement(name = "awlip8co_o_fecha_alt_clte", required = true)
        protected String awlip8CoOFechaAltClte;
        @XmlElement(name = "awlip8co_o_sec_lin", required = true)
        protected String awlip8CoOSecLin;

        /**
         * Obtiene el valor de la propiedad awlip8CoOFinpaginacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOFinpaginacion() {
            return awlip8CoOFinpaginacion;
        }

        /**
         * Define el valor de la propiedad awlip8CoOFinpaginacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOFinpaginacion(String value) {
            this.awlip8CoOFinpaginacion = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoONumregistros.
         * 
         */
        public int getAwlip8CoONumregistros() {
            return awlip8CoONumregistros;
        }

        /**
         * Define el valor de la propiedad awlip8CoONumregistros.
         * 
         */
        public void setAwlip8CoONumregistros(int value) {
            this.awlip8CoONumregistros = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoONomPag.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoONomPag() {
            return awlip8CoONomPag;
        }

        /**
         * Define el valor de la propiedad awlip8CoONomPag.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoONomPag(String value) {
            this.awlip8CoONomPag = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOApe1Pag.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOApe1Pag() {
            return awlip8CoOApe1Pag;
        }

        /**
         * Define el valor de la propiedad awlip8CoOApe1Pag.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOApe1Pag(String value) {
            this.awlip8CoOApe1Pag = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOApe2Pag.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOApe2Pag() {
            return awlip8CoOApe2Pag;
        }

        /**
         * Define el valor de la propiedad awlip8CoOApe2Pag.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOApe2Pag(String value) {
            this.awlip8CoOApe2Pag = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoONomTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoONomTit() {
            return awlip8CoONomTit;
        }

        /**
         * Define el valor de la propiedad awlip8CoONomTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoONomTit(String value) {
            this.awlip8CoONomTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOApe1Tit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOApe1Tit() {
            return awlip8CoOApe1Tit;
        }

        /**
         * Define el valor de la propiedad awlip8CoOApe1Tit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOApe1Tit(String value) {
            this.awlip8CoOApe1Tit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOApe2Tit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOApe2Tit() {
            return awlip8CoOApe2Tit;
        }

        /**
         * Define el valor de la propiedad awlip8CoOApe2Tit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOApe2Tit(String value) {
            this.awlip8CoOApe2Tit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoORutTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoORutTit() {
            return awlip8CoORutTit;
        }

        /**
         * Define el valor de la propiedad awlip8CoORutTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoORutTit(String value) {
            this.awlip8CoORutTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoODvfTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoODvfTit() {
            return awlip8CoODvfTit;
        }

        /**
         * Define el valor de la propiedad awlip8CoODvfTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoODvfTit(String value) {
            this.awlip8CoODvfTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOSecTit.
         * 
         */
        public long getAwlip8CoOSecTit() {
            return awlip8CoOSecTit;
        }

        /**
         * Define el valor de la propiedad awlip8CoOSecTit.
         * 
         */
        public void setAwlip8CoOSecTit(long value) {
            this.awlip8CoOSecTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOCodSeg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOCodSeg() {
            return awlip8CoOCodSeg;
        }

        /**
         * Define el valor de la propiedad awlip8CoOCodSeg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOCodSeg(String value) {
            this.awlip8CoOCodSeg = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoODescSeg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoODescSeg() {
            return awlip8CoODescSeg;
        }

        /**
         * Define el valor de la propiedad awlip8CoODescSeg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoODescSeg(String value) {
            this.awlip8CoODescSeg = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOFecAltaLi.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOFecAltaLi() {
            return awlip8CoOFecAltaLi;
        }

        /**
         * Define el valor de la propiedad awlip8CoOFecAltaLi.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOFecAltaLi(String value) {
            this.awlip8CoOFecAltaLi = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOTipoClie.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOTipoClie() {
            return awlip8CoOTipoClie;
        }

        /**
         * Define el valor de la propiedad awlip8CoOTipoClie.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOTipoClie(String value) {
            this.awlip8CoOTipoClie = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoODescTipoClie.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoODescTipoClie() {
            return awlip8CoODescTipoClie;
        }

        /**
         * Define el valor de la propiedad awlip8CoODescTipoClie.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoODescTipoClie(String value) {
            this.awlip8CoODescTipoClie = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOCalle.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOCalle() {
            return awlip8CoOCalle;
        }

        /**
         * Define el valor de la propiedad awlip8CoOCalle.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOCalle(String value) {
            this.awlip8CoOCalle = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoONum.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoONum() {
            return awlip8CoONum;
        }

        /**
         * Define el valor de la propiedad awlip8CoONum.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoONum(String value) {
            this.awlip8CoONum = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoODpto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoODpto() {
            return awlip8CoODpto;
        }

        /**
         * Define el valor de la propiedad awlip8CoODpto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoODpto(String value) {
            this.awlip8CoODpto = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOPost.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOPost() {
            return awlip8CoOPost;
        }

        /**
         * Define el valor de la propiedad awlip8CoOPost.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOPost(String value) {
            this.awlip8CoOPost = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOComun.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOComun() {
            return awlip8CoOComun;
        }

        /**
         * Define el valor de la propiedad awlip8CoOComun.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOComun(String value) {
            this.awlip8CoOComun = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOCiuda.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOCiuda() {
            return awlip8CoOCiuda;
        }

        /**
         * Define el valor de la propiedad awlip8CoOCiuda.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOCiuda(String value) {
            this.awlip8CoOCiuda = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOCalleCob.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOCalleCob() {
            return awlip8CoOCalleCob;
        }

        /**
         * Define el valor de la propiedad awlip8CoOCalleCob.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOCalleCob(String value) {
            this.awlip8CoOCalleCob = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoONumCob.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoONumCob() {
            return awlip8CoONumCob;
        }

        /**
         * Define el valor de la propiedad awlip8CoONumCob.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoONumCob(String value) {
            this.awlip8CoONumCob = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoODptoCob.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoODptoCob() {
            return awlip8CoODptoCob;
        }

        /**
         * Define el valor de la propiedad awlip8CoODptoCob.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoODptoCob(String value) {
            this.awlip8CoODptoCob = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOPostCob.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOPostCob() {
            return awlip8CoOPostCob;
        }

        /**
         * Define el valor de la propiedad awlip8CoOPostCob.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOPostCob(String value) {
            this.awlip8CoOPostCob = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOComunCob.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOComunCob() {
            return awlip8CoOComunCob;
        }

        /**
         * Define el valor de la propiedad awlip8CoOComunCob.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOComunCob(String value) {
            this.awlip8CoOComunCob = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOCiudaCob.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOCiudaCob() {
            return awlip8CoOCiudaCob;
        }

        /**
         * Define el valor de la propiedad awlip8CoOCiudaCob.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOCiudaCob(String value) {
            this.awlip8CoOCiudaCob = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOZona.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOZona() {
            return awlip8CoOZona;
        }

        /**
         * Define el valor de la propiedad awlip8CoOZona.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOZona(String value) {
            this.awlip8CoOZona = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOCentral.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOCentral() {
            return awlip8CoOCentral;
        }

        /**
         * Define el valor de la propiedad awlip8CoOCentral.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOCentral(String value) {
            this.awlip8CoOCentral = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOPtaComercial.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOPtaComercial() {
            return awlip8CoOPtaComercial;
        }

        /**
         * Define el valor de la propiedad awlip8CoOPtaComercial.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOPtaComercial(String value) {
            this.awlip8CoOPtaComercial = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOFecInstalacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOFecInstalacion() {
            return awlip8CoOFecInstalacion;
        }

        /**
         * Define el valor de la propiedad awlip8CoOFecInstalacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOFecInstalacion(String value) {
            this.awlip8CoOFecInstalacion = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOTipoLinea.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOTipoLinea() {
            return awlip8CoOTipoLinea;
        }

        /**
         * Define el valor de la propiedad awlip8CoOTipoLinea.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOTipoLinea(String value) {
            this.awlip8CoOTipoLinea = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoODescTipoLinea.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoODescTipoLinea() {
            return awlip8CoODescTipoLinea;
        }

        /**
         * Define el valor de la propiedad awlip8CoODescTipoLinea.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoODescTipoLinea(String value) {
            this.awlip8CoODescTipoLinea = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOIndFact.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOIndFact() {
            return awlip8CoOIndFact;
        }

        /**
         * Define el valor de la propiedad awlip8CoOIndFact.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOIndFact(String value) {
            this.awlip8CoOIndFact = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOEstLinea.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOEstLinea() {
            return awlip8CoOEstLinea;
        }

        /**
         * Define el valor de la propiedad awlip8CoOEstLinea.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOEstLinea(String value) {
            this.awlip8CoOEstLinea = value;
        }

        /**
         * Gets the value of the awlip8CoOPiCliente property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the awlip8CoOPiCliente property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAwlip8CoOPiCliente().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProgramInterface.Awlip8CoSalida.Awlip8CoOPiCliente }
         * 
         * 
         */
        public List<ProgramInterface.Awlip8CoSalida.Awlip8CoOPiCliente> getAwlip8CoOPiCliente() {
            if (awlip8CoOPiCliente == null) {
                awlip8CoOPiCliente = new ArrayList<ProgramInterface.Awlip8CoSalida.Awlip8CoOPiCliente>();
            }
            return this.awlip8CoOPiCliente;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOCodRet.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOCodRet() {
            return awlip8CoOCodRet;
        }

        /**
         * Define el valor de la propiedad awlip8CoOCodRet.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOCodRet(String value) {
            this.awlip8CoOCodRet = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoODescCodRet.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoODescCodRet() {
            return awlip8CoODescCodRet;
        }

        /**
         * Define el valor de la propiedad awlip8CoODescCodRet.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoODescCodRet(String value) {
            this.awlip8CoODescCodRet = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOCodSubSeg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOCodSubSeg() {
            return awlip8CoOCodSubSeg;
        }

        /**
         * Define el valor de la propiedad awlip8CoOCodSubSeg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOCodSubSeg(String value) {
            this.awlip8CoOCodSubSeg = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOCodAgencia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOCodAgencia() {
            return awlip8CoOCodAgencia;
        }

        /**
         * Define el valor de la propiedad awlip8CoOCodAgencia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOCodAgencia(String value) {
            this.awlip8CoOCodAgencia = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoODescAgencia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoODescAgencia() {
            return awlip8CoODescAgencia;
        }

        /**
         * Define el valor de la propiedad awlip8CoODescAgencia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoODescAgencia(String value) {
            this.awlip8CoODescAgencia = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOCodComun.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOCodComun() {
            return awlip8CoOCodComun;
        }

        /**
         * Define el valor de la propiedad awlip8CoOCodComun.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOCodComun(String value) {
            this.awlip8CoOCodComun = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOCodComunCob.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOCodComunCob() {
            return awlip8CoOCodComunCob;
        }

        /**
         * Define el valor de la propiedad awlip8CoOCodComunCob.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOCodComunCob(String value) {
            this.awlip8CoOCodComunCob = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoODescZonaCent.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoODescZonaCent() {
            return awlip8CoODescZonaCent;
        }

        /**
         * Define el valor de la propiedad awlip8CoODescZonaCent.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoODescZonaCent(String value) {
            this.awlip8CoODescZonaCent = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoODescSubSeg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoODescSubSeg() {
            return awlip8CoODescSubSeg;
        }

        /**
         * Define el valor de la propiedad awlip8CoODescSubSeg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoODescSubSeg(String value) {
            this.awlip8CoODescSubSeg = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOPlanMinuto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOPlanMinuto() {
            return awlip8CoOPlanMinuto;
        }

        /**
         * Define el valor de la propiedad awlip8CoOPlanMinuto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOPlanMinuto(String value) {
            this.awlip8CoOPlanMinuto = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOMailCliente.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOMailCliente() {
            return awlip8CoOMailCliente;
        }

        /**
         * Define el valor de la propiedad awlip8CoOMailCliente.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOMailCliente(String value) {
            this.awlip8CoOMailCliente = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOFechaAltClte.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOFechaAltClte() {
            return awlip8CoOFechaAltClte;
        }

        /**
         * Define el valor de la propiedad awlip8CoOFechaAltClte.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOFechaAltClte(String value) {
            this.awlip8CoOFechaAltClte = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoOSecLin.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoOSecLin() {
            return awlip8CoOSecLin;
        }

        /**
         * Define el valor de la propiedad awlip8CoOSecLin.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoOSecLin(String value) {
            this.awlip8CoOSecLin = value;
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
         *         &lt;element name="awlip8co_o_cod_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
         *               &lt;maxInclusive value="999999999"/&gt;
         *               &lt;minInclusive value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_cod_op"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
         *               &lt;maxInclusive value="999999999"/&gt;
         *               &lt;minInclusive value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_desc_op"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_cant_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_tip_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="1"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_desc_tip_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="20"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_ind_fact_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="1"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_est_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="20"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_desc_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_fec_alta_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="10"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_fec_baja_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="10"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_cod_paq"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
         *               &lt;maxInclusive value="999999999"/&gt;
         *               &lt;minInclusive value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_nombre_paq"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="8"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_sec_paq"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="12"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_sec_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
         *               &lt;maxInclusive value="999999999999"/&gt;
         *               &lt;minInclusive value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_cod_familia"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
         *               &lt;maxInclusive value="999999999"/&gt;
         *               &lt;minInclusive value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_desc_familia"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_valor_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
         *               &lt;maxInclusive value="9999999999999"/&gt;
         *               &lt;minInclusive value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_moneda"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_cod_cf"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
         *               &lt;maxInclusive value="999999999"/&gt;
         *               &lt;minInclusive value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_cod_conf"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
         *               &lt;maxInclusive value="999999999"/&gt;
         *               &lt;minInclusive value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_desc_cf"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_cod_fam"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="5"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_des_fam"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="50"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlip8co_o_pi_cliente2" maxOccurs="20" minOccurs="20"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="awlip8co_o_sec_car"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
         *                         &lt;maxInclusive value="999999999999"/&gt;
         *                         &lt;minInclusive value="0"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awlip8co_o_cod_car"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
         *                         &lt;maxInclusive value="999999999999"/&gt;
         *                         &lt;minInclusive value="0"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awlip8co_o_cod_dom"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awlip8co_o_tip_dom"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="1"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awlip8co_o_valor_dom"&gt;
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
            "awlip8CoOCodPs",
            "awlip8CoOCodOp",
            "awlip8CoODescOp",
            "awlip8CoOCantPs",
            "awlip8CoOTipPs",
            "awlip8CoODescTipPs",
            "awlip8CoOIndFactPs",
            "awlip8CoOEstPs",
            "awlip8CoODescPs",
            "awlip8CoOFecAltaPs",
            "awlip8CoOFecBajaPs",
            "awlip8CoOCodPaq",
            "awlip8CoONombrePaq",
            "awlip8CoOSecPaq",
            "awlip8CoOSecPs",
            "awlip8CoOCodFamilia",
            "awlip8CoODescFamilia",
            "awlip8CoOValorPs",
            "awlip8CoOMoneda",
            "awlip8CoOCodCf",
            "awlip8CoOCodConf",
            "awlip8CoODescCf",
            "awlip8CoOCodFam",
            "awlip8CoODesFam",
            "awlip8CoOPiCliente2"
        })
        public static class Awlip8CoOPiCliente {

            @XmlElement(name = "awlip8co_o_cod_ps")
            protected long awlip8CoOCodPs;
            @XmlElement(name = "awlip8co_o_cod_op")
            protected long awlip8CoOCodOp;
            @XmlElement(name = "awlip8co_o_desc_op", required = true)
            protected String awlip8CoODescOp;
            @XmlElement(name = "awlip8co_o_cant_ps", required = true)
            protected String awlip8CoOCantPs;
            @XmlElement(name = "awlip8co_o_tip_ps", required = true)
            protected String awlip8CoOTipPs;
            @XmlElement(name = "awlip8co_o_desc_tip_ps", required = true)
            protected String awlip8CoODescTipPs;
            @XmlElement(name = "awlip8co_o_ind_fact_ps", required = true)
            protected String awlip8CoOIndFactPs;
            @XmlElement(name = "awlip8co_o_est_ps", required = true)
            protected String awlip8CoOEstPs;
            @XmlElement(name = "awlip8co_o_desc_ps", required = true)
            protected String awlip8CoODescPs;
            @XmlElement(name = "awlip8co_o_fec_alta_ps", required = true)
            protected String awlip8CoOFecAltaPs;
            @XmlElement(name = "awlip8co_o_fec_baja_ps", required = true)
            protected String awlip8CoOFecBajaPs;
            @XmlElement(name = "awlip8co_o_cod_paq")
            protected long awlip8CoOCodPaq;
            @XmlElement(name = "awlip8co_o_nombre_paq", required = true)
            protected String awlip8CoONombrePaq;
            @XmlElement(name = "awlip8co_o_sec_paq", required = true)
            protected String awlip8CoOSecPaq;
            @XmlElement(name = "awlip8co_o_sec_ps")
            protected long awlip8CoOSecPs;
            @XmlElement(name = "awlip8co_o_cod_familia")
            protected long awlip8CoOCodFamilia;
            @XmlElement(name = "awlip8co_o_desc_familia", required = true)
            protected String awlip8CoODescFamilia;
            @XmlElement(name = "awlip8co_o_valor_ps")
            protected long awlip8CoOValorPs;
            @XmlElement(name = "awlip8co_o_moneda", required = true)
            protected String awlip8CoOMoneda;
            @XmlElement(name = "awlip8co_o_cod_cf")
            protected long awlip8CoOCodCf;
            @XmlElement(name = "awlip8co_o_cod_conf")
            protected long awlip8CoOCodConf;
            @XmlElement(name = "awlip8co_o_desc_cf", required = true)
            protected String awlip8CoODescCf;
            @XmlElement(name = "awlip8co_o_cod_fam", required = true)
            protected String awlip8CoOCodFam;
            @XmlElement(name = "awlip8co_o_des_fam", required = true)
            protected String awlip8CoODesFam;
            @XmlElement(name = "awlip8co_o_pi_cliente", required = true)
            protected List<ProgramInterface.Awlip8CoSalida.Awlip8CoOPiCliente.Awlip8CoOPiCliente2> awlip8CoOPiCliente2;

            /**
             * Obtiene el valor de la propiedad awlip8CoOCodPs.
             * 
             */
            public long getAwlip8CoOCodPs() {
                return awlip8CoOCodPs;
            }

            /**
             * Define el valor de la propiedad awlip8CoOCodPs.
             * 
             */
            public void setAwlip8CoOCodPs(long value) {
                this.awlip8CoOCodPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoOCodOp.
             * 
             */
            public long getAwlip8CoOCodOp() {
                return awlip8CoOCodOp;
            }

            /**
             * Define el valor de la propiedad awlip8CoOCodOp.
             * 
             */
            public void setAwlip8CoOCodOp(long value) {
                this.awlip8CoOCodOp = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoODescOp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlip8CoODescOp() {
                return awlip8CoODescOp;
            }

            /**
             * Define el valor de la propiedad awlip8CoODescOp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlip8CoODescOp(String value) {
                this.awlip8CoODescOp = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoOCantPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlip8CoOCantPs() {
                return awlip8CoOCantPs;
            }

            /**
             * Define el valor de la propiedad awlip8CoOCantPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlip8CoOCantPs(String value) {
                this.awlip8CoOCantPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoOTipPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlip8CoOTipPs() {
                return awlip8CoOTipPs;
            }

            /**
             * Define el valor de la propiedad awlip8CoOTipPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlip8CoOTipPs(String value) {
                this.awlip8CoOTipPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoODescTipPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlip8CoODescTipPs() {
                return awlip8CoODescTipPs;
            }

            /**
             * Define el valor de la propiedad awlip8CoODescTipPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlip8CoODescTipPs(String value) {
                this.awlip8CoODescTipPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoOIndFactPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlip8CoOIndFactPs() {
                return awlip8CoOIndFactPs;
            }

            /**
             * Define el valor de la propiedad awlip8CoOIndFactPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlip8CoOIndFactPs(String value) {
                this.awlip8CoOIndFactPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoOEstPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlip8CoOEstPs() {
                return awlip8CoOEstPs;
            }

            /**
             * Define el valor de la propiedad awlip8CoOEstPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlip8CoOEstPs(String value) {
                this.awlip8CoOEstPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoODescPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlip8CoODescPs() {
                return awlip8CoODescPs;
            }

            /**
             * Define el valor de la propiedad awlip8CoODescPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlip8CoODescPs(String value) {
                this.awlip8CoODescPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoOFecAltaPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlip8CoOFecAltaPs() {
                return awlip8CoOFecAltaPs;
            }

            /**
             * Define el valor de la propiedad awlip8CoOFecAltaPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlip8CoOFecAltaPs(String value) {
                this.awlip8CoOFecAltaPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoOFecBajaPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlip8CoOFecBajaPs() {
                return awlip8CoOFecBajaPs;
            }

            /**
             * Define el valor de la propiedad awlip8CoOFecBajaPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlip8CoOFecBajaPs(String value) {
                this.awlip8CoOFecBajaPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoOCodPaq.
             * 
             */
            public long getAwlip8CoOCodPaq() {
                return awlip8CoOCodPaq;
            }

            /**
             * Define el valor de la propiedad awlip8CoOCodPaq.
             * 
             */
            public void setAwlip8CoOCodPaq(long value) {
                this.awlip8CoOCodPaq = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoONombrePaq.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlip8CoONombrePaq() {
                return awlip8CoONombrePaq;
            }

            /**
             * Define el valor de la propiedad awlip8CoONombrePaq.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlip8CoONombrePaq(String value) {
                this.awlip8CoONombrePaq = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoOSecPaq.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlip8CoOSecPaq() {
                return awlip8CoOSecPaq;
            }

            /**
             * Define el valor de la propiedad awlip8CoOSecPaq.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlip8CoOSecPaq(String value) {
                this.awlip8CoOSecPaq = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoOSecPs.
             * 
             */
            public long getAwlip8CoOSecPs() {
                return awlip8CoOSecPs;
            }

            /**
             * Define el valor de la propiedad awlip8CoOSecPs.
             * 
             */
            public void setAwlip8CoOSecPs(long value) {
                this.awlip8CoOSecPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoOCodFamilia.
             * 
             */
            public long getAwlip8CoOCodFamilia() {
                return awlip8CoOCodFamilia;
            }

            /**
             * Define el valor de la propiedad awlip8CoOCodFamilia.
             * 
             */
            public void setAwlip8CoOCodFamilia(long value) {
                this.awlip8CoOCodFamilia = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoODescFamilia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlip8CoODescFamilia() {
                return awlip8CoODescFamilia;
            }

            /**
             * Define el valor de la propiedad awlip8CoODescFamilia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlip8CoODescFamilia(String value) {
                this.awlip8CoODescFamilia = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoOValorPs.
             * 
             */
            public long getAwlip8CoOValorPs() {
                return awlip8CoOValorPs;
            }

            /**
             * Define el valor de la propiedad awlip8CoOValorPs.
             * 
             */
            public void setAwlip8CoOValorPs(long value) {
                this.awlip8CoOValorPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoOMoneda.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlip8CoOMoneda() {
                return awlip8CoOMoneda;
            }

            /**
             * Define el valor de la propiedad awlip8CoOMoneda.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlip8CoOMoneda(String value) {
                this.awlip8CoOMoneda = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoOCodCf.
             * 
             */
            public long getAwlip8CoOCodCf() {
                return awlip8CoOCodCf;
            }

            /**
             * Define el valor de la propiedad awlip8CoOCodCf.
             * 
             */
            public void setAwlip8CoOCodCf(long value) {
                this.awlip8CoOCodCf = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoOCodConf.
             * 
             */
            public long getAwlip8CoOCodConf() {
                return awlip8CoOCodConf;
            }

            /**
             * Define el valor de la propiedad awlip8CoOCodConf.
             * 
             */
            public void setAwlip8CoOCodConf(long value) {
                this.awlip8CoOCodConf = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoODescCf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlip8CoODescCf() {
                return awlip8CoODescCf;
            }

            /**
             * Define el valor de la propiedad awlip8CoODescCf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlip8CoODescCf(String value) {
                this.awlip8CoODescCf = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoOCodFam.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlip8CoOCodFam() {
                return awlip8CoOCodFam;
            }

            /**
             * Define el valor de la propiedad awlip8CoOCodFam.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlip8CoOCodFam(String value) {
                this.awlip8CoOCodFam = value;
            }

            /**
             * Obtiene el valor de la propiedad awlip8CoODesFam.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlip8CoODesFam() {
                return awlip8CoODesFam;
            }

            /**
             * Define el valor de la propiedad awlip8CoODesFam.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlip8CoODesFam(String value) {
                this.awlip8CoODesFam = value;
            }

            /**
             * Gets the value of the awlip8CoOPiCliente2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the awlip8CoOPiCliente2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAwlip8CoOPiCliente2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProgramInterface.Awlip8CoSalida.Awlip8CoOPiCliente.Awlip8CoOPiCliente2 }
             * 
             * 
             */
            public List<ProgramInterface.Awlip8CoSalida.Awlip8CoOPiCliente.Awlip8CoOPiCliente2> getAwlip8CoOPiCliente2() {
                if (awlip8CoOPiCliente2 == null) {
                    awlip8CoOPiCliente2 = new ArrayList<ProgramInterface.Awlip8CoSalida.Awlip8CoOPiCliente.Awlip8CoOPiCliente2>();
                }
                return this.awlip8CoOPiCliente2;
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
             *         &lt;element name="awlip8co_o_sec_car"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
             *               &lt;maxInclusive value="999999999999"/&gt;
             *               &lt;minInclusive value="0"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awlip8co_o_cod_car"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
             *               &lt;maxInclusive value="999999999999"/&gt;
             *               &lt;minInclusive value="0"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awlip8co_o_cod_dom"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="12"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awlip8co_o_tip_dom"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="1"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awlip8co_o_valor_dom"&gt;
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
                "awlip8CoOSecCar",
                "awlip8CoOCodCar",
                "awlip8CoOCodDom",
                "awlip8CoOTipDom",
                "awlip8CoOValorDom"
            })
            public static class Awlip8CoOPiCliente2 {

                @XmlElement(name = "awlip8co_o_sec_car")
                protected long awlip8CoOSecCar;
                @XmlElement(name = "awlip8co_o_cod_car")
                protected long awlip8CoOCodCar;
                @XmlElement(name = "awlip8co_o_cod_dom", required = true)
                protected String awlip8CoOCodDom;
                @XmlElement(name = "awlip8co_o_tip_dom", required = true)
                protected String awlip8CoOTipDom;
                @XmlElement(name = "awlip8co_o_valor_dom", required = true)
                protected String awlip8CoOValorDom;

                /**
                 * Obtiene el valor de la propiedad awlip8CoOSecCar.
                 * 
                 */
                public long getAwlip8CoOSecCar() {
                    return awlip8CoOSecCar;
                }

                /**
                 * Define el valor de la propiedad awlip8CoOSecCar.
                 * 
                 */
                public void setAwlip8CoOSecCar(long value) {
                    this.awlip8CoOSecCar = value;
                }

                /**
                 * Obtiene el valor de la propiedad awlip8CoOCodCar.
                 * 
                 */
                public long getAwlip8CoOCodCar() {
                    return awlip8CoOCodCar;
                }

                /**
                 * Define el valor de la propiedad awlip8CoOCodCar.
                 * 
                 */
                public void setAwlip8CoOCodCar(long value) {
                    this.awlip8CoOCodCar = value;
                }

                /**
                 * Obtiene el valor de la propiedad awlip8CoOCodDom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwlip8CoOCodDom() {
                    return awlip8CoOCodDom;
                }

                /**
                 * Define el valor de la propiedad awlip8CoOCodDom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwlip8CoOCodDom(String value) {
                    this.awlip8CoOCodDom = value;
                }

                /**
                 * Obtiene el valor de la propiedad awlip8CoOTipDom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwlip8CoOTipDom() {
                    return awlip8CoOTipDom;
                }

                /**
                 * Define el valor de la propiedad awlip8CoOTipDom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwlip8CoOTipDom(String value) {
                    this.awlip8CoOTipDom = value;
                }

                /**
                 * Obtiene el valor de la propiedad awlip8CoOValorDom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwlip8CoOValorDom() {
                    return awlip8CoOValorDom;
                }

                /**
                 * Define el valor de la propiedad awlip8CoOValorDom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwlip8CoOValorDom(String value) {
                    this.awlip8CoOValorDom = value;
                }

            }

        }

    }

}
