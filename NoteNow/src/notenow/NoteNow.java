/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notenow;

import javax.swing.JFrame;

/**
 *
 * @author Sohan
 */
public class NoteNow 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        NoteNowGUI obj=new NoteNowGUI();
        obj.setBounds(0, 0, 700, 700);
        obj.setTitle("NoteNow");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // TODO code application logic here
    }
    
}
