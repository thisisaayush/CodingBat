//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program has an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
package Array1;
public class C3SwapEnds {
    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }
}
