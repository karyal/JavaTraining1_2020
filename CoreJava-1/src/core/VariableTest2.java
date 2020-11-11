package core;

public class VariableTest2
{
  int a=100; //Global
  static int b=56; //Static Global
  
  public void f1(){
    System.out.println(a);
  }
  
  public static void main(String []args){
    //int b=200;//Local
    System.out.println(b);//Static variable
    new VariableTest2().f1(); //Non-static global varaible
  }
  
}