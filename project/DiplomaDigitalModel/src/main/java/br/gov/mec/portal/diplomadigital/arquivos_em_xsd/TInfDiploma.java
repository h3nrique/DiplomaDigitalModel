//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.20 at 12:04:39 AM BRT 
//


package br.gov.mec.portal.diplomadigital.arquivos_em_xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Tipo Diploma Digital
 * 
 * <p>Java class for TInfDiploma complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TInfDiploma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="DadosDiploma" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TDadosDiploma"/>
 *           &lt;element name="DadosDiplomaNSF" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TDadosDiplomaNSF"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="DadosRegistro" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TDadosRegistro"/>
 *           &lt;element name="DadosRegistroNSF" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TDadosRegistroNSF"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TVersao" />
 *       &lt;attribute name="id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
 *             &lt;pattern value="VDip[0-9]{44}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TInfDiploma", propOrder = {
    "dadosDiploma",
    "dadosDiplomaNSF",
    "dadosRegistro",
    "dadosRegistroNSF"
})
public class TInfDiploma {

    @XmlElement(name = "DadosDiploma")
    protected TDadosDiploma dadosDiploma;
    @XmlElement(name = "DadosDiplomaNSF")
    protected TDadosDiplomaNSF dadosDiplomaNSF;
    @XmlElement(name = "DadosRegistro")
    protected TDadosRegistro dadosRegistro;
    @XmlElement(name = "DadosRegistroNSF")
    protected TDadosRegistroNSF dadosRegistroNSF;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the dadosDiploma property.
     * 
     * @return
     *     possible object is
     *     {@link TDadosDiploma }
     *     
     */
    public TDadosDiploma getDadosDiploma() {
        return dadosDiploma;
    }

    /**
     * Sets the value of the dadosDiploma property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosDiploma }
     *     
     */
    public void setDadosDiploma(TDadosDiploma value) {
        this.dadosDiploma = value;
    }

    /**
     * Gets the value of the dadosDiplomaNSF property.
     * 
     * @return
     *     possible object is
     *     {@link TDadosDiplomaNSF }
     *     
     */
    public TDadosDiplomaNSF getDadosDiplomaNSF() {
        return dadosDiplomaNSF;
    }

    /**
     * Sets the value of the dadosDiplomaNSF property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosDiplomaNSF }
     *     
     */
    public void setDadosDiplomaNSF(TDadosDiplomaNSF value) {
        this.dadosDiplomaNSF = value;
    }

    /**
     * Gets the value of the dadosRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link TDadosRegistro }
     *     
     */
    public TDadosRegistro getDadosRegistro() {
        return dadosRegistro;
    }

    /**
     * Sets the value of the dadosRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosRegistro }
     *     
     */
    public void setDadosRegistro(TDadosRegistro value) {
        this.dadosRegistro = value;
    }

    /**
     * Gets the value of the dadosRegistroNSF property.
     * 
     * @return
     *     possible object is
     *     {@link TDadosRegistroNSF }
     *     
     */
    public TDadosRegistroNSF getDadosRegistroNSF() {
        return dadosRegistroNSF;
    }

    /**
     * Sets the value of the dadosRegistroNSF property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosRegistroNSF }
     *     
     */
    public void setDadosRegistroNSF(TDadosRegistroNSF value) {
        this.dadosRegistroNSF = value;
    }

    /**
     * Gets the value of the versao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Sets the value of the versao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
