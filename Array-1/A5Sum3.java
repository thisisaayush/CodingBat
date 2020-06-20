//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Array1;
//this code returns the sum value of all the int elements of an int array.
public class A5Sum3 {
    public static int sum3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }
}
