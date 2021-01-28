
package news.model.business;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import news.model.User;

@Stateless
public class LoginSessionBean implements LoginSessionBeanLocal{

    @PersistenceContext(unitName = "NewsApplicationPU")
    private EntityManager entityManager;
            
    @Override
    public User login(String username, String password) {
        try{
            return (User) entityManager.createNamedQuery("User.findByUsernamePassword")
                    .setParameter("username", username)
                    .setParameter("password", password)
                    .getSingleResult();
        }catch(Exception exception){
            exception.printStackTrace();
            return null;
        }
        
    }
    
}
