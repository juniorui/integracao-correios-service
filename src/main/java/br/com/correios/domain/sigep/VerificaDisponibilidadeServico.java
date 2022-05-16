//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v2.3.6 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2022.03.23 �s 05:22:51 PM BRT 
//


package br.com.correios.domain.sigep;;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de verificaDisponibilidadeServico complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="verificaDisponibilidadeServico"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codAdministrativo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numeroServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cepOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cepDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificaDisponibilidadeServico", propOrder = {
    "codAdministrativo",
    "numeroServico",
    "cepOrigem",
    "cepDestino",
    "usuario",
    "senha"
})
public class VerificaDisponibilidadeServico {

    protected Integer codAdministrativo;
    protected String numeroServico;
    protected String cepOrigem;
    protected String cepDestino;
    protected String usuario;
    protected String senha;

    /**
     * Obt�m o valor da propriedade codAdministrativo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodAdministrativo() {
        return codAdministrativo;
    }

    /**
     * Define o valor da propriedade codAdministrativo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodAdministrativo(Integer value) {
        this.codAdministrativo = value;
    }

    /**
     * Obt�m o valor da propriedade numeroServico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroServico() {
        return numeroServico;
    }

    /**
     * Define o valor da propriedade numeroServico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroServico(String value) {
        this.numeroServico = value;
    }

    /**
     * Obt�m o valor da propriedade cepOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepOrigem() {
        return cepOrigem;
    }

    /**
     * Define o valor da propriedade cepOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepOrigem(String value) {
        this.cepOrigem = value;
    }

    /**
     * Obt�m o valor da propriedade cepDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepDestino() {
        return cepDestino;
    }

    /**
     * Define o valor da propriedade cepDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepDestino(String value) {
        this.cepDestino = value;
    }

    /**
     * Obt�m o valor da propriedade usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obt�m o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

}
