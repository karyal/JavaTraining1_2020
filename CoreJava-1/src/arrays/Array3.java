package arrays;
/**
 * Write a description of class Array3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import basic_io.*;

public class Array3
{
   //Array with function
   public static void main(String []args) throws Exception{
       //int nums[] = new int[5];
       //int nums[]={3, 5, 6, 7, 1, 6, 8, 2, 10}; //Decalre and Initialize
       //System.out.println(nums.length);
       //Functions.print_array(nums);//Passing array to function
       int total, min, max;
       int mynums[] = Functions.read_array(3);//return
       int n;
       boolean result;
       //Functions.print_array(mynums);//accept-pass       
       //Sum, Min, Max
       total = Functions.get_sum(mynums);
       min = Functions.get_min(mynums);
       max = Functions.get_max(mynums);
       
       System.out.println("Total : "+total);
       System.out.println("Min : "+min);
       System.out.println("Max: "+max);
       
       System.out.print("Enter number to search : ");
       n = BasicIO.readInteger();
       
       //Search
       result = Functions.search_num(mynums, n);
       if(result==true){
           System.out.println(n+" is found");
        }
        else{
           System.out.println(n+" not is found"); 
        }
        
       //Task  [1, 4, 3, 2, 5]
        // Calculate Average value.
        // Find specific number (times) : 1 -> true -> 2 times
        // Find specific number with indexes. : 1 -> true -> 0, 2 index.
       
        //Swap number.
        int a = 9;
        int b = 10;
        System.out.println(a+", "+b); //9, 10
        //swap (exchnage) numbers
        int tmp = a;
        a = b;
        b =tmp;
        System.out.println(a+", "+b); //10, 9jupyter
       
        // Sort array elements in Ascending Order/Descending Order [1, 4, 3, 2, 5] -> [1, 2, 3, 4, 5] - ASC | [5, 4, 3, 2, 1] - DSC
        // Read numbers from text file and process them. (sum, sort, min, max, average, search)
        
   }   
}