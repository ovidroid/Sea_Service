package packs;
import java.awt.Font;
import java.awt.Image;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.*;


public class SearchPage implements ActionListener{
  JFrame frame = new JFrame("Sea Service Certificate");
    
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
    LocalDateTime now = LocalDateTime.now();

    JMenuBar menuBar = new JMenuBar();
    JMenu menu,menu1,menu2;
    JMenuItem tryp = new JMenuItem("Test");
   
    JLabel cert = new JLabel("Certificate of Sea Service");
   
    // Employee Details Section

    
    
    
    
    
    
    JLabel edt = new JLabel("Employee Details");
    
    JLabel records = new JLabel("Records");    
    
    JLabel ename = new JLabel("Employee Name");
    
    JLabel empno = new JLabel("Employee No");
    
    JLabel passportno = new JLabel("Passport No");
    
    JLabel cdcno = new JLabel("CDC No.");
    
    JLabel date = new JLabel("Lettter Reference Date");
  
    JTextField record = new JTextField("");
          
    JTextField empname = new JTextField("");
    
    JTextField passno = new JTextField("");
    
    JTextField cdcnum = new JTextField("");
    
    JTextField dates = new JTextField(dtf.format(now));
  
    JButton submit = new JButton("Home");
    
    JTextField empnum = new JTextField("");
    





// Vessel Type Section
JLabel VesselDetails = new JLabel("Vessel Details");
JLabel VesselName = new JLabel("Vessel Name");
JLabel VesselOwner = new JLabel("Vessel Owner");
JLabel OficialNo = new JLabel("Officail No.");
JLabel Flag = new JLabel("Flag");
JLabel Type = new JLabel("Type");    
JLabel DWT = new JLabel("DWT");
JLabel GRT = new JLabel("GRT");
JLabel NRT = new JLabel("NRT");
JLabel BHP = new JLabel("BHP");


JTextField vd = new JTextField("");
JTextField vn = new JTextField("");
JTextField vo =new JTextField("");
JTextField on = new JTextField("");
JTextField flg = new JTextField("");
JTextField tp = new JTextField("");
JTextField dwt = new JTextField("");
JTextField grt = new JTextField("");
JTextField nrt = new JTextField("");
JTextField bhp = new JTextField("");
JLabel unaable = new JLabel("Unable to find the name in the list .  Click add button and save it for future use");
JLabel Indos = new JLabel("Indos No.");
JTextField indos = new JTextField("");

JTextField vname = new JTextField("");
JLabel lrn = new JLabel("Letter Ref No.");
JTextField Lrn = new JTextField("");

// Service details section
JLabel ServiceDetails = new JLabel("Service Details");
JLabel RankServed = new JLabel("Rank Served");
JLabel FromDate = new JLabel("From Date");
JLabel ToDate = new JLabel("To Date");

ImageIcon img = new ImageIcon(getClass().getResource("logo.jpg"));
    Image img1 =  img.getImage();
    Image mimg = img1.getScaledInstance(70,70, java.awt.Image.SCALE_SMOOTH);
    ImageIcon imgn = new ImageIcon(mimg);
    JLabel imgl = new JLabel(imgn);
JTextField rankServed = new JTextField("");
JTextField fromDate = new JTextField("");
JTextField toDate = new JTextField("");
JButton add = new JButton("Add");
JButton Search =new JButton("Search");
JButton print = new JButton("Print");
JButton exit = new JButton("Exit");
JButton update = new JButton("Update");
JLabel error = new JLabel("");
    public void search() {
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.setSize(1300,700);
      frame.setResizable(true);
      frame.setLayout(null);
      frame.getContentPane().setBackground(Color.WHITE);
      frame.setJMenuBar(menuBar);
      
         //   Setting up Menubar
     menu = new JMenu("Add");
     menuBar.add(menu);
    menu1 = new JMenu("Search");
        menuBar.add(menu1);
menu1.addActionListener(this);

        menu2 = new JMenu("Update");
        menu2.add(tryp);
        menuBar.add(menu2); 

 
      
      
      
      
      // Body components setup
     

      
      imgl.setBounds(450,0,100,90);
      frame.add(imgl);
      cert.setBounds(320,100,400,25);
      frame.add(cert);
      Font fn = new Font("Arial",Font.BOLD ,30);
                      cert.setFont(fn);
       Font fe = new Font("Arial",Font.PLAIN ,20);
      edt.setBounds(20,110,200,25);
      frame.add(edt);
      edt.setFont(fe);
    
      date.setBounds(20,140,150,25);
      frame.add(date);
    
      ename.setBounds(180,140,120,25);
      frame.add(ename);
    
      empno.setBounds(310,140,120,25);
      frame.add(empno);
    
      passportno.setBounds(440,140,120,25);
      frame.add(passportno);
    
      cdcno.setBounds(570,140,120,25);
      frame.add(cdcno);
  
      Indos.setBounds(700,140,120,25);
      frame.add(Indos);

      lrn.setBounds(830,140,120,25);frame.add(lrn);
     
      dates.setBounds(20,180,150,25);

      frame.add(dates);
    
      empname.setBounds(180,180,120,25);
      frame.add(empname);
    
      empnum.setBounds(310,180,120,25);
      frame.add(empnum);
          
      passno.setBounds(440,180,120,25);
      frame.add(passno);
      
      cdcnum.setBounds(570,180,120,25);
      frame.add(cdcnum);
      
      indos.setBounds(700,180,120,25);
      frame.add(indos);

      Lrn.setBounds(830,180,120,25);
      frame.add(Lrn);

// Vessel Type Section
VesselDetails.setBounds(20,250,150,25);
VesselDetails.setFont(fe);
frame.add(VesselDetails);


VesselName.setBounds(20,280,150,25);
frame.add(VesselName);

vname.setBounds(20,330,120,25);
frame.add(vname);



VesselOwner.setBounds(150,280,120,25);
frame.add(VesselOwner);

vo.setBounds(150,330,120,25);
frame.add(vo);

OficialNo.setBounds(280,280,120,25);
frame.add(OficialNo);
on.setBounds(280,330,120,25);
frame.add(on);

Flag.setBounds(410,280,120,25);
frame.add(Flag);

flg.setBounds(410,330,120,25);
frame.add(flg);

Type.setBounds(540,280,120,25);
frame.add(Type);

tp.setBounds(540,330,120,25);
frame.add(tp);

DWT.setBounds(670,280,50,25);
frame.add(DWT);

dwt.setBounds(670,330,50,25);
frame.add(dwt);

GRT.setBounds(730,280,50,25);
frame.add(GRT);

grt.setBounds(730,330,50,25);
frame.add(grt);

NRT.setBounds(790,280,50,25);
frame.add(NRT);

nrt.setBounds(790,330,50,25);
frame.add(nrt);

BHP.setBounds(850,280,50,25);
frame.add(BHP);

bhp.setBounds(850,330,50,25);
frame.add(bhp);

Font fa = new Font("Arial",Font.PLAIN ,10);

add.setBounds(910,330,70,25);
frame.add(add);
add.addActionListener(this);

unaable.setBounds(550,350,400,25);
frame.add(unaable);
unaable.setFont(fa);

// Service Details Section


ServiceDetails.setBounds(20,410,150,25);
frame.add(ServiceDetails);
ServiceDetails.setFont(fe);

RankServed.setBounds(20,450,100,25);
frame.add(RankServed);

rankServed.setBounds(20,480,100,25);
frame.add(rankServed);

FromDate.setBounds(130,450,100,25);
frame.add(FromDate);

fromDate.setBounds(130,480,100,25);
frame.add(fromDate);

ToDate.setBounds(240,450,100,25);
frame.add(ToDate);

toDate.setBounds(240,480,100,25);
frame.add(toDate);

error.setBounds(500,450,150,25);frame.add(error);


submit.setBounds(100,570,100,50);
frame.add(submit);
Search.setBounds(250,570,100,50);
frame.add(Search);
Search.addActionListener(this);

print.setBounds(400,570,100,50);
frame.add(print);

update.setBounds(550,570,100,50);
frame.add(update);
update.addActionListener(this);

exit.setBounds(750,570,100,50);
frame.add(exit);





      submit.addActionListener((ActionListener) this);
 print.addActionListener(this);
 exit.addActionListener(this);
     
       }
    @Override
    public void actionPerformed(ActionEvent e) {
 if(e.getSource()==submit){
   Mainpage mp = new Mainpage();
   try {
    mp.mainpage();
    frame.dispose();
  } catch (ParseException e1) {
    
    e1.printStackTrace();
  }
}

if(e.getSource()==Search){
  

  try {

if(passno.getText().length()==0 && cdcnum.getText().length()==0){
JOptionPane.showMessageDialog(null,"Please Enter Either Passport Number or CDC Number To search the details");
}else if(passno.getText().length()!=0){
    try {
      Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
      Connection con = DriverManager.getConnection("jdbc:ucanaccess://E:/Documents/BHN 5/DeskTop/jobship/Sea_Service_Certificates.mdb");
      java.sql.Statement stmt = con.createStatement();
      ResultSet res = stmt.executeQuery("SELECT * FROM  CertificateDetails WHERE PassportNumber='"+passno.getText()+"';"); 
     

      while(res.next()){


        empnum.setText(res.getString(3));            
    
        empname.setText(res.getString(4));

        passno.setText(res.getString(5));
        Lrn.setText(res.getString(2));
        cdcnum.setText(res.getString(6));
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        Date jd =res.getDate(1);
        String dt = sdf.format(jd);
      
dates.setText(dt);
        vname.setText(res.getString(7));

        try {
          Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
          Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:/Documents/BHN 5/DeskTop/jobship/Sea_Service_Certificates.mdb");
        
          java.sql.Statement stmt1 = conn.createStatement();
          ResultSet rs = stmt1.executeQuery("SELECT * FROM VesselMaster where VesselName = '"+res.getString(7)+"'");
          while(rs.next()){
vname.setText(rs.getString(2)) ;
vo.setText(rs.getString(3));
on.setText(rs.getString(4));
flg.setText(rs.getString(5));
tp.setText(rs.getString(6));
dwt.setText(rs.getString(7));
grt.setText(rs.getString(8));
nrt.setText(rs.getString(9));
bhp.setText(rs.getString(10));
}
        } catch (Exception m) {
JOptionPane.showMessageDialog(null,"No Such Vessel");          }

        rankServed.setText(res.getString(8));
        // SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        Date jd1 =res.getDate(9);
        String dt1 = sdf.format(jd1);
      
      
fromDate.setText(dt1);
// SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
Date jd2 =res.getDate(10);
String dt2 = sdf.format(jd2);


toDate.setText(dt2);
  
    indos.setText(res.getString(12));
   
}        

if(indos.getText().length()==0){
  JOptionPane.showMessageDialog(null,"Invalid Passport Number");
}

}     catch (Exception b) {
      JOptionPane.showMessageDialog(null,"from pass try"+b.getMessage());
    }
     
   
  }else if(cdcnum.getText().length()!=0){
    try {
      Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
      Connection con = DriverManager.getConnection("jdbc:ucanaccess://E:/Documents/BHN 5/DeskTop/jobship/Sea_Service_Certificates.mdb");
      java.sql.Statement stmt = con.createStatement();
      ResultSet res = stmt.executeQuery("SELECT * FROM  CertificateDetails WHERE CDCNumber='"+cdcnum.getText()+"';"); 
    

      while(res.next()){
        JOptionPane.showMessageDialog(null,"Record Found");
        empnum.setText(res.getString(3));            
    
        empname.setText(res.getString(4));

        passno.setText(res.getString(5));
        Lrn.setText(res.getString(2));

        cdcnum.setText(res.getString(6));
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        Date jd =res.getDate(1);
        String dt = sdf.format(jd);
      
dates.setText(dt);
  
        vname.setText(res.getString(7));

        try {
          Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
          Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:/Documents/BHN 5/DeskTop/jobship/Sea_Service_Certificates.mdb");
        
          java.sql.Statement stmt1 = conn.createStatement();
          ResultSet rs = stmt1.executeQuery("SELECT * FROM VesselMaster where VesselName = '"+res.getString(7)+"'");
          while(rs.next()){
vname.setText(rs.getString(2)) ;
vo.setText(rs.getString(3));
on.setText(rs.getString(4));
flg.setText(rs.getString(5));
tp.setText(rs.getString(6));
dwt.setText(rs.getString(7));
grt.setText(rs.getString(8));
nrt.setText(rs.getString(9));
bhp.setText(rs.getString(10));
}
        } catch (Exception m) {
          JOptionPane.showMessageDialog(null,"No Such Vessel");
        }
        rankServed.setText(res.getString(8));
        // SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        Date jd1 =res.getDate(9);
        String dt1 = sdf.format(jd1);
      
fromDate.setText(dt1);
// SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
Date jd2 =res.getDate(10);
String dt2 = sdf.format(jd2);
toDate.setText(dt2);

// dates.setText(dt2);  
indos.setText(res.getString(12));    
        
   
}

if(indos.getText().length()==0){
  JOptionPane.showMessageDialog(null,"Invalid CDC No");
}

 

}
    catch (Exception b) {
      JOptionPane.showMessageDialog(null,"from CDC no. "+b.getMessage());
    }
    
    

  }else{
    JOptionPane.showMessageDialog(null,"Invalid Data");
  }
    


}


        

  catch (Exception n) {
    JOptionPane.showMessageDialog(null,"No Entry Please Check Before Proceding Further.");
  }

}
if(e.getSource()==update){
Update up = new Update();
up.update(empname.getText(),empnum.getText(), passno.getText(),cdcnum.getText(),dates.getText(),indos.getText(),Lrn.getText(),rankServed.getText(),fromDate.getText(),toDate.getText() );
  

}

if(e.getSource()==print){
  Printer p = new Printer();
  p.Printer(dates.getText(),indos.getText(),empname.getText(),empnum.getText(),passno.getText(),cdcnum.getText(),vname.getText(),vo.getText(),on.getText(),flg.getText(),tp.getText(),dwt.getText(),grt.getText(),nrt.getText(),bhp.getText(),rankServed.getText(),fromDate.getText(),toDate.getText());
  frame.dispose();
}

if(e.getSource()==exit){
  System.exit(0);
}


if(e.getSource()==add){
  NewShip newship = new NewShip();
  newship.newShip();
}

    
}}