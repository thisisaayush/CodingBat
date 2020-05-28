//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Array1;
public class B4No23 {
    public boolean no23(int[] nums) {
        if (nums.length == 2) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 2 || nums[i] == 3) {
                    return false;
                }
            }
        }
        return true;
    }
}
