//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
/*
This program returns the number of 9's in the array.
arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
*/
package WarmUp2;
public class A8ArrayCount9 {
    public static int arrayCount9(int[] nums){
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 9){
                count++;
            }
        }
        return count;
    }
}
