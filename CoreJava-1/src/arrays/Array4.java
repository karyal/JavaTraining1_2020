package arrays;
/**
 * Write a description of class Array4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array4
{
    public static void main(String args[]){
        int my_nums[] = {1, 5, 2, 6, 3};
        System.out.println("Source");
        for(int i=0; i<my_nums.length; i++){
            System.out.println(my_nums[i]);
        }
        Functions.sort_nums(my_nums);
        System.out.println("After Sort");
        for(int i=0; i<my_nums.length; i++){
            System.out.println(my_nums[i]);
        }
    }
}