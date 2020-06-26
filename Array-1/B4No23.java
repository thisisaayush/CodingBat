//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//The program return true if an array does not contain element 2 or 3.
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
