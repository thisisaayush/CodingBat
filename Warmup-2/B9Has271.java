//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
//This program has an array of ints,and it return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, 
//followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value. For instance:
//has271([1, 2, 7, 1]) → true
//has271([1, 2, 8, 1]) → false
package WarmUp2;
public class B9Has271 {
    public static boolean has271(int nums[]){
        for(int i = 0 ; i < nums.length - 2;i++){
            if(nums[i] == 2  && nums[i+1] == 7 && nums[i+2] == 1){
                return true;
            }
        }
        return false;
    }
}
