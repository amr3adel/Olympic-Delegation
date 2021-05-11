/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * describing delegation classes that will happen in an Olympic event
 * @author amrad
 */
public class Delegation {
private String country;


public static void main(String[] args) {
	Player first= new Player("treka", "egypt");            
	Coaches first1=new Coaches("badry","ahly");                 
	System.out.println(first1 + "is the coach of "+ first);         
	
}

public String getCountry() {
	return country;
}
public void setCountry(String z) {
	country=z;
}
}