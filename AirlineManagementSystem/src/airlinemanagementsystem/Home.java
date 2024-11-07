/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinemanagementsystem;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author kv
 */
    

public class Home extends JFrame implements ActionListener{
    
    
    public Home(){
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/front.jpg"));
        JLabel image=new JLabel(i1); 
        image.setBounds(0,0,1800,800);
        add(image);
        
        
        
        
        JLabel heading=new JLabel("Air India Welcomes you");
        heading.setBounds(720,60,1000,40);
        heading.setForeground(Color.BLUE);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 36));
        image.add(heading);
        
        
        
        JMenuBar menubar=new JMenuBar();
        setJMenuBar(menubar);
        
        JMenu details=new JMenu("Details");
        menubar.add(details);
        
        JMenuItem flightdetails = new JMenuItem("flight details");
        flightdetails.addActionListener(this);
        details.add(flightdetails);
        
        JMenuItem customerdetails = new JMenuItem("customer details");
        customerdetails.addActionListener(this);
        details.add(customerdetails);
        
        JMenuItem reservationdetails = new JMenuItem("resrvation details");
        details.add(reservationdetails);
        
        JMenuItem bookflights = new JMenuItem("book flights");
        details.add(bookflights);
        
        JMenuItem journeydetails = new JMenuItem("journey details");
        details.add(journeydetails);
        
        JMenuItem ticketcancellation = new JMenuItem("ticket cancellation");
        details.add(ticketcancellation);
        
        JMenu ticket=new JMenu("Tickets");
        menubar.add(ticket);
        
        JMenuItem boardingpass = new JMenuItem("boardingpass");
        ticket.add(boardingpass);
        
        
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
     
    public void actionPerformed(ActionEvent ae){
        String text =ae.getActionCommand();
        if(text.equals("customer details")){
             new AddCustomer();
        }else if(text.equals("flight details")){
            new Flightinfo();
        }
    }
    public static void main(String[] args) {
        new Home();
    }
}


