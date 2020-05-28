//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Array1;
public class B9BiggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        //We have given two arrays length 2.
        if((a[0] + a[1]) > (b[0] + b[1])){
            return a;
        }
        else if((a[0] + a[1]) < (b[0] + b[1])){
            return b;
        }
        return a;
    }

}
