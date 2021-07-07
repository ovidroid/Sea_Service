package packs;
import java.awt.Font;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;


public class Update implements ActionListener {

    JFrame frame = new JFrame("Sea Service Certificate");
    
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
    LocalDateTime now = LocalDateTime.now();

    JMenuBar menuBar = new JMenuBar();
    JMenu menu,menu1,menu2;
    JMenuItem tryp = new JMenuItem("Test");
   
    JLabel cert = new JLabel("Certificate of Sea Service");
   
    // Employee Details Section

    
    
    
    
    
    
    JLabel edt = new JLabel("Employee Details");
    
     
    
    JLabel ename = new JLabel("Employee Name");
    
    JLabel empno = new JLabel("Employee No");
    
    JLabel passportno = new JLabel("Passport No");
    
    JLabel cdcno = new JLabel("CDC No.");
    
    JLabel date = new JLabel("Letter Ref Date (dd-MMM-yyyy)");
  
          
    JTextField empname = new JTextField("");
    
    JTextField passno = new JTextField("");
    
    JTextField cdcnum = new JTextField("");
    
    JTextField dates = new JTextField(dtf.format(now));
    ImageIcon img = new ImageIcon(getClass().getResource("logo.jpg"));
    Image img1 =  img.getImage();
    Image mimg = img1.getScaledInstance(70,70, java.awt.Image.SCALE_SMOOTH);
    ImageIcon imgn = new ImageIcon(mimg);
    JLabel imgl = new JLabel(imgn);
    JButton submit = new JButton("Update");
    
    JTextField empnum = new JTextField("");
    
    JLabel indos = new JLabel("Indos No.");

    JTextField Indos = new JTextField("");




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
JLabel unaable = new JLabel("Unable to find the name in the list .  Click 'Add' button and save it for future use");


// String[] names = {};


JComboBox cd = new JComboBox<>();


// Service details section
JLabel ServiceDetails = new JLabel("Service Details");
JLabel RankServed = new JLabel("Rank Served");
JLabel FromDate = new JLabel("From Date (dd-MMM-yyyy)");
JLabel ToDate = new JLabel("To Date (dd-MMM-yyyy)");
JLabel ref = new JLabel("Letter Ref No.");
JTextField refrnc = new JTextField(""); 

JTextField rankServed = new JTextField("");
JTextField fromDate = new JTextField("");
JTextField toDate = new JTextField("");
JButton add = new JButton("Add");

JButton exit = new JButton("Exit");

    JButton back = new JButton("Back");


public void FillComboBox() {
    try {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://E:/Documents/BHN 5/DeskTop/jobship/Sea_Service_Certificates.mdb");
        java.sql.Statement stmt = con.createStatement();
       ResultSet res= stmt.executeQuery("select VesselName from VesselMaster;");
        while(res.next()){
            String name = res.getString(1);
            cd.addItem(name);
        }
    } catch (Exception e) {
System.out.println(e.getMessage());    }
}





    public void update( String Empname,String EMPno,String PP,String CDC,String lrd,String indno,String lrn,String rank, String fd, String td){



FillComboBox();
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
        edt.setBounds(20,130,200,25);
        frame.add(edt);
        edt.setFont(fe);
      
     
      
        ename.setBounds(20,150,120,25);
        frame.add(ename);
      
        empno.setBounds(150,150,120,25);
        frame.add(empno);
      
        passportno.setBounds(280,150,80,25);
        frame.add(passportno);
      
        cdcno.setBounds(370,150,80,25);
        frame.add(cdcno);
      
        date.setBounds(460,150,200,25);
        
        frame.add(date);
        
          indos.setBounds(670,150,80,25);
          frame.add(indos);
  
  ref.setBounds(760,150,100,25);
  frame.add(ref);
  
  
      
        empname.setBounds(20,190,120,25);
        frame.add(empname);
        empname.setText(Empname);
      
        empnum.setBounds(150,190,120,25);
        frame.add(empnum);
            empnum.setText(EMPno);
        passno.setBounds(280,190,80,25);
        frame.add(passno);
        passno.setText(PP);
        cdcnum.setBounds(370,190,80,25);
        frame.add(cdcnum);
        cdcnum.setText(CDC);     
        dates.setBounds(460,190,200,25);
        frame.add(dates);
        dates.setText(lrd);
        
        Indos.setBounds(670,190,80,25);
        frame.add(Indos);
        Indos.setText(indno);
  
          refrnc.setBounds(760,190,100,25);
          frame.add(refrnc);
          refrnc.setText(lrn);
  
  
  
  // Vessel Type Section
  VesselDetails.setBounds(20,260,150,25);
  VesselDetails.setFont(fe);
  frame.add(VesselDetails);
  
  
  VesselName.setBounds(20,290,150,25);
  frame.add(VesselName);
  
  cd.setBounds(20,340,120,25);
  frame.add(cd);
  cd.addActionListener(this);
  
  
  VesselOwner.setBounds(150,290,120,25);
  frame.add(VesselOwner);
  
  vo.setBounds(150,340,120,25);
  frame.add(vo);
  
  OficialNo.setBounds(280,290,120,25);
  frame.add(OficialNo);
  on.setBounds(280,340,120,25);
  frame.add(on);
  
  Flag.setBounds(410,290,120,25);
  frame.add(Flag);
  
  flg.setBounds(410,340,120,25);
  frame.add(flg);
  
  Type.setBounds(540,290,120,25);
  frame.add(Type);
  
  tp.setBounds(540,340,120,25);
  frame.add(tp);
  
  DWT.setBounds(670,290,50,25);
  frame.add(DWT);
  
  dwt.setBounds(670,340,50,25);
  frame.add(dwt);
  
  GRT.setBounds(730,290,50,25);
  frame.add(GRT);
  
  grt.setBounds(730,340,50,25);
  frame.add(grt);
  
  NRT.setBounds(790,290,50,25);
  frame.add(NRT);
  
  nrt.setBounds(790,340,50,25);
  frame.add(nrt);
  
  BHP.setBounds(850,290,50,25);
  frame.add(BHP);
  
  bhp.setBounds(850,340,50,25);
  frame.add(bhp);
  
  Font fa = new Font("Arial",Font.PLAIN ,10);
  
  add.setBounds(910,340,70,25);
  frame.add(add);
  add.addActionListener(this);
  
  unaable.setBounds(550,360,400,25);
  frame.add(unaable);
  unaable.setFont(fa);
  
  // Service Details Section
  
  
  ServiceDetails.setBounds(20,420,150,25);
  frame.add(ServiceDetails);
  ServiceDetails.setFont(fe);
  
  RankServed.setBounds(20,460,100,25);
  frame.add(RankServed);
  
  rankServed.setBounds(20,490,100,25);
  frame.add(rankServed);
  rankServed.setText(rank);
  FromDate.setBounds(130,460,150,25);
  frame.add(FromDate);

  
  fromDate.setBounds(130,490,100,25);
  frame.add(fromDate);
  fromDate.setText(fd);
  ToDate.setBounds(290,460,160,25);
  frame.add(ToDate);
  
  toDate.setBounds(290,490,100,25);
  frame.add(toDate);
  toDate.setText(td);
  
  
  
  submit.setBounds(100,580,100,50);
  frame.add(submit);
  submit.addActionListener(this);

  exit.setBounds(500,800,100,50);frame.add(exit);
  back.setBounds(750,570,100,50);
  frame.add(back);
  back.addActionListener(this);


    }



    public Date sdate(String sdt) throws java.text.ParseException {
        String date1 = sdt;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        java.util.Date jdt = sdf.parse(date1);
        java.sql.Date sdt1 = new java.sql.Date(jdt.getTime());
        
        
        return sdt1;
        }


    @Override
    public void actionPerformed(ActionEvent e) {

if(e.getSource()==add){
    NewShip np = new NewShip();
    np.newShip();
}

        if(e.getSource()==submit){
    try {
        if(passno.getText()!=null){
              String dt = dates.getText();
              String lrn = refrnc.getText();
              String eno = empnum.getText();
              String name = empname.getText();
              String pno = passno.getText();
              String cno = cdcnum.getText();
              String rs = rankServed.getText();
              String fd = fromDate.getText();
              String td=toDate.getText();
              String indno = Indos.getText(); 

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://E:/Documents/BHN 5/DeskTop/jobship/Sea_Service_Certificates.mdb");
            java.sql.Statement stmt = con.createStatement();
           int res= stmt.executeUpdate("Update CertificateDetails SET LetterDate = '"+sdate(dt)+"', LetterReferenceNo='"+lrn+"',EmployeeReferenceNo = '"+eno+"',Name = '"+name+"',PassportNumber='"+pno+"',CDCNumber='"+cno+"',VesselName='"+cd.getItemAt(cd.getSelectedIndex())+"',RankServed='"+rs+"',FromDate='"+fd+"',ToDate='"+td+"',IndosNo='"+indno+"' where PassportNumber='"+pno+"' ;"   );
            if(res>0){JOptionPane.showMessageDialog(null, "Record Updated Succesfully"); con.close();stmt.close();}
    
     
             }
        }
     catch (Exception ex) {
System.out.println("error messesage from updtae"+ex.getMessage());    }
        }






        if(e.getSource()==cd){ 
            try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://E:/Documents/BHN 5/DeskTop/jobship/Sea_Service_Certificates.mdb");
                java.sql.Statement stmt = con.createStatement();
                 ResultSet res = stmt.executeQuery("select *from VesselMaster where VesselName = '"+ cd.getItemAt(cd.getSelectedIndex())  
                 +"'");
                 while(res.next()){
                    String Vesselowner = res.getString(3);
                    vo.setText(Vesselowner);
                    String Oficial = res.getString(4);
                    on.setText(Oficial);
                    String flag = res.getString(5);
                    flg.setText(flag);
                    String type = res.getString(6);
                    tp.setText(type);      
                    String d = res.getString(7);
                    dwt.setText(d);
                    String g = res.getString(8);
                    grt.setText(g);
                    String n = res.getString(9);
                    nrt.setText(n);
                    String b = res.getString(10);
                    bhp.setText(b); 
                    
                    // JOptionPane.showMessageDialog(null,"Updation Successfull");
                 }
            
            } catch (Exception n) {
                JOptionPane.showMessageDialog(null,"Error");
            }


      }

if(e.getSource()==exit){
    System.exit(0);
}

if(e.getSource()==back){
    // SearchPage sp = new SearchPage();
    // sp.search();
    frame.dispose();
}

    }
}