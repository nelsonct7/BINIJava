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
public class RegisterDao {
    public static int save(RegisterAction r){  
int status=0;  
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","bini","bini");  
  
PreparedStatement ps=con.prepareStatement("insert into strutsuser values(?,?,?,?)");  
ps.setString(1,r.getName());  
ps.setString(2,r.getPassword());  
ps.setString(3,r.getEmail());  
ps.setString(4,r.getGender());  

          
status=ps.executeUpdate();  
  
}catch(Exception e){e.printStackTrace();}  
    return status;  
}  
}
