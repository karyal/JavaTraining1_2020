package gui;
import javax.swing.JFrame; //import library

public class GUITest{
  JFrame frame; //Object of JFrame Class - declare
  
  public GUITest(){//Constructor method
    //int i=10; //decalre and initialize
    //int j; //declare
    //j=20; //assign    
    frame = new JFrame();//Initialize Object | 1
    frame.setSize(350, 150);  // | 3  250-width, 150-height
    frame.setTitle("First Window Test"); // | 4
    frame.setResizable(false); // | 5
    frame.setVisible(true);//call method/function | 2
  }
  
  public static void main(String []args){
    new GUITest();
  }
  
}
/*
  Task: Add Label, Text Box, Button
  how to add lable in JFrame?  
*/
  
/*
  Taks: 
- Data Types (Basic types)
- Object Types (byte Byte)
- Cast (byte -> double) (double->byte)
- Conversion - String to Numeric | Numeric to String
*/