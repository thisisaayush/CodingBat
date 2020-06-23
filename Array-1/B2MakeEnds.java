//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This code returns a new array of length 2 containing the first and last elements from the original array.
package Array1;
public class B2MakeEnds {
    public int[] makeEnds(int[] nums) {
        //Since, we assumed that the length is at least 1.
        int[] makeEnd = {nums[0], nums[nums.length - 1]};
        return makeEnd;
    }
}
