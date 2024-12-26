/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Player {
    private String name,team;
    
    public void setName(String n){
        name = n;
    }
    
    public void setTeam(String t){
        team = t;
    }
    
    public String getName(){
        return name;
    }
    
    public String getTeam(){
        return team;
    }
    
    public boolean isSameTeam(Player p){ // == compare Reference Variable in address
        if (this.team.equals(p.team)){return true;}//.equal compare value inside obj.
        else{return false;} //simplify if else
    }
}
