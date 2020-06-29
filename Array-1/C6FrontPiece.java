//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program has an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
package Array1;
public class C6FrontPiece {
    public int[] frontPiece(int[] nums) {
        //Creating a new array of length 2.
        int[] newArray = new int[2];
        if(nums.length >=2){
            for(int i = 0 ; i < newArray.length ; i++){
                newArray[i] = nums[i];
            }
            return newArray;
        }
        return nums;
    }
}
