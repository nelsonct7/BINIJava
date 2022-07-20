/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;
import org.hibernate.Session;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  

/**
 *
 * @author user
 */
public class Userdao {
        public static int register(User u){  
            int i=0;  
            Session session=new Configuration().  
            configure().buildSessionFactory().openSession();  

            Transaction t=session.beginTransaction();  
            t.begin();  

            i=(Integer)session.save(u);  

            t.commit();  
            session.close();  

             return i;  
     }  
}
