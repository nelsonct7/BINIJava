/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hql;

/**
 *
 * @author user
 */
import java.util.Iterator;
import java.util.List;
import org.hibernate.*;
import org.hibernate.cfg.*;
import p1.Items;
public class Main {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
         Transaction tx=null;
         Session session=null;
         SessionFactory factory=null;
         Query qry =null;
try
{
     factory = cfg.buildSessionFactory();
      session = factory.openSession();
     tx=session.beginTransaction();
     
     // item table
    Items ite=new Items();
    ite.setItemId(10);
    ite.setItemName("stationery");
    ite.setItemPrice(90.90);
    session.save(ite);
   // tx.commit();
   
  
     qry = session.createQuery("insert into Products(productId,proName,proPrice)select i.itemId,i.itemName,i.itemPrice from Items i where i.itemId= ?");
      System.out.println("insert into Products(productId,proName,proPrice)select i.itemId,i.itemName,i.itemPrice from Items i where i.itemId= ?");
        qry.setParameter(0, 10);
        int res = qry.executeUpdate();

        System.out.println("Insert Command successfully executed....");
        System.out.println("Numer of records effected...," + res);
        
        Main.selectProduct(session);
     
  
     //---------------------------update------------------------------------------------------ 
     //  qry = session.createQuery("update Products p set p.proName=?, p.price=? where p.productId=10");
      
     
    qry = session.createQuery("update Products p set p.proName=? proPrice=? where p.productId=10");
       qry.setParameter(0, "colgate");
        qry.setParameter(1, 234.56);
      int resed = qry.executeUpdate();
       System.out.println("Update Command successfully executed....");
        System.out.println("Numer of records effected due to update query   " + resed);
     Main.selectProduct(session);
     
     
     
     
      
       
       //-----------------------------------Delete-------------------------------------------------------------
      //   qry = session.createQuery("delete from Products p where p.productId=?");
     //   qry.setParameter(0, 10);  // position parameters . ie. only single ? in query, that is in 0 position, 10 is the value
        
      

}
catch(Exception e)
{
    //tx.rollback();
    if (tx != null) {
    tx.rollback();
    }
    System.out.println("exception..."+e);
}
 finally{
       tx.commit();   
          }     
     session.close();
        factory.close();
    }
    public static void selectProduct(Session session)
    {
        Query qry = session.createQuery("select new list(p.productId,p.proName,p.proPrice) from Products p");
        List l =qry.list();
        System.out.println("Total Number Of Records : "+l.size());
        Iterator it = l.iterator();
        while(it.hasNext())
        {
           List i= (List)it.next();
            System.out.println("Product id : "+i.get(0));
            System.out.println("Product Name : "+i.get(1));
            System.out.println("Price   :   "+i.get(2));
            System.out.println("---------------------------");
         }
    }
        }
