//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program has 2 int arrays, each length 2, return a new array length 4 containing all their elements.
package Array1;
public class C2PlusTwo {
    public int[] plusTwo(int[] a, int[] b) {
            //Given two arrays have length 2.
            //Creating a new array of length 4.
        int[] newArray = new int[4];
        newArray[0]    = a[0];
        newArray[1]    = a[1];
        newArray[2]    = b[0];
        newArray[3]    = b[1];
        return newArray;
    }
}
