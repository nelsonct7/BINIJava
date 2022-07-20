/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author user
 */import com.opensymphony.xwork2.ActionSupport;  
public class Register extends ActionSupport{  
private String username,userpass;  
  
public String getUsername() {  
    return username;  
}  
  
public void setUsername(String username) {  
    this.username = username;  
}  
  
public String getUserpass() {  
    return userpass;  
}  
  
public void setUserpass(String userpass) {  
    this.userpass = userpass;  
}  
  
public String execute(){  
    return "success";  
}  
  
}  
