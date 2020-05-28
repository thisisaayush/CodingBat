//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp2;
public class B8NoTriples {
    public static boolean noTriplse(int[] nums){
        for(int i = 0 ; i < nums.length - 2 ; i ++){
            if(nums[i] == nums[i+1] && nums[i]==nums[i+2]){
                return false;
            }
        }
        return true;
    }
}
