//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
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
