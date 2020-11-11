package core;
/**
 * Write a description of class CalculatorV3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import basic_io.*;
public class CalculatorV3
{
    public static void main(String []args) throws Exception{
        //Declare
        int choice;
        
        do{
            //Main Memnu
            System.out.println("-----------------------------------------------");
            System.out.println("Main Menu");
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Prd");
            System.out.println("4. Div");
            System.out.println("5. Rem");
            System.out.println("6. Pow");
            System.out.println("7. Sqrt");
            System.out.println("0. Exit");
            System.out.println("-----------------------------------------------");
            System.out.print("Enter your choice (0-> Exit) : ");
            choice = BasicIO.readInteger();
            System.out.println("-----------------------------------------------");
            
            switch(choice){
                case 0:
                    System.exit(0);
                case 1:
                    int n1, n2;
                    BasicIOV2.printMessage("Enter first no :");
                    n1 = BasicIO.readInteger();
                    BasicIOV2.printMessage("Enter second no :");
                    n2 = BasicIO.readInteger();
                    CalculatorV1 c1 = new CalculatorV1(n1, n2);
                    c1.doSum();
                    BasicIOV2.printMessage("Result", c1.getResult());
                    BasicIOV2.newLine();
                    break;
                default:
                    BasicIOV2.printMessage("Option out of range");                    
                    BasicIOV2.newLine();
            }
        }while(choice!=0);
        System.out.println("-----------------------------------------------");
    }
}