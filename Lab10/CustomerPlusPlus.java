/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10;

/**
 *
 * @author USER
 */
import java.util.*;
public class CustomerPlusPlus {
    private String firstName;
    private String lastName;
    private ArrayList acct;

    public CustomerPlusPlus() {
        this("","");
    }
    
    public CustomerPlusPlus(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
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
    
    public Object getAccount(int index){
        return this.acct.get(index);
    }
    
    public void addAccount(Account acct){
        this.acct.add(acct);
    }
    
    public int getNumOfAccount(){
        return this.acct.size();
    }
    @Override
    public String toString(){
        if (this.getNumOfAccount() > 0){
            return this.getFirstName() +" "+ this.getLastName() +" has "+ this.getNumOfAccount() +" accounts.";
        }else{ return this.getFirstName()+" "+this.getLastName()+ " don't have account.";}
    }
} 
