/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cet.edu.sist.persistence;

import cet.edu.sist.dominio.BaseEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author bestoff
 */
public abstract class BaseDaoJPA2<T extends BaseEntity> implements BaseDao<T> {

    protected abstract Class<T> getClassDominio();

    @Override
    public void salvar(T entity) {

        EntityManager em = new JPAUtil().getEntityManager();

        try {

            if (entity.isPersistence()) {

                em.getTransaction().begin();
                em.merge(entity);
                em.getTransaction().commit();

            } else {

                em.getTransaction().begin();
                em.persist(entity);
                em.getTransaction().commit();
            }

        } catch (Exception e) {

            e.getStackTrace();
            em.getTransaction().rollback();

        } finally {
            em.close();
        }

    }

    @Override
    public List<T> listTodos() {

        EntityManager em = new JPAUtil().getEntityManager();

        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery cq = criteriaBuilder.createQuery(getClassDominio());

        return em.createQuery(cq).getResultList();


    }

    @Override
    public void excluir(T entity) {

        EntityManager em = new JPAUtil().getEntityManager();

        try {

            em.getTransaction().begin();
            em.remove(entity);
            em.getTransaction().commit();

        } catch (Exception e) {

            e.getStackTrace();
            em.getTransaction().rollback();

        } finally {

            em.close();
        }
    }
}
