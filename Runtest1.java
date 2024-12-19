/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Runtest1 {
        public static void main(String[] args) {
        Fraction_DLC f1 = new Fraction_DLC();
        f1.topN = 1;
        f1.btmN = 3;
        Fraction_DLC f2 = new Fraction_DLC();
        f2.topN = 4;
        f2.btmN = 16;
        Fraction_DLC f3 = new Fraction_DLC();
        f3.topN = 5;
        f3.btmN = 15;
        System.out.println(f1.toFloat());
        System.out.println(f2.toFloat());
        System.out.println(f3.toFloat());
        
        System.out.println(f1.myEquals(f2));
        System.out.println(f1.myEquals(f3));
        
        System.out.println(f2.toFraction());
        f2.LowestTermFrac();
        System.out.println(f2.toFraction());
    }
}
