//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Array1;
public class A1FirstLast6 {
    public static boolean firstLast6(int[] nums){
        if(nums[0] == 6 || nums[nums.length - 1] == 6 ){
            return true;
        }
        return false;
    }
}
