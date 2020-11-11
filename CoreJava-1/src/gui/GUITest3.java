package gui;

//Import Libraries
import javax.swing.JFrame; //Windows
import javax.swing.JLabel; //Lable
import javax.swing.JTextField; //Text Box
import javax.swing.JButton; //Button
import java.awt.FlowLayout;//Layout Manager

public class GUITest3{
  //Decalre
  JFrame frame;
  JLabel lbl_fn;
  JLabel lbl_sn;
  JLabel lbl_res;
  JTextField txt_fn;
  JTextField txt_sn;
  JTextField txt_res;
  JButton btn_add;
  JButton btn_close;
  
  public GUITest3(){
    frame = new JFrame();
    frame.setTitle("Calculator");
    frame.setResizable(false);
    frame.setSize(175, 220);
    
    //Initalize
    lbl_fn=new JLabel();
    lbl_sn=new JLabel();
    lbl_res=new JLabel();
    
    txt_fn = new JTextField();
    txt_sn = new JTextField();    
    txt_res = new JTextField();    
    
    btn_add = new JButton();
    btn_close = new JButton();      
    
    txt_fn.setColumns(10);
    txt_sn.setColumns(10);
    txt_res.setColumns(10);
    
    lbl_fn.setText("First No : ");
    lbl_sn.setText("Second No : ");
    lbl_res.setText("Result : ");
    
    btn_add.setText("ADD");
    btn_close.setText("CLOSE");
    
    frame.setLayout(new FlowLayout());
    frame.add(lbl_fn);//Label-1        
    frame.add(txt_fn);//TextBox-1
    frame.add(lbl_sn);//Label-2
    frame.add(txt_sn);//TextBox-2    
    frame.add(btn_add);//Button1
    frame.add(lbl_res);//Label-2
    frame.add(txt_res);//TextBox-1
    frame.add(btn_close);//Button1
    
    frame.setVisible(true);
  }
  public static void main(String []agrs){
    new GUITest3();    
  }
}