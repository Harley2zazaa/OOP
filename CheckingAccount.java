/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class CheckingAccount extends Account{
    private double credit;
    
    public CheckingAccount(){
        this(0.0,"",0.0);
    }
    
    public CheckingAccount(double balance, String name,double credit) {
        super(balance, name);
        this.setCredit(credit);
    }
    
    public void setCredit(double credit){
        this.credit = credit;
    }
    
    public double getCredit(){
        return this.credit;
    }
    
    @Override
    public void withdraw(double a){
        double temp = this.getBalance();
        double tempcre = this.getCredit();
        if (temp - a >= 0){
            this.setBalance(temp-a);
            System.out.println(a+" baht is withdrawn from "+this.getName()+" and your credit balance is "+this.getCredit()+".");
        }
        else if((temp-a)+tempcre >= 0){
            double diff = temp-a;
            this.setBalance(0);
            this.setCredit(this.getCredit()-diff);
            System.out.println(a+" baht is withdrawn from "+this.getName()+" and your credit balance is "+this.getCredit()+".");
        }
        else{
            System.out.println("Not enough money!");
        }
    }

    public void withdraw(String a){
        double con = Double.parseDouble(a); // __type__.prase__type__(Standard)
        double temp = this.getBalance();
        double tempcre = this.getCredit();
        if (temp - con >= 0){
            this.setBalance(temp-con);
            System.out.println(a+" baht is withdrawn from "+this.getName()+" and your credit balance is "+this.getCredit()+".");
        }
        else if((temp-con)+tempcre >= 0){
            double diff = temp-con;
            this.setBalance(0);
            this.setCredit(this.getCredit()-diff);
            System.out.println(a+" baht is withdrawn from "+this.getName()+" and your credit balance is "+this.getCredit()+".");
        }
        else{
            System.out.println("Not enough money!");
        }
    }
    
    @Override
    public String toString(){
        return "The "+this.getName()+" account has "+this.getBalance()+" baht and "+this.getCredit()+" credits.";
    }
}

