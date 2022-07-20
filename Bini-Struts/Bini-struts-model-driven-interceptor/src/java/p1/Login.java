/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author user
 */
//import com.opensymphony.xwork2.ModelDriven;  
  import com.opensymphony.xwork2.ModelDriven; 
public class Login implements ModelDriven<User>{  
private User user;  
  
public User getUser() {  
    return user;  
}  
  
public void setUser(User user) {  
    this.user = user;  
}  
public User getModel(){  
    user=new User();  
    return user;  
}  
public String execute(){  
if(user.getPassword().equals("admin")){  
    return "success";  
}  
else{  
    return "error";  
}  
}
}
  