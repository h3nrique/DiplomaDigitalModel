//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.10 at 04:01:49 AM BRT 
//


package br.gov.mec.portal.diplomadigital.arquivos_em_xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo naturalidade
 * 
 * <p>Java class for TNaturalidade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TNaturalidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}GMunicipio"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNaturalidade", propOrder = {
    "codigoMunicipio",
    "nomeMunicipio",
    "uf"
})
public class TNaturalidade {

    @XmlElement(name = "CodigoMunicipio", required = true)
    protected String codigoMunicipio;
    @XmlElement(name = "NomeMunicipio", required = true)
    protected String nomeMunicipio;
    @XmlElement(name = "UF", required = true)
    @XmlSchemaType(name = "string")
    protected TUf uf;

    /**
     * Gets the value of the codigoMunicipio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    /**
     * Sets the value of the codigoMunicipio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMunicipio(String value) {
        this.codigoMunicipio = value;
    }

    /**
     * Gets the value of the nomeMunicipio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    /**
     * Sets the value of the nomeMunicipio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMunicipio(String value) {
        this.nomeMunicipio = value;
    }

    /**
     * Gets the value of the uf property.
     * 
     * @return
     *     possible object is
     *     {@link TUf }
     *     
     */
    public TUf getUF() {
        return uf;
    }

    /**
     * Sets the value of the uf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TUf }
     *     
     */
    public void setUF(TUf value) {
        this.uf = value;
    }

}