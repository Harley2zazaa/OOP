/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class FootballPlayer extends Player{
    private int playerNumber;
    private String position;
    
    public void setPlayerNumber(int n){
        playerNumber = n;
    }
    
    public void setPosition(String p){
        position = p;
    }
    
    public int getPlayerNumber(){
        return playerNumber;
    }
    
    public String getPosition(){
        return position;
    }
    
    public boolean isSamePosition(FootballPlayer p){
        if (this.position.equals(p.position) && this.isSameTeam(p)){return true;}
        else{return false;}
    }
}