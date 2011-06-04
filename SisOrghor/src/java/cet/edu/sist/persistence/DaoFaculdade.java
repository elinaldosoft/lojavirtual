/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cet.edu.sist.persistence;

import cet.edu.sist.dominio.Faculdade;

/**
 *
 * @author bestoff
 */
public class DaoFaculdade extends BaseDaoJPA2<Faculdade> implements BaseDao<Faculdade> {

    @Override
    protected Class<Faculdade> getClassDominio() {
        
        return Faculdade.class;
    }

 
}
