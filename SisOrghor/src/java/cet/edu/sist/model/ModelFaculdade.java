/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cet.edu.sist.model;

import cet.edu.sist.dominio.Faculdade;
import cet.edu.sist.persistence.DaoFaculdade;

/**
 *
 * @author bestoff
 */
public class ModelFaculdade {

    private DaoFaculdade daoFaculdade = new DaoFaculdade();

    public ModelFaculdade() {
    }   
    
    public void salvar(Faculdade faculdade){
        
        daoFaculdade.salvar(faculdade);
    }


    
}
