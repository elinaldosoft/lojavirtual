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
@Entity(name="pessoa")
public class PessoaFisica extends BaseEntity {

    private String nome;
    private String sobrenome;

    
}
