//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Array1;
public class B5MakeLast {
    public int[] makeLast(int[] nums) {
            int[] newArray = new int [nums.length * 2];
            newArray[newArray.length - 1] = nums[nums.length - 1];
            return newArray;
    }
}
