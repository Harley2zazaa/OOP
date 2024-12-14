/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.*;
public class Your_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Odd = 0;
        int Even = 0;
        while (true){
            System.out.print("Enter Number : ");
            int number = sc.nextInt();
            if (number == -1){
                System.out.println("End Process !");
                break;
            }else{
                if(number%2 == 0){
                    Odd += 1;
                }else{
                    Even += 1;
                }
            }
        }
        System.out.print("Odd Number = "+Odd);
        System.out.print(" and ");
        System.out.print("Even Number = "+Even+" ");
    }
}
