package packs;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


import javax.swing.*;

public class NewShip implements ActionListener {

JFrame frame1 = new JFrame("Sea Service Certificates");

JLabel Title = new JLabel("Enter the following Details in order to add a new Vessel");
JLabel name = new JLabel("Vessel Name :");
JLabel owner =new JLabel("Vessel Owner :");
JLabel onum = new JLabel("Official Number :");
JLabel flag = new JLabel("Flag :");
JLabel Type = new JLabel("Type :");
JLabel Dwt = new JLabel("DWT :");
JLabel Grt = new JLabel("GRT :");
JLabel Nrt = new JLabel("NRT :");
JLabel Bhp = new JLabel("BHP :");

JTextField Name = new JTextField("");
JTextField Owner = new JTextField("");
JTextField Onum = new JTextField("");
JTextField Flag = new JTextField("");
JTextField type = new JTextField("");
JTextField DWT = new JTextField("");
JTextField GRT = new JTextField("");
JTextField NRT = new JTextField("");
JTextField BHP = new JTextField("");
JButton disp = new JButton("exit");

JButton add = new JButton("ADD");
JLabel  result = new JLabel();


   public void newShip() {
    frame1.setVisible(true);
    frame1.setSize(700,700);
    frame1.setResizable(true);
    frame1.setLayout(null);
    frame1.getContentPane().setBackground(Color.WHITE);
  
    
Title.setBounds(250,20,500,50);
frame1.add(Title);

name.setBounds(20,80,120,25);
frame1.add(name);

Name.setBounds(150,80,120,25);
frame1.add(Name);

owner.setBounds(20,130,120,25);
frame1.add(owner);

Owner.setBounds(150,130,120,25);
frame1.add(Owner);

onum.setBounds(20,170,120,25);
frame1.add(onum);

Onum.setBounds(150,170,120,25);
frame1.add(Onum);

flag.setBounds(20,210,120,25);
frame1.add(flag);

Flag.setBounds(150,210,120,25);
frame1.add(Flag);

Type.setBounds(20,250,120,25);
frame1.add(Type);

type.setBounds(150,250,120,25);
frame1.add(type);

Dwt.setBounds(20,290,120,25);
frame1.add(Dwt);

DWT.setBounds(150,290,120,25);
frame1.add(DWT);

Grt.setBounds(20,330,120,25);
frame1.add(Grt);

GRT.setBounds(150,330,120,25);
frame1.add(GRT);

Nrt.setBounds(20,370,120,25);
frame1.add(Nrt);

NRT.setBounds(150,370,120,25);
frame1.add(NRT);

Bhp.setBounds(20,410,120,25);
frame1.add(Bhp);

BHP.setBounds(150,410,120,25);
frame1.add(BHP);

result.setBounds(400,150,75,25);
frame1.add(result);

add.setBounds(110,500,70,50);
frame1.add(add);
add.addActionListener(this);

disp.setBounds(280,500,70,50);
frame1.add(disp);
disp.addActionListener(this);
}


@Override
public void actionPerformed(ActionEvent e) {
String vn = Name.getText();
String vo = Owner.getText();
String on = Onum.getText();
String flg = Flag.getText();
String tp = type.getText();
String dwt = DWT.getText();
String grt = Grt.getText();
String nrt = NRT.getText();
String bhp = BHP.getText();

if(e.getSource()==add){
    
    try {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://E:/Documents/BHN 5/DeskTop/jobship/Sea_Service_Certificates.mdb");
        java.sql.Statement stmt = con.createStatement();
         int res = stmt.executeUpdate("INSERT INTO VesselMaster (VesselName,VesselOwner,OfficialNumber,Flag,Type,DWT,GRT,NRT,BHP) VALUES('"+vn+"','"+vo+"','"+on+"','"+flg+"','"+tp+"','"+dwt+"','"+grt+"','"+nrt+"','"+bhp+"');");  
    
         if(res>0){
        JOptionPane.showMessageDialog(null , "Added Successfully");
             con.close();
             stmt.close();
             Mainpage mp = new Mainpage();
             mp.mainpage();
             
         }
      } catch (Exception i) {
      System.out.print("Adding Error :" + i);
      }
}
if(e.getSource()==disp){
    frame1.dispose();

}
    
}


}
