//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
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
