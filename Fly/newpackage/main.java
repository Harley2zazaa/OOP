/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fly.newpackage;

/**
 *
 * @author USER
 */
public class main {
    public static void main(String[] args) { 
        Pigeon p1 = new Pigeon(10,15,20); 
        System.out.println(p1); 
        p1.takeOff(); 
        System.out.println(p1); 
        p1.fly(); 
        System.out.println(p1); 
        p1.landing(); 
        System.out.println(p1); 
        p1.eat("seed"); 
        System.out.println(p1); 
        Pigeon p3 = new Pigeon(); 
        System.out.println(p3); 
  }
}
