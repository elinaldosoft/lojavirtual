/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cet.edu.sist.controller;

import cet.edu.sist.dominio.Endereco;
import cet.edu.sist.dominio.Faculdade;
import cet.edu.sist.dominio.enuns.TipoCampus;
import cet.edu.sist.model.ModelFaculdade;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author bestoff
 */
@ManagedBean(name="contrfacul")
@SessionScoped
public class ControllerFaculdade {

    private ModelFaculdade modelFaculdade = new ModelFaculdade();
    private Faculdade faculdade = new Faculdade();
    private Endereco endereco = new Endereco();
    private List<Endereco> enderecos = new ArrayList<Endereco>();
    private String tipoCampus;

    public ControllerFaculdade() {
    }
    
    public void cadastrar(){
        
        faculdade.setEndereco(enderecos);        
        modelFaculdade.salvar(faculdade);

        faculdade = new Faculdade();
        enderecos = new ArrayList<Endereco>();
    }

    public void addEndereco(){
        
        enderecos.add(endereco);
        endereco = new Endereco();
    }
    
    public List<String> getListCampus(){
        
        ArrayList<String> listTipoCampus = new ArrayList<String>();
        TipoCampus[] lista = TipoCampus.values();
        
        for(TipoCampus tipoCampus : lista){
            
            listTipoCampus.add(tipoCampus.toString());
        }
        
        return listTipoCampus;
    }
    public Faculdade getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(Faculdade faculdade) {
        this.faculdade = faculdade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public String getTipoCampus() {
        return tipoCampus;
    }

    public void setTipoCampus(String tipoCampus) {
        this.tipoCampus = tipoCampus;
    }
    
    
    
    
}
