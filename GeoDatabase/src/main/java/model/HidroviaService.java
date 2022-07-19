package model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import util.JPAUtil;

public class HidroviaService {
    
    public List<Hidrovia> hidroRio(String nome_hidro){
        List<Hidrovia> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();       

        Query query = em.createQuery("select rio from Hidrovia rio where rio.nome_hidro = :nome_hidro");
        query.setParameter("nome_hidro", nome_hidro);
        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return result;
    }
       

}
