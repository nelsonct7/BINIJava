package com.soften.bini;

import com.opensymphony.xwork2.Preparable;

public class Login implements Preparable{
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

@Override
public void prepare() throws Exception {
	System.out.println("preparation logic");
}
public String execute(){
	System.out.println("actual business logic");
if(password.equals("admin")){
	return "success";
}
else{
	return "error";
}
}



}
