//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.20 at 12:04:39 AM BRT 
//


package br.gov.mec.portal.diplomadigital.arquivos_em_xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TTituloConferido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TTituloConferido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Titulo" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TTitulo"/>
 *         &lt;element name="OutroTitulo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TString">
 *               &lt;whiteSpace value="collapse"/>
 *               &lt;maxLength value="255"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTituloConferido", propOrder = {
    "titulo",
    "outroTitulo"
})
public class TTituloConferido {

    @XmlElement(name = "Titulo")
    @XmlSchemaType(name = "string")
    protected TTitulo titulo;
    @XmlElement(name = "OutroTitulo")
    protected String outroTitulo;

    /**
     * Gets the value of the titulo property.
     * 
     * @return
     *     possible object is
     *     {@link TTitulo }
     *     
     */
    public TTitulo getTitulo() {
        return titulo;
    }

    /**
     * Sets the value of the titulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTitulo }
     *     
     */
    public void setTitulo(TTitulo value) {
        this.titulo = value;
    }

    /**
     * Gets the value of the outroTitulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutroTitulo() {
        return outroTitulo;
    }

    /**
     * Sets the value of the outroTitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutroTitulo(String value) {
        this.outroTitulo = value;
    }

}
