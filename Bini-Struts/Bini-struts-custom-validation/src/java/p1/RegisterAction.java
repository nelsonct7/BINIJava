/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author user
 */


import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
private String name,password;

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


public void validate() {
		if(name.length()<1)
			addFieldError("name","Name can't be blank");
		if(password.length()<6)
			addFieldError("password","Password must be greater than 5");
	
    /*
	if(name.trim().length()<1 || password.trim().length()<1){
		addActionError("Fields can't be blank");
	}*/
}

public String execute(){
	//perform business logic here
	return "success";
}

   
}
