
package model;

import util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;
import javax.persistence.Query;

public class AeroportoService {
    
    public List<Aeroporto> listarAeroportos(){

        List<Aeroporto> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();       

        Query query = em.createQuery("select ae from Aeroporto ae");

        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return result;
    }
}
