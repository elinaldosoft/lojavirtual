/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cet.edu.sist.dominio;

import cet.edu.sist.dominio.enuns.TipoCampus;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author bestoff
 */
@Entity(name="endereco")
public class Endereco extends BaseEntity {

    private String endereco;
    private String bairro;
    private String numero;
    private String cep;
    private String caixaPostal;
    private String pais;
    private String estado;
    private String cidade;
    private String complemento;
    @Enumerated(EnumType.STRING)
    private TipoCampus campos;
    private String nomeCampus;

    public Endereco() {
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCaixaPostal() {
        return caixaPostal;
    }

    public void setCaixaPostal(String caixaPostal) {
        this.caixaPostal = caixaPostal;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNomeCampus() {
        return nomeCampus;
    }

    public void setNomeCampus(String nomeCampus) {
        this.nomeCampus = nomeCampus;
    }

    public TipoCampus getCampos() {
        return campos;
    }

    public void setCampos(TipoCampus campos) {
        this.campos = campos;
    }
    
    
}
