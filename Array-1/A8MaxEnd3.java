//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This code compares the value between first index of an array and last index of an array, the max value thus obtained 
//from the comparison is used to replace all the values of an array.
package Array1;
public class A8MaxEnd3 {
    public static int[] maxEnd3(int[] nums){
     if(nums.length > 1) {
         if (nums[0] > nums[nums.length - 1]) {
             int max[] = {nums[0], nums[0], nums[0]};
             return max;
         }
     }
         int max[] = {nums[nums.length - 1], nums[nums.length - 1], nums[nums.length - 1]};
         return max;

    }
}
