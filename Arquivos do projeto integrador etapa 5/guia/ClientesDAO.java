
package guia;

import jakarta.persistence.EntityManager;

/**
 *
 * @author Gabriel
 */
public class ClientesDAO {
    public void cadastrar(Clientes c) {
        EntityManager em = JPAutil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAutil.closeEtityManager();
        }
    }
}
