package arrays;
/**
 * Write a description of class Arrays2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import basic_io.*;
public class Arrays2
{
    static int COLS = 5;
    static int ROWS = 2;
    static int PAGES = 2;
    
    public static void main(String []args) throws Exception{
        int n; //Cell
        int nums[]=new int[COLS]; //Cols
        int nums2[][] = new int [ROWS][COLS]; //Decalre and initialize
        /*
        //Assign value
        nums2[0][0]=5;
        nums2[0][1]=9;
        nums2[0][2]=8;
        nums2[0][3]=7;
        nums2[0][4]=3;
        
        nums2[1][0]=8;
        nums2[1][1]=7;
        nums2[1][2]=1;
        nums2[1][3]=2;
        nums2[1][4]=0;
        
        //Access value        
        //System.out.println(nums2[0][0]);
        
        //Reading values for 2D Array
        for(int row=0; row<ROWS; row++){//0-1 = 2
            for(int col=0; col<COLS; col++){//0-4 = 5
                System.out.print("Enter value for row = "+row+", col = "+col);
                nums2[row][col] = BasicIO.readInteger();
            }
        }
        
        //Displaying values for 2D Array
        for(int row=0; row<ROWS; row++){//0-1 = 2
            for(int col=0; col<COLS; col++){//0-4 = 5                
                System.out.println(nums2[row][col]);
            }
        }
        */
       
        int nums3[][][] = new int [3][2][2];
        //[] page [] rows []cols
        
        nums3[0][0][0] = 3;
        //System.out.println(nums3[0][0][0]);
        
        //Decalre 
        //int nums4[];//cols
        //int nums4[][];//[rows] [cols]
        int nums4[][][];//[page][rows][cols]
        nums4 = new int[2][2][3];
        
        nums4[0][0][0]=3;
        System.out.println(nums4[0][0][0]);
        //Reading
        for (int page=0; page<2; page++){
            for(int row=0; row<2; row++){
                for(int col = 0; col<3; col++){
                    nums4[page][row][col]=BasicIO.readInteger();
                }
            }
        }
        
        //Displaying
        //Using Loop        
    }
}
