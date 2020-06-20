//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato

//this code checks whether the first and the last element of an array is 6 or not. If it is 6, it returns true value.
package Array1;
public class A1FirstLast6 
{
    public static boolean firstLast6(int[] nums){
        if(nums[0] == 6 || nums[nums.length - 1] == 6 ){
            return true;
        }
        return false;
    }
}
