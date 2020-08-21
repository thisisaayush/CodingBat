//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
/*
The program has three ints, a b c, return true if it is possible to add two of the ints to get the third.
twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
*/
package Logic1;
public class C1TwoAsOne {
    public boolean twoAsOne(int a, int b, int c) {
        int a1 = b + c;
        int b1 = a + c;
        int c1 = a + b;

        if(a == a1 || b == b1 || c == c1){
            return true;
        }
        return false;
    }
}
