package model;

import util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;
import javax.persistence.Query;

public class CidadegemeaService {
    
    public List<Cidadegemea> listarCidades(){

        List<Cidadegemea> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();       

        Query query = em.createQuery("select cg from Cidadegemea cg");

        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return result;
    }
}
