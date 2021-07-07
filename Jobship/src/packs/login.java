package packs;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.*;

public class login {
   
    
public void Login(){

    
    


    JFrame frame = new JFrame();
    JButton logiButton = new JButton("Login");
    JTextField Username = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel UserId = new JLabel("User ID : ");
    JLabel pass = new JLabel("Password : ");
    JLabel err = new JLabel("");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300,420);
frame.getContentPane().setBackground(Color.WHITE);
frame.setLayout(null);
frame.setVisible(true);
frame.setLocation(380,180);
UserId.setBounds(50,100,75,25);
Username.setBounds(120,100,100,25);
pass.setBounds(50,150,75,25);
passwordField.setBounds(120,150,100,25);
logiButton.setBounds(70,250,150,20);
err.setBounds(50,300,200,20);
frame.add(UserId);
frame.add(Username);
Username.getText();
frame.add(pass);
frame.add(passwordField);
frame.add(logiButton);
frame.add(err);


logiButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e) {
       if(Username.getText().contains("bhn") && passwordField.getText().contains("bhn")){
       Mainpage mp = new Mainpage();
     
        try {
            mp.mainpage();
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
    
       frame.dispose();   
       }else{
        JOptionPane.showMessageDialog(null,"Invalid User Name Or Password");
      }
    }
});


}}







