//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program has an array of length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
//fix23([1, 2, 3]) → [1, 2, 0]
//fix23([2, 3, 5]) → [2, 0, 5]
//fix23([1, 2, 1]) → [1, 2, 1]
package Array1;
public class B7Fix23 {
    public int[] fix23(int[] nums) {
        //Since the length of a given array is 3. We can create new array to check the condition:
        int[] newArray = {nums[0],nums[1],nums[2]};
        for(int i = 0 ; i < nums.length - 1; i++){
            if(newArray[i] == 2 && newArray[i+1] == 3){
                newArray[i+1] = 0;
            }
        }
        return newArray;
    }
}
