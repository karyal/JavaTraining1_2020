package core;

public class EnumTest2{
 public enum Level {
    HIGH,
    MEDIUM,
    LOW
} 
 public static void main(String []args){
  Level level = Level.HIGH;
  System.out.println(level);
 }
}