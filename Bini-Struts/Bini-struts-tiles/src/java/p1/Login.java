/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author user
 */
public class Login {
    private String name,password;  
  
//getters and setters  
  
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
  
public String execute(){  
if(password.equals("admin")){  
    return "success";  
}  
else{  
    return "error";  
}  
}  
}  

