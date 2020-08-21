//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
/*
The program has three ints, a b c, return true if b is greater than a, 
and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.
inOrder(1, 2, 4, false) → true
inOrder(1, 2, 1, false) → false
*/
package Logic1;
public class C2InOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if(b > a && c > b && !bOk){
            return true;
        }
        else if(c > b && bOk){
            return true;
        }
        return false;
    }
}
