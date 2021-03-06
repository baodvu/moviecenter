
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bao
 */
@ManagedBean
@SessionScoped
public class User implements Serializable{
    private String username;
    private String password;
    
    @ManagedProperty("#{userManager}")
    private UserManager userManager;
    
    /**
     * Creates a new instance of User
     */
    public User() {
        System.out.println("Making user");
    }
    
    public String getUsername() { 
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getName() {
        return userManager.find(username).getName();
    }
    
    public void setUsername(String u) {
        System.out.println("Setting name to " + u);
        username = u;
    }
    
    public void setPassword(String p) {
        System.out.println("Setting password to " + p);
        password = p;
    }
    
    public String login() {
        UserData data = userManager.find(username);
        if (data == null || !data.checkLogin(password)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Username or Password incorrect"));
            return null;
        }
        System.out.println("Login Success");
        return "home";
    }
    
    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "index";
    }
    
    public void setUserManager(UserManager um) {
        userManager = um;
    }
}
