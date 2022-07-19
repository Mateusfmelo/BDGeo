
package model;

import util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;
import javax.persistence.Query;

public class RodoviaService {
    
public List<Rodovia> listarTodos(){
        List<Rodovia> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();       

        Query query = em.createQuery("select tds from Rodovia tds");
        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return result;

    }
    
}
