package core;

public class TypeConversionTest{
  
  static   {
    
    byte bn = 20; //declare and initialize
    short sn = bn; //value of bn assign to sn // byte -> short - Upgrading - Auto-cast
    int in = sn; // short -> int - Upgrade - Auto-cast
    long ln = in; //int - > long - Upgrade - Auto-cast
    float fn = ln; //long ->float - Upgrade - Auto-cast
    double dn = fn; //float -> doouble - Upgrade - Auto-cast    
    System.out.println(dn);
    
    // 8 bits,                                       ,64 bits    
    // byte->short->int->long->float->double - Auto conversion (implicit conversion)
    
    double dn1 = 129.6789; //64 bits
    float fn1 = (float) dn1;//32 bits   - Type Cast - Down-grade /Narrowing 
    long ln1 = (long) fn1; //64 bits
    int in1 = (int) ln1; //32 bits
    short sh1 = (short) in1; //16 bits //12346
    byte bn1 = (byte) sh1; //8 bits
    System.out.println(bn1);
    
  }
  
  public static void main(String []args){
    
  }
}