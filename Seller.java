/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Seller extends Employee{
    
    public Food sell(Employee e){
        Food apple = new Food();
        Wallet x = e.getWallet();
        double y = x.getBalance(); // money e
        double z = apple.getPrice();
        if(y >= z){
            Wallet temp = this.getWallet(); //get data wallet
            double temp2 = temp.getBalance();
            temp.setBalance(temp2+z); // 
            this.setWallet(temp); // set money seller
            x.setBalance(y-z);
            return apple;
        }else{
            System.out.println("Your money is not enough.");
            return null;
        }
    }
}
