//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program has an array of ints of odd length, return a new array length 3 containing
//the elements from the middle of the array. The array length will be at least 3.
package Array1;
public class C4MidThree {
    public int[] midThree(int[] nums) {
            //Given array nums has odd length and at least has length 3.
            //We have to return middle three element of an array.
            //Creating new array of length 3.
        int[] newArray = new int[3];
        int n = nums.length / 2 - 1;
        for(int i = 0 ; i < newArray.length ; i++){
            newArray[i] = nums[n + i];
        }
       return newArray;
    }
}
