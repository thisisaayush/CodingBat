//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp2;
public class B1ArrayFront9 {
    public static boolean arrayFront9(int[] nums){
      int len = nums.length;
      if(len > 4 )
          len = 4;
      for(int i = 0 ; i < len ; i++){
          if(nums[i] == 9 ){
              return true;
          }
      }
      return false;
    }
}
