package guia;

import jakarta.persistence.EntityManager;

/**
 *
 * @author Gabriel
 */
public class VendaDAO {

    public void cadastrar(Venda v) {
        EntityManager em = JPAutil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(v);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAutil.closeEtityManager();
        }
    }
}
