/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        CustomerPlusPlus plus = new CustomerPlusPlus("Somsri", "Boonjing");
        CustomerPlus cust = new CustomerPlus("Somsri", "Boonjing"); 
        Account acct1 = new Account(5000, "Somsri01"); 
        Account acct2 = new Account(3000, "Somsri02"); 
        cust.addAccount(acct1); 
        cust.addAccount(acct2); 
        cust.getAccount(0).withdraw(3000); 
        cust.getAccount(1).deposit(3000);
        ///show//
        System.out.println("------------");
        cust.getAccount(0).showAccount();
        cust.getAccount(1).showAccount();
        System.out.println(cust);
        System.out.println("------------");
        ///loop//
        for (int i = 0 ; i < cust.getNumOfAccount();i++){
            cust.getAccount(i).showAccount();
        }
    }
}
