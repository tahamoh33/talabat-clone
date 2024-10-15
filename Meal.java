/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Meal {

    public Meal(String meal_name, int meal_price, String description, String size) {
        this.meal_name = meal_name;
        this.meal_price = meal_price;
        this.description = description;
        this.size = size;
    }

    public Meal(String meal_name, int meal_price, String description) {
        this.meal_name = meal_name;
        this.meal_price = meal_price;
        this.description = description;
    }
public String meal_name;
public int meal_price;
public String description;
public String size;

public String toString (){
return meal_name +"\t"+(meal_price);
}
}
