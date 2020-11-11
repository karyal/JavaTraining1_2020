package core;

public class VariableTest
{//Class Start
  int x = 9; //is local variable for VariableTest class but global for main method 
  static int z = 100; //Global static variable  
  //Instance variable //Global variable
  //Varaible declare and initialize //inside of class but outside of main method
  
  public static void main(String []args)
  {//main start
    int y=20; //Local variable    
    System.out.println(y);
    System.out.println(z); //static function can access only static varaible
    System.out.println(new VariableTest().x);//non-static variable //Preferred techniques
  }//mail end      
  
}//Class End