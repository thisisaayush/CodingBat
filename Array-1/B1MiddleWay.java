//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This code returns a new array that contains the middle element of two given arrays of length 3.
package Array1;
public class B1MiddleWay {
    public static int[] middleWay(int[] a, int[] b){
        //length of arrays a and b is 3. So, their middle element is at index at 1.
        int[] middleElement = {a[1], b[1]};
        return middleElement;
    }
}
