//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program will double the length of an array and replaces all the element of an array to 0 besides the element at last index of an array. 
//Element at the last index will be same as the original element.
package Array1;
public class B5MakeLast {
    public int[] makeLast(int[] nums) {
            int[] newArray = new int [nums.length * 2];
            newArray[newArray.length - 1] = nums[nums.length - 1];
            return newArray;
    }
}
