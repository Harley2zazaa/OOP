/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mock;

/**
 *
 * @author USER
 */
public class main {
    public static void main(String[] args) {
        ClientBChat B = new ClientBChat();
        ClientAChat A = new ClientAChat(B);
        B.path(A);
    }
}
