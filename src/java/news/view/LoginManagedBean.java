
package news.view;

import news.model.business.LoginSessionBeanLocal;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import news.model.Privilege;
import news.model.User;

@Named
@SessionScoped
public class LoginManagedBean implements Serializable {

    @Inject
    private LoginSessionBeanLocal loginSessionBeanLocal;
    
    private boolean loggedIn;
    private User user;

    private String username;
    private String password;
    private String message = "";

    public LoginManagedBean() {
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean isLoggedIn) {
        this.loggedIn = isLoggedIn;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String login() {
        User user = loginSessionBeanLocal.login(username, password);
        loggedIn = true;
        Privilege privilege = user.getIdPrivilege();
        if (user == null) {
            message = "User doesn't exist";
            return "login";
        }
        if (privilege.getName().equalsIgnoreCase("admin")) {
            return "adminHome";
        } else {
            return "login";
        }
    }

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "login";

    }
}