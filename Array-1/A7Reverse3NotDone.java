//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Array1;

public class A7_Reverse3 {
    public static int[] reverse3(int[] nums){
        int[] array = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            array[i] = nums[nums.length - 1 - i];
        }
        return array;
    }
}
