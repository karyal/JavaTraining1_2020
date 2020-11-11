package gui;

//Import Libraries
import javax.swing.JFrame; //Windows
import javax.swing.JLabel; //Lable
import javax.swing.JTextField; //Text Box
import javax.swing.JButton; //Button
import java.awt.FlowLayout;//Layout Manager

import java.awt.event.ActionListener;//Event Handler - Button Click
import java.awt.event.ActionEvent;

public class GUITest4 implements ActionListener{//Event Handle
  //Decalre
  JFrame frame;
  JButton btn_close;
  
  public GUITest4(){
    frame = new JFrame();
    frame.setTitle("Calculator");
    frame.setResizable(false);
    frame.setSize(175, 220);
    
    //Initalize
    btn_close = new JButton();      
    
    btn_close.addActionListener(this); //Event Register
    
    btn_close.setText("CLOSE");
    
    frame.setLayout(new FlowLayout());
    frame.add(btn_close);//Button1
    
    frame.setVisible(true);
  }
  
  public void actionPerformed(ActionEvent ae){
    if (ae.getSource()==btn_close){
      System.exit(0);//Application Exit
      //System.out.println("Hello");
    }
  }
  
  public static void main(String []agrs){
    new GUITest4();    
  }
}