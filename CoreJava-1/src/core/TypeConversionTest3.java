package core;

public class TypeConversionTest3{
  
  static{
    //Numeric to String
    byte bn1 = 125;
    byte bn2 = 0;
    String str1 = "";
    System.out.println(bn1);
    System.out.println(str1);    
    // byte - Data type - Type
    // Byte - Object type - Class
    //str1 = bn1; //Auto-Conversion-Not possible | Force-Conversion
    str1 =Byte.toString(bn1);
    System.out.println(str1);
    //bn2 = str1; //incompatible types: java.lang.String cannot be converted to byte
    bn2 = Byte.parseByte(str1);
    System.out.println(bn2);
    
  }
  
  public static void main(String []args){}
  
}