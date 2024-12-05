/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.*;
public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money =  sc.nextDouble();
        double result;
        if (money > 50000){
            result = money*0.1;
        } else{
            result = money*0.05;
        }
        System.out.println(result);
    }
    
}
