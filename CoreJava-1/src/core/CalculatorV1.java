package core;
/**
 * Simple Calculator
 *
 * @author Krishna Aryal
 * @version V001
 */

public class CalculatorV1
{
    //Instance Variables
    int num1;
    int num2;
    int result;
    
    public CalculatorV1(){
        num1 = 0;
        num2 = 0;
        result = 0;
    }
    
    public CalculatorV1(int n1, int n2){
        num1 = n1;
        num2 = n2;
        result = 0;
    }
    //Getter
    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    }
    public int getResult(){
        return result;
    }
    //Setters
    public void setNum1(int n1){
        num1=n1;
    }
    public void setNum2(int n2){
        num2=n2;
    }    
    //Process
    public void doSum(){
        result = num1+num2;
    }
    public void doDiff(){
        result = num1-num2;
    }
    public void doPrd(){
        result = num1*num2;
    }
    public void doDiv(){
        result = num1/num2;
    }
    public void doPower(){
        result = (int) Math.pow(num1, num2);
    }
}