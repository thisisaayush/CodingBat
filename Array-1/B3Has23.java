//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program returns true value if any array has element 2 or 3.
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
