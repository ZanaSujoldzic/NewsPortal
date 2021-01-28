
package news.model.business;

import java.util.Collections;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import news.model.NewsPortal;

@Stateless
public class NewsPortalFacade extends AbstractFacade<NewsPortal> implements NewsPortalFacadeLocal {

    @PersistenceContext(unitName = "NewsApplicationPU")
    private EntityManager entityManager;

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    public NewsPortalFacade() {
        super(NewsPortal.class);
    }
     
    @Override
    public NewsPortal search(String title, String body) {
         try{
            return (NewsPortal) entityManager.createNamedQuery("NewsPortal.findByWords")
                    .setParameter("title", title)
                    .setParameter("body", body)
                    .getResultList();
        }catch(Exception exception){
            exception.printStackTrace();
            return null;
        }
       
    }

    @Override
    public List<NewsPortal> getAllNews() {
         try {
            Query query = entityManager.createNamedQuery("NewsPortal.findAll");
            return query.getResultList();
        } catch (Exception exception) {
            exception.getMessage();
            return Collections.emptyList();
        }    }

    @Override
    public NewsPortal searchByArticle(String body) {
        return (NewsPortal) entityManager.createNamedQuery("NewsPortal.findByBody").getSingleResult();
    }
    
}
