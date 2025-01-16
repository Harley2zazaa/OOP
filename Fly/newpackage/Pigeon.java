/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fly.newpackage;

/**
 *
 * @author USER
 */
public class Pigeon extends Bird{
    private static int numberOfPigeon;
    
    public Pigeon(){
        this(0.0,0.0,0.0);
    }
    
    public Pigeon(double wingSize,double weight,double height){
        super(wingSize,weight,height);
        this.numberOfPigeon += 1;
    }
    
    public void eat(String food){
        if (food == "worm"){
            super.setWeight(super.getWeight()+0.5);
        }
        else if(food == "seed"){
            super.setWeight(super.getWeight()+0.2);
        }
        else{
            System.out.println("Pigeon can eat only worm and seed.");
        }
    }
    
    @Override
    public void fly(){
        if (super.getWeight()>= 5){
            super.setWeight(super.getWeight()-0.25);
            System.out.println("Fly Fly");
        }
        else{
            System.out.println("I’m hungry.");
        }
    }
    
    @Override
    public void takeOff(){
        if (super.getWeight()>= 5){
            super.setWeight(super.getWeight()-0.5);
            System.out.println("Take Off");
        }
        else{
            System.out.println("I’m hungry.");
        }
    }
    
    @Override
    public void landing(){
        if (super.getWeight()>= 5){
            super.setWeight(super.getWeight()-0.5);
            System.out.println("Landing");
        }
        else{
            System.out.println("I’m hungry.");
        }
    }
    
    @Override
    public String toString(){
        return "Pigeon "+super.getWeight()+" kg and "+super.getHeight()+" cm. There are "+Pigeon.numberOfPigeon+
                " pigeons.";
    }
}

//Pigeon 15.0 kg and 20.0 cm. There are 1 pigeons.
//Pigeon 15.0 kg and 20.0 cm. There are 1 pigeons.
//Pigeon 15.0 kg and 20.0 cm. There are 1 pigeons.