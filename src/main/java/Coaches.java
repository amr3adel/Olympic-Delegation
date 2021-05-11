/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * coach classes in olympic delegation
 * @author amrad
 */
public class Coaches {
    private String coachname;
    private String coachaddress;
	
    public Coaches(String coachname, String coachaddress) {
		 this.coachname=coachname;
		 this.coachaddress=coachaddress;
	}
    public String getName() {
		return coachname;
	}
    public void setName(String n) {
		coachname=n;
	}
    public String getAddress() {
		return coachaddress;
	}
    public void setAddress(String s) {
		coachaddress=s;

	}
}
