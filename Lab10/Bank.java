/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10;

/**
 *
 * @author USER
 */
public class Bank extends Account{
    private Account acct[];
    private int numAcct;

    public Bank() {
        acct = new Account[10];
        this.numAcct = 0;
        super(0, null);
    }
    
    public void addAccount(Account ac){
        if (numAcct < 10){acct[numAcct] = ac;}
        this.numAcct += 1;
    }
    
    public Account getAccount(int index){
        return acct[index];
    }
    
    public int getNumAccount(){
        return numAcct;
    }
}
