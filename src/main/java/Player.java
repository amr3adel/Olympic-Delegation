/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amrad
 */
public class Player {
    private String name;
    private String address;

    public Player(String name, String address) {
	 this.name=name;
	 this.address=address;
 }
    public String getAddress() {
	return address;
}
    public void setAddress(String s) {
	address=s;
}
    public String getName() {
	return name;
}
    public void setName(String n) {
	name=n;
}
}