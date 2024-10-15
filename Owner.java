/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Owner {

    public Owner(String resturant_name, String password, String username) {
        this.resturant_name = resturant_name;
        this.password = password;
        this.username = username;
    }
    protected String resturant_name;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    protected String username;
    public void register(){};
    public void add_meal(){};
    public void remove_meal(){};
    
}
