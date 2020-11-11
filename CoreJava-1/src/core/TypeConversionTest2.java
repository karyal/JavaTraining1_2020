package core;

public class TypeConversionTest2{
 
//Type Cast
  //Auto Cast - Widenning - Upgrade (byte->short->....double)
  //Type Casting - Narrowing - Downgrade (double->byte)
  
//Type Conversion
  //String -> Numeric
  //Numeric -> String
  
  static{
    byte bn = 123; // 8 bits
    double dn = bn; //64 bits - Auto cast 
    System.out.println(dn);
    
    double dn1 = 129.4567;
    byte bn1 = (byte) dn1;//-128 to 127 Cast
    System.out.println(bn1);
    
    //String to byte (String -> Number) [byte (data type) -> Byte (Class)]
    String str = "120";
    //byte bn2 = str; //Error: incompatible types: java.lang.String cannot be converted to byte    
    byte bn2 = Byte.parseByte(str); //String to byte
    short sn2 = Short.parseShort(str); //String to short
    int in2 = Integer.parseInt(str);//String to Integer
    long ln2 = Long.parseLong(str);//String to Long
    float fn2 = Float.parseFloat(str);//String to Float
    
    double dn2 = Double.parseDouble(str);//String to Double
    
    System.out.println(bn2);    
    System.out.println(sn2);
    System.out.println(in2);
    System.out.println(ln2);
    System.out.println(fn2);
    System.out.println(dn2);
    
    //Numric to String
    double dn3 = 123456.78901;
    String str3 = Double.toString(dn3);//Double
    System.out.println(str3);
    
    //String to Numeric
    //ObjectClass.parseType(String)
    
    //Numric to String
    //ObjectClass.toString(Numeric)
    
  }
  
  public static void main(String []args){
    
  }  
  
}