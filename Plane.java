/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Plane extends Vehicle{
    public void showPlaneInfo(){
        System.out.print("Plane detail is, ");
        showInfo();
    }
    
    public void setPlaneInfo(int s,String t){
        setFuel(s);
        setTopSpeed(t);
    }
    
    public void fly(){
        int now = getFuel();
        if (now >= 200){setFuel(now-200);System.out.println("Fly.");
        }else{System.out.println("Please add fuel.");}
    }
}
