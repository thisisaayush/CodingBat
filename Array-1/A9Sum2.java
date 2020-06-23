//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This code returns the sum of first two int element of an array. If an array has only one element it returns that element
//and if an array is empty, it returns 0.
package Array1;
public class A9Sum2 {
    public static int sum2(int[] nums){
        if(nums.length < 2){
            if(nums.length == 0){
                return 0;
            }
            return nums[0];
        }
        return nums[0] + nums[1];
    }
}
