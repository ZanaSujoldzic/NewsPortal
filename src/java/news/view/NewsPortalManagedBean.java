package news.view;

import news.model.business.NewsPortalFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import news.model.NewsPortal;

@Named
@SessionScoped
public class NewsPortalManagedBean implements Serializable {

    @Inject
    private NewsPortalFacadeLocal newsPortalFacadeLocal;
    private NewsPortal newsPortal = new NewsPortal();
    
    private String title;
    private String body;
    private String author;

    public NewsPortalManagedBean() {
    }

    public NewsPortal getNewsPortal() {
        return newsPortal;
    }

    public void setNewsPortal(NewsPortal newsPortal) {
        this.newsPortal = newsPortal;
    }

    public NewsPortalFacadeLocal getNewsPortalFacadeLocal() {
        return newsPortalFacadeLocal;
    }

    public void setNewsPortalFacadeLocal(NewsPortalFacadeLocal newsPortalFacadeLocal) {
        this.newsPortalFacadeLocal = newsPortalFacadeLocal;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    

    public String add(NewsPortal newsPortal) {
        this.newsPortalFacadeLocal.create(this.newsPortal);
        this.newsPortal = new NewsPortal();

        return "indexAdmin";
    }

    public void delete(NewsPortal newsPortal) {
        this.newsPortalFacadeLocal.remove(newsPortal);
    }

    public String edit(NewsPortal newsPortal) {
        this.newsPortal = newsPortal;

        return "editNews";
    }

    public String edit() {
        this.newsPortalFacadeLocal.edit(this.newsPortal);
        this.newsPortal = new NewsPortal();

        return "indexAdmin";
    }

    public List<NewsPortal> getAllNews() {
        return newsPortalFacadeLocal.getAllNews();
    }

}
