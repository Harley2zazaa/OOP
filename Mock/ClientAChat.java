/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mock;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class ClientAChat implements ActionListener,WindowListener{
    private JFrame fr;
    private JPanel p1;
    private JTextArea text;
    private JTextField text2;
    private JButton button;
    private ClientBChat B;

    public ClientAChat(ClientBChat B) { // get form constructer
        this.B = B;
        fr = new JFrame("ClientAChat");
        p1 = new JPanel();
        text = new JTextArea(10,20);
        text2 = new JTextField(25);
        button = new JButton("Send");
        text.setEditable(false);
        ///////
        fr.setLayout(new BorderLayout());
        p1.setLayout(new FlowLayout());
//        ////
        button.addActionListener(this);
        fr.addWindowListener(this);
        ////
        p1.add(text2);
        p1.add(button);
        fr.add(text,BorderLayout.CENTER);
        fr.add(p1,BorderLayout.SOUTH);
        ///
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400,400);
        fr.setVisible(true);
    }
    
    public void getMassage(String text){
        this.text.setText(text);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String temp = "["+dtf.format(LocalDateTime.now())+"]A " + text2.getText() + "\n" + text.getText();
        B.getMassage(temp);
        text.setText(temp);
        text2.setText("");
    }

    @Override
    public void windowOpened(WindowEvent e) {
        try(DataInputStream temp = new DataInputStream(new FileInputStream("chat_history.dat"))){
            text.setText(temp.readUTF());
        }catch(IOException ex){
            System.out.println("No Chat");
//            ex.printStackTrace();
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try(DataOutputStream temp = new DataOutputStream(new FileOutputStream("chat_history.dat"))){
            System.out.println("Save Done");
            temp.writeUTF(text.getText());
        }catch(IOException ex){
            System.out.println("Save Feiled");
            ex.printStackTrace();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
}
