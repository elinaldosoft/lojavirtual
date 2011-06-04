/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cet.edu.sist.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author bestoff
 */
public class JPAUtil {
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("SisOrghorPU");

    public EntityManager getEntityManager() {
        
        return emf.createEntityManager();
    }
    
}
