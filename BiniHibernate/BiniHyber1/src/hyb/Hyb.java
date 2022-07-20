/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hyb;

//import javax.security.auth.login.Configuration;
//import javax.transaction.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration; 
/**
 *
 * @author user
 */
public class Hyb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //creating configuration object  
    Configuration cfg=new Configuration();  
    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
      
    //creating seession factory object  
    SessionFactory factory=cfg.buildSessionFactory();  
      
    //creating session object  
    Session session=factory.openSession();  
      
    //creating transaction object  
    Transaction t=session.beginTransaction();  
          
    Employee e1=new Employee();  
    e1.setId(118);  
    e1.setFirstName("rishi");  
    e1.setLastName("mc");  
      
    session.persist(e1);//persisting the object  ==live
      
    t.commit();//transaction is commited  
    session.close();  
      
    System.out.println("successfully saved");  
      
    }
}
