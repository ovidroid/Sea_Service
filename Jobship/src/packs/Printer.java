package packs;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Printer implements ActionListener {
    JButton print= new JButton("Print");
    JLabel ldate = new JLabel("Date :");
    
ImageIcon img = new ImageIcon(getClass().getResource("header.gif"));
Image img1 =  img.getImage();
Image mimg = img1.getScaledInstance(730,115, java.awt.Image.SCALE_SMOOTH);
ImageIcon imgn = new ImageIcon(mimg);
JLabel imgl = new JLabel(imgn);

ImageIcon imgs = new ImageIcon(getClass().getResource("Footer.gif"));
Image img2 =  imgs.getImage();
Image mimh = img2.getScaledInstance(730,80, java.awt.Image.SCALE_SMOOTH);
ImageIcon imgm = new ImageIcon(mimh);
JLabel img21 = new JLabel(imgm);





JLabel cert = new JLabel("Certificate of Sea Service");
JFrame frame = new JFrame("Sea Service Certificate");
JTextArea jtdate = new JTextArea();

JLabel jref = new JLabel("Reference No. :");
JTextArea jtref = new JTextArea("");

JLabel jedt = new JLabel("Employee Details");
JLabel jrec = new JLabel("Rec No",JLabel.CENTER);
JTextArea jtrec = new JTextArea("");;
JLabel jempno = new JLabel("Emp No.",JLabel.CENTER);

JTextArea jtempno = new JTextArea();

JLabel jename = new JLabel("Employee Name",JLabel.CENTER);
JTextArea jtename = new JTextArea();

JLabel jpassno = new JLabel("Passport No",JLabel.CENTER);
JTextArea jtpassno = new JTextArea();

JLabel jcdc = new JLabel("CDC No",JLabel.CENTER);
JTextArea jtcdc = new JTextArea();




JLabel jvesseldetails = new JLabel("Vessel Details");

JLabel jvesselname = new JLabel("Vessel Name",JLabel.CENTER);

JTextArea jtvesselname = new JTextArea();

JLabel jvesselowner = new JLabel("Vessel Owner",JLabel.CENTER);
JTextArea jtvesselowner = new JTextArea();

JLabel jofficialNo = new JLabel("Off No",JLabel.CENTER);
JTextArea jtofficialNo = new JTextArea();

JLabel jflag = new JLabel("Flag",JLabel.CENTER);
JTextArea jtflag = new JTextArea();

JLabel jtype = new JLabel("Type",JLabel.CENTER);
JTextArea jttype = new JTextArea();

JLabel jdwt =new JLabel("DWT",JLabel.CENTER);
JTextArea jtdwt = new JTextArea();

JLabel jgrt = new JLabel("GRT",JLabel.CENTER);
JTextArea jtgrt = new JTextArea();

JLabel jnrt = new JLabel("NRT",JLabel.CENTER);
JTextArea jtnrt = new JTextArea();

JLabel jbhp = new JLabel("BHP",JLabel.CENTER);
JTextArea jtbhp = new JTextArea();


JLabel jservice = new JLabel("Service Details");
JLabel jrank = new JLabel("Rank Served",JLabel.CENTER);
JTextArea jtrank = new JTextArea();

JLabel jfrom = new JLabel("From Date",JLabel.CENTER);
JTextArea jtfrom = new JTextArea();

JLabel jto = new JLabel("To Date",JLabel.CENTER);
JTextArea jtto = new JTextArea();
JLabel output = new JLabel("<html>This output is generated on bhnoffshore.com website.<br> Hence signature not require. </html>");


JLabel water = new JLabel("<html><p style = '"+"color:rgb(224,224,224);display:inline-block;font-size: 45px;transform:translate(25%);width: 50%;height: 5%;margin: 0;z-index: -999;left:0px;top:200px;" +"'>This</p><br><p style = '"+"color:rgb(224,224,224);display:inline-block;font-size: 45px;transform:translate(25%);width: 50%;height: 5%;margin: 0;z-index: -999;left:0px;top:200px;" +"'> page</p><br> <p style = '"+"color:rgb(224,224,224);display:inline-block;font-size: 45px;transform:translate(25%);width: 50%;height: 5%;margin: 0;z-index: -999;left:0px;top:200px;" +"'>is</p><br><p style = '"+"color:rgb(224,224,224);display:inline-block;font-size: 45px;transform:translate(25%);width: 50%;height: 5%;margin: 0;z-index: -999;left:0px;top:200px;" +"'> generated</p><br> <p style = '"+"color:rgb(224,224,224);display:inline-block;font-size: 45px;transform:translate(25%);width: 50%;height: 5%;margin: 0;z-index: -999;left:0px;top:200px;" +"'>from</p><br> <p style = '"+"color:rgb(224,224,224);display:inline-block;font-size: 45px;transform:translate(25%);width: 50%;height: 5%;margin: 0;z-index: -999;left:0px;top:200px;" +"'>www.bhnoffshore.com </p></html>",JLabel.CENTER );
// JTable employeeDetail;
// String data[][] = {{"Owais","Abhishek"}};
// String  col[]={"name","name"};

Border border = BorderFactory.createLineBorder(Color.BLACK, 1);



JPanel panel = new JPanel(null);
JLabel jindos = new JLabel("Indos No.",JLabel.CENTER);
JTextArea jtindos = new JTextArea("");

JButton exit = new JButton("Exit");
public void Printer(String dt,String indo,String ename,String enumb , String passno,String cdcno,String VesselName , String Vesowner , String Officialno , String flg,String type , String dwt ,String grt ,String nrt,String bhp,String rank , String fd , String td  ){

String date=dt;
String Indos = indo;
String empname = ename;
String empno = enumb;
String passport = passno;
String cdcnum = cdcno;
String vesselname = VesselName;
String vo = Vesowner;
String on = Officialno;
String flag = flg;
String Type = type;
String DWT = dwt;
String Grt = grt;
String Nrt = nrt;
String Bhp = bhp;
String Rank = rank;
String From = fd;
String to = td;

try {
    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
    Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:/Documents/BHN 5/DeskTop/jobship/Sea_Service_Certificates.mdb");
    
    java.sql.Statement stmt1 = conn.createStatement();
    ResultSet rs = stmt1.executeQuery("SELECT ID,LetterReferenceNo FROM CertificateDetails where PassportNumber = '"+passport+"'");
 while (rs.next()){
    jtrec.setText(rs.getString(1));
    jtref.setText(rs.getString(2));
 }
} catch (Exception e) {
    System.out.println(e.getMessage());
}





frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(750,960);
        frame.setResizable(true);
    
        frame.getContentPane().setBackground(Color.WHITE);
        // panel.setLayout(new BorderLayout());
        panel.setBackground(Color.WHITE);
    panel.setBounds(0,0,750,960);
     frame.add(panel);
  

     imgl.setBounds(0,20,700,115);
         panel.add(imgl);
         
         

water.setBounds(0,0,500,900);panel.add(water);


        Font fn = new Font("Arial",Font.BOLD ,30);
        Font fe = new Font("Arial",Font.BOLD ,20);
        Font fs = new Font("Arial",Font.BOLD ,15);
        
        
        cert.setBounds(200,150,750,25);
        panel.add(cert);
        cert.setFont(fn);
        
        jref.setBounds(15,210,150,25);
        panel.add(jref);
        jref.setFont(fe);


        jtref.setBounds(175,213,75,25);
        panel.add(jtref);
        jtref.setFont(fs);
        

        ldate.setBounds(555,210,75,25);
        panel.add(ldate);
        ldate.setFont(fe);

        
        jtdate.setBounds(630,213,85,25);
        panel.add(jtdate);
        jtdate.setText(date);
        jtdate.setFont(fs);
        

        jedt.setBounds(15,250,700,25);
        panel.add(jedt);
        jedt.setFont(fe);
        jedt.setBorder(border);
        jedt.setOpaque(true);
        jedt.setForeground(Color.white);

        jedt.setBackground(Color.blue);
        

        jrec.setBounds(15,275,70,25);
        panel.add(jrec);
        jrec.setFont(fs);
        jrec.setBorder(border);


        jtrec.setBounds(15,300,70,35);
        panel.add(jtrec);
        jtrec.setBorder(border);

    jindos.setBounds(85,275,80,25);
    panel.add(jindos);
    jindos.setFont(fs);
    jindos.setBorder(border);
    jtindos.setBounds(85,300,80,35);
    panel.add(jtindos);
    jtindos.setText(Indos);
    jtindos.setBorder(border);



        jempno.setBounds(165,275,100,25);
        panel.add(jempno);
        jempno.setFont(fs);
        jempno.setBorder(border);



        jtempno.setBounds(165,300,100,35);
        panel.add(jtempno);
        jtempno.setText(empno);
        jtempno.setLineWrap(true);

        jtempno.setBorder(border);


               
        jename.setBounds(265,275,210,25);
        panel.add(jename);
        jename.setFont(fs);
        jename.setBorder(border);




        jtename.setBounds(265,300,210,35);
        panel.add(jtename);
        jtename.setText(empname);
        jtename.setLineWrap(true);

        jtename.setBorder(border);

        jpassno.setBounds(475,275,120,25);
        panel.add(jpassno);
        jpassno.setFont(fs);
        jpassno.setBorder(border);




        jtpassno.setBounds(475,300,120,35);
        panel.add(jtpassno);
        jtpassno.setText(passport);
        jtpassno.setBorder(border);

        jcdc.setBounds(595,275,120,25);
        panel.add(jcdc);
        jcdc.setFont(fs);
        jcdc.setBorder(border);




        jtcdc.setBounds(595,300,120,35);
        panel.add(jtcdc);
        jtcdc.setText(cdcnum);
        jtcdc.setBorder(border);

        jvesseldetails.setBounds(15,400,700,25);
        panel.add(jvesseldetails);
        jvesseldetails.setFont(fe);
        jvesseldetails.setBorder(border);
        jvesseldetails.setOpaque(true);
        jvesseldetails.setForeground(Color.white);

        jvesseldetails.setBackground(Color.blue);



        jvesselname.setBounds(15,425,113,25);
        panel.add(jvesselname);
        jvesselname.setFont(fs);
        jvesselname.setBorder(border);




        jtvesselname.setBounds(15,450,113,40);
        panel.add(jtvesselname);
        jtvesselname.setText(vesselname);
        jtvesselname.setBorder(border);
        jtvesselname.setLineWrap(true);



        jvesselowner.setBounds(128,425,113,25);
        panel.add(jvesselowner);
        jvesselowner.setFont(fs);
        jvesselowner.setBorder(border);
        

        
        jtvesselowner.setBounds(128,450,113,40);
        panel.add(jtvesselowner);
        jtvesselowner.setText(vo);
        jtvesselowner.setLineWrap(true);
        jtvesselowner.setWrapStyleWord(true);

        jtvesselowner.setBorder(border);

        jofficialNo.setBounds(241,425,85,25);
        panel.add(jofficialNo);
        jofficialNo.setFont(fs);

        jofficialNo.setBorder(border);

        jtofficialNo.setBounds(241,450,85,40);
        panel.add(jtofficialNo);
        jtofficialNo.setText(on);
        jtofficialNo.setBorder(border);




        
        
        
        
        jflag.setBounds(326,425,95,25);
        panel.add(jflag);
        jflag.setFont(fs);
        jflag.setBorder(border);




        jtflag.setBounds(326,450,95,40);
        panel.add(jtflag);
        jtflag.setText(flag);
        jtflag.setBorder(border);
        jtflag.setLineWrap(true);


        jtype.setBounds(421,425,95,25);
        panel.add(jtype);
        jtype.setFont(fs);
        jtype.setBorder(border);



        jttype.setBounds(421,450,95,40);
        panel.add(jttype);
        jttype.setText(Type);
        jttype.setBorder(border);
        jttype.setLineWrap(true);
        jttype.setWrapStyleWord(true);

        jdwt.setBounds(516,425,51,25);
        panel.add(jdwt);
        jdwt.setFont(fs);
        jdwt.setBorder(border);


        jtdwt.setBounds(516,450,51,40);
        panel.add(jtdwt);
        jtdwt.setText(DWT);
        jtdwt.setBorder(border);

        jgrt.setBounds(567,425,51,25);
        panel.add(jgrt);
        jgrt.setFont(fs);
        jgrt.setBorder(border);




        jtgrt.setBounds(567,450,51,40);
        panel.add(jtgrt);
        jtgrt.setText(Grt);
        jtgrt.setBorder(border);


        jnrt.setBounds(618,425,50,25);
        panel.add(jnrt);
        jnrt.setFont(fs);
        jnrt.setBorder(border);




        jtnrt.setBounds(618,450,50,40);
        panel.add(jtnrt);
        jtnrt.setText(Nrt);
        jtnrt.setBorder(border);


        jbhp.setBounds(668,425,47,25);
        panel.add(jbhp);
        jbhp.setFont(fs);
        jbhp.setBorder(border);




        jtbhp.setBounds(668,450,47,40);
        panel.add(jtbhp);
        jtbhp.setText(Bhp);
        jtbhp.setBorder(border);



        jservice.setBounds(15,550,700,25);
        panel.add(jservice);
        jservice.setFont(fe);
        jservice.setBorder(border);
        jservice.setOpaque(true);
        jservice.setForeground(Color.white);
        jservice.setBackground(Color.blue);


        jrank.setBounds(15,575,236,25);
        panel.add(jrank);
        jrank.setFont(fs);
        jrank.setBorder(border);



        jtrank.setBounds(15,600,236,25);
        panel.add(jtrank);
        jtrank.setText(Rank);
        jtrank.setBorder(border);



        jfrom.setBounds(251,575,232,25);
        panel.add(jfrom);
        jfrom.setFont(fs);
        jfrom.setBorder(border);



        jtfrom.setBounds(251,600,232,25);
        panel.add(jtfrom);
        jtfrom.setText(From);
        jtfrom.setBorder(border);


        jto.setBounds(483,575,232,25);
        panel.add(jto);
        jto.setFont(fs);
        jto.setBorder(border);




        jtto.setBounds(483,600,232,25);
        panel.add(jtto);
        jtto.setText(to);
        jtto.setBorder(border);

        print.setBounds(500,640,100,25);
        panel.add(print);
        print.addActionListener(this);

        exit.setBounds(620,640,100,25);
        panel.add(exit);

        exit.addActionListener(this);

        Font fo = new Font("Arial",Font.BOLD ,20);

output.setBounds(15,675,700,100);
output.setFont(fo);
panel.add(output);


        img21.setBounds(0,900,730,60);panel.add(img21);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==exit){
            SearchPage sp = new SearchPage();
            sp.search();
            frame.dispose();
        }
        if(e.getSource()==print){
            print.setVisible(false);
            exit.setVisible(false);
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Data");
            job.setPrintable(new Printable(){

                @Override
                public int print(Graphics pg, PageFormat pf, int pageNum) throws PrinterException {

                    pf.setOrientation(PageFormat.LANDSCAPE);

                    if(pageNum>0){

                        return Printable.NO_SUCH_PAGE;

                    }

                    java.awt.Graphics2D g = (java.awt.Graphics2D)pg;

                    g.translate(pf.getImageableX(), pf.getImageableY());

                    g.scale(0.8,0.8);

                    panel.paint(g);
                    

                    return Printable.PAGE_EXISTS;   
                }
                
            });

            boolean ok = job.printDialog();
            if(ok){
                try {
                    job.print();
                } catch (Exception n) {
                    System.out.println(n.getMessage());
                }
                SearchPage sp = new SearchPage();
                sp.search();
            }

        }
        
    }
}



