package core;
/**
 * CalculatorV2.
 *
 * @author (Krishna)
 * @version (V002)
 */
import basic_io.*;

public class CalculatorV2
{
    public static void main(String []args) throws Exception{  
        //Calculator V2
        
        //declare        
        byte choice;  
        int n1, n2;
        
        for(;;){
            //Input 
            System.out.println("Main Menu");
            System.out.println("1. Addition");
            System.out.println("2. Difference");
            System.out.println("3. Product");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (0->Exit) : ");
            choice = BasicIO.readByte();
            if (choice == 0){
                System.out.println("Bye!");
                System.exit(0);
            }
            else if(choice == 1){
                //do add
                //System.out.println("Do add");
                System.out.print("Enter first no : ");
                n1 = BasicIO.readInteger() ;
                System.out.print("Enter second no : ");
                n2 = BasicIO.readInteger();
                CalculatorV1 c1 =  new CalculatorV1(n1, n2);
                c1.doSum();
                System.out.println("Result : "+c1.getResult());
            }
            else if(choice == 2){
                //do add
                System.out.print("Enter first no : ");
                n1 = BasicIO.readInteger() ;
                System.out.print("Enter second no : ");
                n2 = BasicIO.readInteger();
                CalculatorV1 c1 =  new CalculatorV1(n1, n2);
                c1.doDiff();
                System.out.println("Result : "+c1.getResult());
            }
            else if(choice == 3){
                //do add
                System.out.print("Enter first no : ");
                n1 = BasicIO.readInteger() ;
                System.out.print("Enter second no : ");
                n2 = BasicIO.readInteger();
                CalculatorV1 c1 =  new CalculatorV1(n1, n2);
                c1.doPrd();
                System.out.println("Result : "+c1.getResult());
            }
            else if(choice == 4){
                //do add
                System.out.print("Enter first no : ");
                n1 = BasicIO.readInteger() ;
                System.out.print("Enter second no : ");
                n2 = BasicIO.readInteger();
                CalculatorV1 c1 =  new CalculatorV1(n1, n2);
                c1.doDiv();
                System.out.println("Result : "+c1.getResult());
            }
            else if(choice == 5){
                //do add
                System.out.print("Enter base no : ");
                n1 = BasicIO.readInteger() ;
                System.out.print("Enter exponent no : ");
                n2 = BasicIO.readInteger();
                CalculatorV1 c1 =  new CalculatorV1(n1, n2);
                c1.doPower();
                System.out.println("Result : "+c1.getResult());
            }
            else{
                System.out.println("Option value out of range. Please enter 0-5");
            }
        }
    }
}