/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Customer {

    public Customer(String username, String password, String address, int phNo) {
        this.username = username;
        this.password = password;
        this.address = address;
        this.phNo = phNo;
    }
    protected String username;
    protected String password;
    protected String address;
    protected int  phNo;
    public void register(){};
    public void show_resturants(){};
    public void show_meals(){};
    public void make_order(){};
    public void show_order(){};
}
