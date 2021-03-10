//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.10 at 04:01:49 AM BRT 
//


package br.gov.mec.portal.diplomadigital.arquivos_em_xsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TFormaAcessoCurso.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TFormaAcessoCurso">
 *   &lt;restriction base="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TString">
 *     &lt;enumeration value="Programas de avaliação seriada ou continuada"/>
 *     &lt;enumeration value="Convenios"/>
 *     &lt;enumeration value="Histórico escolar"/>
 *     &lt;enumeration value="Sisu"/>
 *     &lt;enumeration value="Enem"/>
 *     &lt;enumeration value="Vestibular"/>
 *     &lt;enumeration value="Prova agendada"/>
 *     &lt;enumeration value="Entrevista"/>
 *     &lt;enumeration value="Transferência"/>
 *     &lt;enumeration value="Outros"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TFormaAcessoCurso")
@XmlEnum
public enum TFormaAcessoCurso {

    @XmlEnumValue("Programas de avalia\u00e7\u00e3o seriada ou continuada")
    PROGRAMAS_DE_AVALIAÇÃO_SERIADA_OU_CONTINUADA("Programas de avalia\u00e7\u00e3o seriada ou continuada"),
    @XmlEnumValue("Convenios")
    CONVENIOS("Convenios"),
    @XmlEnumValue("Hist\u00f3rico escolar")
    HISTÓRICO_ESCOLAR("Hist\u00f3rico escolar"),
    @XmlEnumValue("Sisu")
    SISU("Sisu"),
    @XmlEnumValue("Enem")
    ENEM("Enem"),
    @XmlEnumValue("Vestibular")
    VESTIBULAR("Vestibular"),
    @XmlEnumValue("Prova agendada")
    PROVA_AGENDADA("Prova agendada"),
    @XmlEnumValue("Entrevista")
    ENTREVISTA("Entrevista"),
    @XmlEnumValue("Transfer\u00eancia")
    TRANSFERÊNCIA("Transfer\u00eancia"),
    @XmlEnumValue("Outros")
    OUTROS("Outros");
    private final String value;

    TFormaAcessoCurso(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TFormaAcessoCurso fromValue(String v) {
        for (TFormaAcessoCurso c: TFormaAcessoCurso.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}