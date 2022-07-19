package model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Query;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;
import util.JPAUtil;

public class EstadoService {
    
        public List<Estado> listarMuni(String sigla){
            List<Estado> result = null;
            EntityManager em = JPAUtil.createEntityManager();   
            em.getTransaction().begin();       

            Query query = em.createQuery("select e from Municipio e where e.sigla = :sigla");
            query.setParameter("sigla", sigla);
            result = query.getResultList();
            em.getTransaction().commit();
            em.close();

            return result;
        }
}
