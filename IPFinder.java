/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipfinder;

import javax.swing.*;
import java.awt.event.*;
import java.net.*;

/**
 *
 * @author pradeep
 */
public class IPFinder extends JFrame implements ActionListener {

    JLabel l;
    JTextField tf;
    JButton b;
    
    IPFinder()
    {
        super("IP-Finder Tool : Java");
        
        l = new JLabel("Enter URL");
        l.setBounds(50,70,150,20);
        
        tf = new JTextField();
        tf.setBounds(50,100,200,20);
        
        b = new JButton("Find IP");
        b.setBounds(50,150,80,30);
        
        b.addActionListener(this);
        
        add(l);
        add(tf);
        add(b);
        
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String url = tf.getText() ;
        //url.replaceAll("www.", "");
        //url.replaceAll("http://", "");
        try
        {
            InetAddress ia = InetAddress.getByName(url);
            
            String ip = ia.getHostAddress();
            
            JOptionPane.showMessageDialog(this,ip);
        }
        catch(Exception excep)
        {
            JOptionPane.showMessageDialog(this,excep.toString());
        }
    }
    
    public static void main(String[] args) {
        new IPFinder(); 
    }
    
}
