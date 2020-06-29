//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program has 2 int arrays, a and b, of any length, return a new array with the first 
//element of each array. If either array is length 0, ignore that array.
package Array1;
public class C9Front11 {
    public int[] front11(int[] a, int[] b) {
        int[] newArray = new int[0];//New array with initial length 0.
        if(a.length >= 1 && b.length >= 1){
            newArray = new int[2];
            newArray[0] = a[0];
            newArray[1] = b[0];
        }
        else if(a.length == 0 && b.length >= 1){
            newArray = new int[1];
            newArray[0] = b[0];
        }
        else if(a.length >= 1 && b.length == 0){
            newArray = new int[1];
            newArray[0] = a[0];
        }
        return newArray;
    }
}
