/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    
    public boolean equals(Employee e){
        if(this.name.equals(e.name)){return true;}
        else{return  false;}
    }
    
    @Override
    public String toString(){
        Wallet temp = getWallet();
        return "My name is "+name+". \nI have "+energy+" energy left.\nI have a balance of "+temp.getBalance()+" baht.";
    }
    
    public boolean buyFood(Seller s){
        Food sell = s.sell(this);
        if(sell == null){return false;}
        else{
            eat(sell);
            return true;
        }
    }
    
    public void eat(Food f){
        this.setEnergy(this.getEnergy()+f.getEnergy());
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Wallet getWallet(){
        return wallet;
    }
    
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    
    public int getEnergy(){
        return energy;
    }
    
    public void setEnergy(int energy){
        this.energy = energy;
    }
    
    public static String getNationality(){
        return nationality;
    }
    
    public static void setNationality(String nationality){
        Employee.nationality = nationality;
    }
} 
