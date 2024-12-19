/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Student {
    public String name;
    public double mScore,fScore;

    public void showGrade() {
        double s;
        s = (mScore*0.4)+(fScore*0.4)+ 20;
        if (s < 50){
            System.out.print("Your grade is F.");
        }else if(s < 60 && s >= 50 ){
            System.out.print("Your grade is D.");
        }else if(s < 70 && s >= 60 ){
            System.out.print("Your grade is C.");
        }else if(s < 80 && s >= 70 ){
            System.out.print("Your grade is B.");
        }else{
            System.out.println("Your grade is A.");
        }
    }
}
