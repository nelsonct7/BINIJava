/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author user
 */
import javax.servlet.ServletContext;  
import org.apache.struts2.ServletActionContext;  
  
public class SecondAction{  
    public String execute(){  
        ServletContext ctx=ServletActionContext.getServletContext();  
        String obj=(String)ctx.getAttribute("dummyobject");  
        if(obj!=null){  
            return "success";  
        }  
        else{  
            return "error";  
        }  
    }  
}  