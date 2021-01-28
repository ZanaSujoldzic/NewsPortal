
package news.model.business;

import javax.ejb.Local;
import news.model.User;

@Local
public interface LoginSessionBeanLocal {
   public User login(String username, String password);
    
}
