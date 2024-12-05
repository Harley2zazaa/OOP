/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.*;
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter money: ");
        double money = sc.nextDouble();
        sc.nextLine(); //clear Line
        System.out.print("Enter Type: ");
        String type = sc.nextLine();
        double result = 0;
        switch (type){
                case "A" :
                    result = money + (money*0.015);
                    break;
                case "B" : 
                    result = money + (money*0.02);
                    break;
                case "C":
                    result = money + (money*0.015);
                    break;
                case "X":
                    result = money + (money*0.05);
                    break;
                default:
                    System.out.println("Wrong Type");
            }
            System.out.println("Total money : " + result);
        }    
    }
