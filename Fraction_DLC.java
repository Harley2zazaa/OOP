/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Fraction_DLC {
    public int topN,btmN;

    public String toFraction() {
        return topN+"/"+btmN ;
    }
    
    public String toFloat() {
        double result = (double)topN/btmN; //casting convert type data
        return ""+result;
    }
    
    public void addFraction(Fraction_DLC f){ //this usefor refer this obj.
        if (this.btmN == f.btmN){
            this.btmN = this.btmN + f.btmN;
        }else{
            this.topN = this.topN* f.btmN+f.topN*this.btmN;
            this.btmN = this.btmN* f.btmN;
        }
    }
    
    public boolean myEquals(Fraction_DLC x){
        double answer = (double) this.topN/this.btmN;
        double answer2 = (double) x.topN/x.btmN;
        if (answer == answer2){
            return true;
        }else{
            return false;
        }
    }
    
    public void LowestTermFrac(){
        int Num = 1;
        for (int i = 1; i <= Math.min(this.topN, this.btmN);i++){
            if (this.topN%i == 0 && this.btmN%i == 0){
                Num = i;
            }
        } this.topN = this.topN/Num;
        this.btmN = this.btmN/Num;
    }
}

