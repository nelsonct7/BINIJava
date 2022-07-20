package p1;

import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;  
import org.apache.struts2.interceptor.SessionAware;  
  
/*
 The SessionMap is specifically designed for the purposes
 * if you want to have access to the servlet session attributes.
 * So, the user is able to keep a synchronized collection of objects
 * in session and use it instead of HttpSession directly. 
 * This object is automatically injected by the servletConfig interceptor 
 * which is a part of the defaultStack if you implement SessionAware interface
 * in the action class. As soon as you don't need to work with 
 * servlet session directly and don't have access to it you can 
 * at least invalidate a session that finalizes the collection of objects in it. 
 * A new session map required to action context if you want to continue to use a session.
 */

public class Login implements SessionAware{  
private String name,password;  

private SessionMap<String,Object> sessionMap; //SessionMap is managed by struts2, 
//if you use Map then you have to manage at your end and its really difficult

    //getters and setters  
    public String getName() {
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

    public SessionMap<String, Object> getSessionMap() {
        return sessionMap;
    }

    public void setSessionMap(SessionMap<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

  
@Override  
public void setSession(Map<String, Object> map) {  
    sessionMap=(SessionMap)map;  
}  
  
public String execute(){  
if(password.equals("admin")){  
    sessionMap.put("login","true");  
    sessionMap.put("name",name);  
      
    return "success";  
}  
else{  
    return "login";  
}  
}  
  
public String logout(){  
    if(sessionMap!=null){  
        sessionMap.invalidate();  
    }  
    return "success";  
}  
  
}  