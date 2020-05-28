//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Array1;
public class B3Has23 {
    public static boolean has23(int[] nums){
        if(nums.length == 2){
            for(int i = 0 ; i < nums.length ; i++){
                if(nums[i] == 2 || nums[i] == 3){
                    return true;
                }
            }
        }
        return false;
    }
}
