//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if
//the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
package Array1;
public class C7Unlucky1 {
    public boolean unlucky1(int[] nums) {
            int len = nums.length;
            if(len >= 2){
                for(int i = 0 ; i < len - 1  ; i++)
                    if(nums[i] == 1 && nums[i + 1] == 3){
                        return true;
                    }
                    if(nums[len - 2] == 1 && nums[len - 1] ==3){
                        return true;
                    }
            }
                return false;

    }
}
