
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Menu {

    public Menu() {
        populateMenu();
    }
    private ArrayList<Meal> appitizers=new ArrayList<Meal>();
    private ArrayList<Meal> burgers=new ArrayList<Meal>();
    private ArrayList<Meal> pasta_pizza=new ArrayList<Meal>();
    private ArrayList<Meal> desserts=new ArrayList<Meal>();
    
    public void populateMenu(){
    appitizers.add(new Meal("chicken wings",60,"appitizers"));
    appitizers.add(new Meal("garlic bread",30,"appitizers"));
    appitizers.add(new Meal("cizar salad",40,"appitizers"));
    
    burgers.add(new Meal("millionaire",80,"burger"));
    burgers.add(new Meal("cowboy",80,"burger","two pieces"));
    burgers.add(new Meal("original fil",100,"burger"));
    burgers.add(new Meal("mexican fil",90,"burger"));
    
    pasta_pizza.add(new Meal("pasta alfredo",80,"pasta"));
    pasta_pizza.add(new Meal("bebbroni pizza",100,"pizza"));
    pasta_pizza.add(new Meal("super supreme",90,"pizza"));
    
    desserts.add(new Meal("apple pie",30,"dessert"));
    desserts.add(new Meal("waffle",40,"dessert"));
    desserts.add(new Meal("crepe",50,"dessert"));
    
    
    
    }
    public int getAppitizerSize(){
    return appitizers.size();
    }
    public String getAllappitizers(){
    String aMenu="";
    aMenu+="APPITIZERS :\n";
    for(int i=0;i<appitizers.size();i++){
    Meal a=appitizers.get(i);
    aMenu+="A"+(i+1)+" "+a.toString()+"\n";
    }
    return aMenu;
    }
    public int getBurgersSize(){
    return burgers.size();
    }
    public String getAllburgers(){
    String bMenu="";
    bMenu+="BURGERS :\n";
    for(int i=0;i<burgers.size();i++){
    Meal b=burgers.get(i);
    bMenu+="B"+(i+1)+" "+b.toString()+"\n";
    }
    return bMenu;
    }
    public int getPastaSize(){
    return pasta_pizza.size();
    }
    public String getAllpasta_pizza(){
    String ppMenu="";
    ppMenu+="pasta&pizza :\n";
    for(int i=0;i<pasta_pizza.size();i++){
    Meal pp=pasta_pizza.get(i);
    ppMenu+="PP"+(i+1)+" "+pp.toString()+"\n";
    }
    return ppMenu;
    }
     public int getdessertSize(){
    return desserts.size();
    }
    public String getAlldesserts(){
    String dMenu="";
    dMenu+="desserts :\n";
    for(int i=0;i<desserts.size();i++){
    Meal d=desserts.get(i);
    dMenu+="D"+(i+1)+" "+d.toString()+"\n";
    }
    return dMenu;
    }
}
