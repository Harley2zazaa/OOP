/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Fraction {
    public int topN,btmN;

    public String toFraction() {
        return topN+"/"+btmN ;
    }
    
    public String toFloat() {
        double result = (double)topN/btmN; //casting convert type data
        return ""+result;
    }
    
    public void addFraction(Fraction f){ //this usefor refer this obj.
        if (this.btmN == f.btmN){
            this.btmN = this.btmN + f.btmN;
        }else{
            this.topN = this.topN* f.btmN+f.topN*this.btmN;
            this.btmN = this.btmN* f.btmN;
        }
    } 
}
