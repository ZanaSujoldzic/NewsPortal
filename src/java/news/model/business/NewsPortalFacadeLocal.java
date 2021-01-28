package news.model.business;

import java.util.List;
import javax.ejb.Local;
import news.model.NewsPortal;

@Local
public interface NewsPortalFacadeLocal {
    
    public NewsPortal searchByArticle(String body);
    
    public NewsPortal search(String title, String body);

    public List<NewsPortal> getAllNews();
    
    void create(NewsPortal newsPortal);

    void edit(NewsPortal newsPortal);

    void remove(NewsPortal newsPortal);

    NewsPortal find(Object id);

    List<NewsPortal> findAll();

    List<NewsPortal> findRange(int[] range);

    int count();
    
}
