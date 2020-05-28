//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Array1;
public class A4CommonEnd {
    public static boolean commonEnd(int[] a, int [] b){
        if(a.length < 1 && b.length < 1){
            return false;
        }
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }
}
