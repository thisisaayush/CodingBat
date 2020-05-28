//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Array1;
public class A7Reverse3NotDone {
    public static int[] reverse3(int[] nums){
        int temp;
        for(int i = 0 ; i < nums.length ; i++){
            temp = nums[i];
            nums[nums.length - 1 - i] = nums[i];
            nums[nums.length - 1 - i] = temp;
        }
        return nums;
    }
}
