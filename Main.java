/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args){
    
    Menu menu=new Menu();
    int A=menu.getAppitizerSize();
    int b=menu.getBurgersSize();
    int P=menu.getPastaSize();
    int D=menu.getdessertSize();
    
    System.out.println("APPITIZERS: "+A);
    System.out.println("APPITIZERS "+menu.getAllappitizers());
    System.out.println("BURGERS: "+b);
    System.out.println("BURGERS "+menu.getAllburgers());
    System.out.println("pasta & pizza: "+P);
    System.out.println("Pasta & pizza "+menu.getAllpasta_pizza());
    System.out.println("desserts: "+D);
    System.out.println("Desserts "+menu.getAlldesserts());
    }
}
