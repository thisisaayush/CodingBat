//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Array1;
//this code compares the first elements and the last elements of two int arrays and if it is equals it returns true value otherwise it 
//returns false value.
public class A4CommonEnd {
    public static boolean commonEnd(int[] a, int [] b){
        if(a.length < 1 && b.length < 1){
            return false;
        }
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }
}
