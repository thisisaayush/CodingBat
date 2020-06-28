//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This progam has an array of even length. It will return new array of length 2, whose elements are the middle elements of previous array.
package Array1;
public class C1MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        //Given the array nums length is even.
        //New array of length 2.
        int[] newArray = new int[2];
        int n = nums.length / 2;
        newArray[0] = nums[n - 1];
        newArray[1] = nums[n];
        return newArray;
    }
}
