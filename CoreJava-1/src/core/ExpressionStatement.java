package core;

public class ExpressionStatement{
  public static void main(String []args){
    //Expression - Valid term of java code
    //1     2        3  4  5
    int     num1 =  20 ; //declare and initialize value on variable
    System.out.println(num1); //Display value of num1     
    
    //Statement
    //Expression1 , Expression2, ......, ExpressionN;  //Specific Task Perfoem
    
    //Statement Types
    //1. Declarative statement
    int x=1, y=9, z; //variable declare //Object delcare
    
    //2. Arithmetic statement
    z = x+y; //+, -, *, /
    System.out.println(z);
    
    //3. Control Statement
    int n1=10, n2=20;    
    //character, keyword, variable(s)    
    //(n1>n2) Control statement/conditional statement
    if (n1>n2){
      System.out.println(n1);
    }
    else{
      System.out.println(n2);
    }        
  }
}