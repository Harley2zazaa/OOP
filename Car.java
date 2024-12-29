/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Car extends Vehicle{
    private String typeEngine;
    
    public void setTypeEngine(String t){
        typeEngine = t;
    }
    
    public String getTypeEngine(){
        return typeEngine;
    }
    
    public void setCarInfo(int s,String t,String y){
        setFuel(s);
        setTopSpeed(t);
        setTypeEngine(y);
    }
    
    public void move(){
        int now = getFuel();
        if (now >= 50){setFuel(now-50);System.out.println("Move.");
        }else{System.out.println("Please add fuel.");}
    }
    
    public void showCarInfo(){
        System.out.println("Car engine is "+typeEngine+".");
        showInfo();
    }
}
