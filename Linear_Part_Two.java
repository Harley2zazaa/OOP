/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.*;
public class Linear_Part_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int longer = sc.nextInt();
        int count = 0 ;
        for (int i = 1; i <= longer; i++){
            if (count < 4){
                System.out.print("|");
                count += 1 ;
            }else{
                System.out.println("|");
                count = 0 ;
            }
        }System.out.println();
    }
}