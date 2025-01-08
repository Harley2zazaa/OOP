/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Programmer extends Employee{
    private int happiness ;
    
    public void coding(String str){
        int stamina = this.getEnergy();
        if (stamina >= 30){
            System.out.println("Your code is "+str);
        }else{
            System.out.println("Error Error Error");  
        }
        this.setEnergy(stamina-30);
        this.setHappiness(happiness-30);
    }
    
    public void coding(char str){
        int stamina = this.getEnergy();
        if (stamina >= 30){
            System.out.println("Your code is "+str);
        }else{
            System.out.println("Error Error Error");  
        }
        this.setEnergy(stamina-30);
        this.setHappiness(happiness-30);
    }
    
    public int getHappiness(){
        return happiness;
    }
    
    public void setHappiness(int happiness){
        this.happiness = happiness;
    }
}
