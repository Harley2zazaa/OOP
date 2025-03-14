/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fly.newpackage;

/**
 *
 * @author USER
 */
public abstract class Vehicle implements Dieselable{
    protected double fuel;
    
    public Vehicle(){
        this(0.0);
    }
    
    public Vehicle(double fuel){
        this.setFuel(fuel);
    }
    
    public void setFuel(double fuel){
        this.fuel = fuel;
    }
    
    public double getFuel(){
      return this.fuel;
    }
    
    public void addFuel(double fuel){
        if (fuel > 0){
           this.setFuel(this.getFuel()+fuel);
        }
        else{
            System.out.println("Fuel is empty.");
        }
    }
    
    public abstract void honk();
    
}
