package core;

public class EnumTest1{
  
  public enum MyColors {RED, GREEN, BLUE}
  public enum JavaStudents{ANUJ, ASHISH}
  
  public enum Result{PASS, FAIL}
  
  public static void main(String []args){
    MyColors color1 = MyColors.RED;// GREEN BLUE
    
    JavaStudents student = JavaStudents.ANUJ;
    
    Result result = Result.FAIL;
    
    System.out.println(color1);
    System.out.println(student);
    System.out.println(result);
  }  
}