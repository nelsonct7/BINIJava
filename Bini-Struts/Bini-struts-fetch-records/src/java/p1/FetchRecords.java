/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author user
 */
import java.sql.*;
import java.util.ArrayList;  
public class FetchRecords {
    ArrayList<User> list=new ArrayList<User>();  
  
public ArrayList<User> getList() {  
    return list;  
}  
public void setList(ArrayList<User> list) {  
    this.list = list;  
}  
public String execute(){  
 try{  
  Class.forName("oracle.jdbc.driver.OracleDriver");  
  Connection con=DriverManager.getConnection(  
    "jdbc:oracle:thin:@localhost:1521:xe","bini","bini");  
              
  PreparedStatement ps=con.prepareStatement("select * from user3333");  
  ResultSet rs=ps.executeQuery();  
  
  while(rs.next()){  
   User user=new User();  
   user.setId(rs.getInt(1));  
   user.setName(rs.getString(2));  
   user.setPassword(rs.getString(3));  
   user.setEmail(rs.getString(4));  
   list.add(user);  
  }  
  
  con.close();  
 }catch(Exception e){e.printStackTrace();}  
          
 return "success";  
}  
}
