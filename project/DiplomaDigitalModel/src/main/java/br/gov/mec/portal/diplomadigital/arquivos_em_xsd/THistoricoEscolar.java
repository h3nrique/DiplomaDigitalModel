//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.10 at 04:01:49 AM BRT 
//


package br.gov.mec.portal.diplomadigital.arquivos_em_xsd;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Dados do historico
 * 
 * <p>Java class for THistoricoEscolar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="THistoricoEscolar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatrizCurricular">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DisciplinaCursada" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Disciplina" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TString"/>
 *                             &lt;element name="Periodo" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TString"/>
 *                             &lt;choice>
 *                               &lt;element name="Nota" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TNota"/>
 *                               &lt;element name="Conceito" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TConceito"/>
 *                             &lt;/choice>
 *                             &lt;element name="Docentes">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence maxOccurs="unbounded">
 *                                       &lt;element name="Docente">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Nome" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TNome"/>
 *                                                 &lt;element name="Titulacao" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TTitulacao"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DataEmissaoHistorico" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TData"/>
 *         &lt;element name="SituacaoAluno" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TSituacaoAlunoHistorico"/>
 *         &lt;element name="SituacaoENADE" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TSituacaoAlunoEnadeHistorico"/>
 *         &lt;element name="DataProvaEnade" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TData" minOccurs="0"/>
 *         &lt;element name="CargaHorariaCursoIntegralizada" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TNumeroPositivo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "THistoricoEscolar", propOrder = {
    "matrizCurricular",
    "dataEmissaoHistorico",
    "situacaoAluno",
    "situacaoENADE",
    "dataProvaEnade",
    "cargaHorariaCursoIntegralizada"
})
public class THistoricoEscolar {

    @XmlElement(name = "MatrizCurricular", required = true)
    protected THistoricoEscolar.MatrizCurricular matrizCurricular;
    @XmlElement(name = "DataEmissaoHistorico", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEmissaoHistorico;
    @XmlElement(name = "SituacaoAluno", required = true)
    @XmlSchemaType(name = "string")
    protected TSituacaoAlunoHistorico situacaoAluno;
    @XmlElement(name = "SituacaoENADE", required = true)
    @XmlSchemaType(name = "string")
    protected TSituacaoAlunoEnadeHistorico situacaoENADE;
    @XmlElement(name = "DataProvaEnade")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataProvaEnade;
    @XmlElement(name = "CargaHorariaCursoIntegralizada")
    @XmlSchemaType(name = "unsignedInt")
    protected long cargaHorariaCursoIntegralizada;

    /**
     * Gets the value of the matrizCurricular property.
     * 
     * @return
     *     possible object is
     *     {@link THistoricoEscolar.MatrizCurricular }
     *     
     */
    public THistoricoEscolar.MatrizCurricular getMatrizCurricular() {
        return matrizCurricular;
    }

    /**
     * Sets the value of the matrizCurricular property.
     * 
     * @param value
     *     allowed object is
     *     {@link THistoricoEscolar.MatrizCurricular }
     *     
     */
    public void setMatrizCurricular(THistoricoEscolar.MatrizCurricular value) {
        this.matrizCurricular = value;
    }

    /**
     * Gets the value of the dataEmissaoHistorico property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissaoHistorico() {
        return dataEmissaoHistorico;
    }

    /**
     * Sets the value of the dataEmissaoHistorico property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissaoHistorico(XMLGregorianCalendar value) {
        this.dataEmissaoHistorico = value;
    }

    /**
     * Gets the value of the situacaoAluno property.
     * 
     * @return
     *     possible object is
     *     {@link TSituacaoAlunoHistorico }
     *     
     */
    public TSituacaoAlunoHistorico getSituacaoAluno() {
        return situacaoAluno;
    }

    /**
     * Sets the value of the situacaoAluno property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSituacaoAlunoHistorico }
     *     
     */
    public void setSituacaoAluno(TSituacaoAlunoHistorico value) {
        this.situacaoAluno = value;
    }

    /**
     * Gets the value of the situacaoENADE property.
     * 
     * @return
     *     possible object is
     *     {@link TSituacaoAlunoEnadeHistorico }
     *     
     */
    public TSituacaoAlunoEnadeHistorico getSituacaoENADE() {
        return situacaoENADE;
    }

    /**
     * Sets the value of the situacaoENADE property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSituacaoAlunoEnadeHistorico }
     *     
     */
    public void setSituacaoENADE(TSituacaoAlunoEnadeHistorico value) {
        this.situacaoENADE = value;
    }

    /**
     * Gets the value of the dataProvaEnade property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataProvaEnade() {
        return dataProvaEnade;
    }

    /**
     * Sets the value of the dataProvaEnade property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataProvaEnade(XMLGregorianCalendar value) {
        this.dataProvaEnade = value;
    }

    /**
     * Gets the value of the cargaHorariaCursoIntegralizada property.
     * 
     */
    public long getCargaHorariaCursoIntegralizada() {
        return cargaHorariaCursoIntegralizada;
    }

    /**
     * Sets the value of the cargaHorariaCursoIntegralizada property.
     * 
     */
    public void setCargaHorariaCursoIntegralizada(long value) {
        this.cargaHorariaCursoIntegralizada = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DisciplinaCursada" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Disciplina" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TString"/>
     *                   &lt;element name="Periodo" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TString"/>
     *                   &lt;choice>
     *                     &lt;element name="Nota" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TNota"/>
     *                     &lt;element name="Conceito" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TConceito"/>
     *                   &lt;/choice>
     *                   &lt;element name="Docentes">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence maxOccurs="unbounded">
     *                             &lt;element name="Docente">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Nome" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TNome"/>
     *                                       &lt;element name="Titulacao" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TTitulacao"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "disciplinaCursada"
    })
    public static class MatrizCurricular {

        @XmlElement(name = "DisciplinaCursada", required = true)
        protected List<THistoricoEscolar.MatrizCurricular.DisciplinaCursada> disciplinaCursada;

        /**
         * Gets the value of the disciplinaCursada property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the disciplinaCursada property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDisciplinaCursada().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link THistoricoEscolar.MatrizCurricular.DisciplinaCursada }
         * 
         * 
         */
        public List<THistoricoEscolar.MatrizCurricular.DisciplinaCursada> getDisciplinaCursada() {
            if (disciplinaCursada == null) {
                disciplinaCursada = new ArrayList<THistoricoEscolar.MatrizCurricular.DisciplinaCursada>();
            }
            return this.disciplinaCursada;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Disciplina" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TString"/>
         *         &lt;element name="Periodo" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TString"/>
         *         &lt;choice>
         *           &lt;element name="Nota" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TNota"/>
         *           &lt;element name="Conceito" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TConceito"/>
         *         &lt;/choice>
         *         &lt;element name="Docentes">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence maxOccurs="unbounded">
         *                   &lt;element name="Docente">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Nome" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TNome"/>
         *                             &lt;element name="Titulacao" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TTitulacao"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "disciplina",
            "periodo",
            "nota",
            "conceito",
            "docentes"
        })
        public static class DisciplinaCursada {

            @XmlElement(name = "Disciplina", required = true)
            protected String disciplina;
            @XmlElement(name = "Periodo", required = true)
            protected String periodo;
            @XmlElement(name = "Nota")
            protected BigDecimal nota;
            @XmlElement(name = "Conceito")
            protected String conceito;
            @XmlElement(name = "Docentes", required = true)
            protected THistoricoEscolar.MatrizCurricular.DisciplinaCursada.Docentes docentes;

            /**
             * Gets the value of the disciplina property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDisciplina() {
                return disciplina;
            }

            /**
             * Sets the value of the disciplina property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisciplina(String value) {
                this.disciplina = value;
            }

            /**
             * Gets the value of the periodo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPeriodo() {
                return periodo;
            }

            /**
             * Sets the value of the periodo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPeriodo(String value) {
                this.periodo = value;
            }

            /**
             * Gets the value of the nota property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNota() {
                return nota;
            }

            /**
             * Sets the value of the nota property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNota(BigDecimal value) {
                this.nota = value;
            }

            /**
             * Gets the value of the conceito property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConceito() {
                return conceito;
            }

            /**
             * Sets the value of the conceito property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConceito(String value) {
                this.conceito = value;
            }

            /**
             * Gets the value of the docentes property.
             * 
             * @return
             *     possible object is
             *     {@link THistoricoEscolar.MatrizCurricular.DisciplinaCursada.Docentes }
             *     
             */
            public THistoricoEscolar.MatrizCurricular.DisciplinaCursada.Docentes getDocentes() {
                return docentes;
            }

            /**
             * Sets the value of the docentes property.
             * 
             * @param value
             *     allowed object is
             *     {@link THistoricoEscolar.MatrizCurricular.DisciplinaCursada.Docentes }
             *     
             */
            public void setDocentes(THistoricoEscolar.MatrizCurricular.DisciplinaCursada.Docentes value) {
                this.docentes = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence maxOccurs="unbounded">
             *         &lt;element name="Docente">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Nome" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TNome"/>
             *                   &lt;element name="Titulacao" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TTitulacao"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "docente"
            })
            public static class Docentes {

                @XmlElement(name = "Docente", required = true)
                protected List<THistoricoEscolar.MatrizCurricular.DisciplinaCursada.Docentes.Docente> docente;

                /**
                 * Gets the value of the docente property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the docente property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDocente().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link THistoricoEscolar.MatrizCurricular.DisciplinaCursada.Docentes.Docente }
                 * 
                 * 
                 */
                public List<THistoricoEscolar.MatrizCurricular.DisciplinaCursada.Docentes.Docente> getDocente() {
                    if (docente == null) {
                        docente = new ArrayList<THistoricoEscolar.MatrizCurricular.DisciplinaCursada.Docentes.Docente>();
                    }
                    return this.docente;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Nome" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TNome"/>
                 *         &lt;element name="Titulacao" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TTitulacao"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "nome",
                    "titulacao"
                })
                public static class Docente {

                    @XmlElement(name = "Nome", required = true)
                    protected String nome;
                    @XmlElement(name = "Titulacao", required = true)
                    @XmlSchemaType(name = "string")
                    protected TTitulacao titulacao;

                    /**
                     * Gets the value of the nome property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNome() {
                        return nome;
                    }

                    /**
                     * Sets the value of the nome property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNome(String value) {
                        this.nome = value;
                    }

                    /**
                     * Gets the value of the titulacao property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TTitulacao }
                     *     
                     */
                    public TTitulacao getTitulacao() {
                        return titulacao;
                    }

                    /**
                     * Sets the value of the titulacao property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TTitulacao }
                     *     
                     */
                    public void setTitulacao(TTitulacao value) {
                        this.titulacao = value;
                    }

                }

            }

        }

    }

}
