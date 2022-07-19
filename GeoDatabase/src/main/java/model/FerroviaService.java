package model;

import util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;
import javax.persistence.Query;

public class FerroviaService {
    
    public List<Ferrovia> listarFerrovia(){

        List<Ferrovia> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();       

        Query query = em.createQuery("select fr from Ferrovia fr");

        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return result;
        
    }

public List<Ferrovia> operadoraFerrovia(String ferrovia, Integer gid){
        List<Ferrovia> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();       

        Query query = em.createQuery("select op from Ferrovia op where op.ferrovia = :ferrovia and op.gid = :gid");
        query.setParameter("ferrovia", ferrovia);
        query.setParameter("gid", gid);
        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return result;
    }

}

