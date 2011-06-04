/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cet.edu.sist.dominio;

import javax.persistence.Entity;

/**
 *
 * @author bestoff
 */
@Entity(name="curso")
public class Curso extends BaseEntity {
    
    private String nomeCurso;

    public Curso() {
    }
    
    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    
    
    
}
