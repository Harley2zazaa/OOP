/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class SeniorProgrammer extends Programmer{
    @Override
    public void coding(String str){
        int stamina = this.getEnergy();
        int nah = this.getHappiness();
        if(stamina>=10){System.out.println("I'm coding about "+str);}
        else{System.out.println("ZzZzZz");}
        this.setEnergy(stamina-5);
        this.setHappiness(nah-5);
    }
    
    public void coding(String str,int num){
        for (int i = 1 ; i<= num;i++){
            int stamina = this.getEnergy();
            int nah = this.getHappiness();
            if(stamina>=10){System.out.println("I'm coding about "+str);}
            else{System.out.println("ZzZzZz");}
            this.setEnergy(stamina-5);
            this.setHappiness(nah-5);
        }
    }
    
    public void compliment(Programmer p){
        int temp = p.getHappiness();
        System.out.println(p.getName()+" in a good mood");
        p.setHappiness(temp+20);
    }
    
    public void blame(Programmer p){
        int temp = p.getHappiness();
        System.out.println(p.getName()+" in a bad mood");
        p.setHappiness(temp-20);
    }
}
