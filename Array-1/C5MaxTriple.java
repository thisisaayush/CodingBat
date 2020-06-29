//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program has an array of ints of odd length, look at the first, last, and middle values 
//in the array and return the largest. The array length will be a least 1.
package Array1;
public class C5MaxTriple {
    public int maxTriple(int[] nums) {
            //Given array nums has odd length.
            //We have to return the largest element from first, last, and middle values of the array.
        int midLen = nums.length / 2;//it is to find the middle index of an array.
        int max = nums[0];

        if(max <= nums[midLen]){
            max = nums[midLen];
            //Here, the value of max is updated if the condition is met.
        }
        //Here, the updated value of max is checked with the given condition.
        if(max <= nums[nums.length - 1]){
            max = nums[nums.length - 1];
        }
        return max;
    }
}
