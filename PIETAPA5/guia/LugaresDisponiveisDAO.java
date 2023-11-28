package guia;

import jakarta.persistence.EntityManager;

public class LugaresDisponiveisDAO {

    public void cadastrar(LugaresDisponiveis lugares) {
        EntityManager em = JPAutil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(lugares);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAutil.closeEtityManager();
        }
    }
}
