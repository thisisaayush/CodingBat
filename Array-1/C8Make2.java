//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Array1;
public class C8Make2 {
    public int[] make2(int[] a, int[] b) {
        int[] newArray = new int[2];//New array of length 2.
        if(a.length >= 2){
            newArray[0] = a[0];
            newArray[1] = a[1];
        }
        else if(a.length == 1){
            newArray[0] = a[0];
            newArray[1] = b[0];
        }
        else{
            newArray[0] = b[0];
            newArray[1] = b[1];
        }
        return newArray;
    }
}
