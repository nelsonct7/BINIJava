/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author user
 */
import com.opensymphony.xwork2.ActionSupport;  
public class Register extends ActionSupport{  
private String name,password,email;  
  
//setters and getters  
  
public String getName(){  
    return name;  
}

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  
public String execute(){  
    return "success";  
}  
}  