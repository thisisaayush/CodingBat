//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program return true if an array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
package Array1;
public class B6Double23 {
    public boolean double23(int[] nums) {
            if(nums.length >= 2){
                if(nums[0] == 2 && nums[1] == 2){
                    return true;
                }
                else if(nums[0] == 3 && nums[1] == 3){
                    return true;
                }
                return false;
            }
            return false;
    }
}
