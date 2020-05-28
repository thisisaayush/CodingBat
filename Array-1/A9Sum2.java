//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
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
