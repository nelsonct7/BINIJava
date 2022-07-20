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
import org.apache.struts2.util.ServletContextAware;  
  
public class FirstAction implements ServletContextAware{  
  
    public void setServletContext(ServletContext ctx) {  
        ctx.setAttribute("dummyobject","hello");  
    }  
      
    public String execute(){  
        return "success";  
    }  
}  