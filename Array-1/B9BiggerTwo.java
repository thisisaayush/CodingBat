//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program has 2 arrays of length 2. It will return an array whose sum of elements is the largest.
//B9BiggerTwo([1, 2], [3, 4]) → [3, 4]
//B9BiggerTwo([3, 4], [1, 2]) → [3, 4]
//B9BiggerTwo([1, 1], [1, 2]) → [1, 2]
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
