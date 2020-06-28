//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program has 2 arrays of any length. Return how many of the arrays have 1 as their first element.
package Array1;
public class B8Start1 {
    public int start1(int[] a, int[] b) {
        //Since, we are just checking the first element of two given arrays. We can simply use
        //element at index 0.
            if(a.length > 0 && b.length > 0){
                if(a[0] == 1 && b[0] == 1){
                    return 2;
                }
                else if(a[0] == 1 || b.length == 0){
                    return 1;
                }
                else if(b[0] == 1 || a.length == 0){
                    return 1;
                }
                return 0;

            }
            if(a.length > 0 && b.length == 0) {
                if(a[0] == 1) {
                    return 1;
                }
            }
            else if(b.length > 0 && a.length ==0){
                if(b[0] == 1) {
                    return 1;
                }
            }
            return 0;
    }
}
