//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Array1;

import javax.naming.PartialResultException;

public class A2SameFirstLast {
    public static boolean sameFirstLast(int[] nums){
        if(nums.length < 1){
            return false;
        }
        return (nums[0] == nums[nums.length - 1]);
    }
}
