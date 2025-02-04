/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_LAB;

/**
 *
 * @author USER
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TellerGUI implements ActionListener{
    private JFrame fr;
    private JPanel p1,p2,p3;
    private JLabel Balance,Amount;
    private JTextField Money,Need;
    private JButton Deposit,Withdraw,Exit;
    private double current,you_need;

    public TellerGUI() {
        this.setCurrent(6000);
        this.setYou_need(0);
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        Balance = new JLabel("Balance");
        Amount = new JLabel("Amount");
        Money = new JTextField(this.getCurrent()+"");
        Need = new JTextField();
        Deposit = new JButton("Deposit");
        Withdraw = new JButton("Withdraw");
        Exit = new JButton("Exit");
        Money.setEditable(false);
        ////
        Deposit.addActionListener(this);
        Withdraw.addActionListener(this);
        Exit.addActionListener(this);
        Need.addActionListener(this);
        ////
        fr.setLayout(new GridLayout(4,1));
        p1.setLayout(new GridLayout(1,2));
        p2.setLayout(new GridLayout(1,2));
        p3.setLayout(new GridLayout(1,3));
        p1.add(Balance);
        p1.add(Money);
        p2.add(Amount);
        p2.add(Need);
        p3.add(Deposit);
        p3.add(Withdraw);
        p3.add(Exit);
        fr.add(p1);
        fr.add(p2);
        fr.add(p3);
        fr.add(new JPanel());
        ////
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public double getYou_need() {
        return you_need;
    }

    public void setYou_need(double you_need) {
        this.you_need = you_need;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       Object Temp = e.getSource();
       if  (Temp == Need){
           this.setYou_need(Double.parseDouble(Need.getText())); //Don't Forget Enter after type money you need
       }else if(Temp == Deposit){
           this.setCurrent(this.getCurrent()+this.getYou_need()); 
           this.setYou_need(0);
           Money.setText(this.getCurrent()+"");
           Need.setText("");
       }else if(Temp == Withdraw){
           if (this.getCurrent()>=this.getYou_need()){
                this.setCurrent(this.getCurrent()-this.getYou_need()); 
                this.setYou_need(0);
                Money.setText(this.getCurrent()+"");
                Need.setText("");
           }else{
               this.setYou_need(0);
               Need.setText("");
           }
       }else if(Temp == Exit){
           System.exit(0);
       }
    }
}

