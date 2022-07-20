/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author user
 */
import com.opensymphony.xwork2.ActionInvocation;  
import com.opensymphony.xwork2.interceptor.Interceptor;  
import com.opensymphony.xwork2.util.ValueStack;  
public class MyInterceptor implements Interceptor{  
  
    public void init() {}  
    public String intercept(ActionInvocation ai) throws Exception {  
        ValueStack stack=ai.getStack();  
        String s=stack.findString("name");  
          
        stack.set("name",s.toUpperCase());  
        return ai.invoke();  
    }  
    public void destroy() {}  
}  
