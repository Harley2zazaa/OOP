/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10;

/**
 *
 * @author USER
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author USER
 */
public class CustomerPlus {
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;
    
    public CustomerPlus(){
        this("","");
    }
    
    public CustomerPlus(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
        this.numOfAccount = 0;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public Account getAccount(int index){
        return this.acct[index];
    }
    
    public void addAccount(Account acct){
        this.acct[this.numOfAccount] = acct;
        this.numOfAccount += 1;
    }
    
    public int getNumOfAccount(){
        return this.numOfAccount;
    }
    @Override
    public String toString(){
        if (this.getNumOfAccount() > 0){
            return this.getFirstName() +" "+ this.getLastName() +" has "+ this.getNumOfAccount() +" accounts.";
        }else{ return this.getFirstName()+" "+this.getLastName()+ " don't have account.";}
    }
}
