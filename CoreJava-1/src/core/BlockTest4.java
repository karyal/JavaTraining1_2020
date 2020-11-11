package core;

//Scope of Variable - Local and Global
// Life-time of variable - Existance of Varaible on Memory

class BlockTest4 {
  int n1=20; //Global variable within class //Global Varible have Global Scope (Visibility)
  
  public static void b1(){
    int n1 = 200; //Local variable
    System.out.println(n1);
  }
  
  public void b2(){
    int n1 = 300;//Local variable
    System.out.println(n1);//Local variable
    System.out.println(new BlockTest4().n1);//Global variable
  }
  
  public void b3(){
    System.out.println(n1);//Global variable
  }
  public static void main(String []args){
    b1(); //static method call
    new BlockTest4().b2();//Non Static Method call
    new BlockTest4().b3();//Non Static Method call
  }  
}