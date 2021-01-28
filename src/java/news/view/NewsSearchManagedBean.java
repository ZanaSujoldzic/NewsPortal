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
public class NewsSearchManagedBean implements Serializable {

    @Inject
    private NewsPortalFacadeLocal newsPortalFacadeLocal;

    private NewsPortal newsPortal;
    private String title;
    private String body;


    public NewsSearchManagedBean() {
    }

    public NewsPortal getNewsPortal() {
        return newsPortal;
    }

    public void setNewsPortal(NewsPortal newsPortal) {
        this.newsPortal = newsPortal;
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

    public String search() {

        NewsPortal news = newsPortalFacadeLocal.search(title, body);
        
        if(news.getTitle().equals(title) && news.getBody().equals(body)){
            return "index";
        }else{
            
            return "search";
        }
        
    }

    public String searchByArticle(){
        this.newsPortalFacadeLocal.searchByArticle(body);
        return "index";
    }
}
