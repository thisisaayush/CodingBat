//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
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
