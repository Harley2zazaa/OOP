/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.*;
public class Salary_again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        System.out.print("Enter working days : ");
        int work = sc.nextInt();
        System.out.print("Enter absent days : ");
        int absent = sc.nextInt();
        System.out.print("Enter wight : ");
        double wight  = sc.nextInt();
        double salary = 0;
        double bonus = 0;
        if (age >= 21 && age <= 30){
            salary += (work*300)-(absent*50);
        }else if(age >= 31 && age <= 40){
            salary += (work*500)-(absent*50);
        }else if(age >= 41 && age <= 50){
            salary += (work*1000)-(absent*25);
        }else if(age >= 51 && age <= 60){
            salary += (work*3000);
        }
        if (wight >= 10 && wight <= 60){
            bonus += 5000;
        }else if (wight >= 61 && wight <= 90){
            bonus += 5000 - ((wight-60)*10);
        }
        System.out.println("Hi, "+name);
        System.out.println("Your salary is " + salary + " Bant");
        System.out.println("Your salary and bonus is " + (salary+bonus) + " Bant");
    }
}
