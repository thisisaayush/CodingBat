//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic2;
public class A7CloseFar {
    public boolean closeFar(int a, int b, int c) {
            int diffAB = Math.abs(a - b);
            int diffBC = Math.abs(b- c);
            int diffAC = Math.abs(a - c);

            if(diffAB <= 1 && diffBC >= 2 && diffAB != diffAC){
                return true;
            }
            else if(diffAC <= 1 && diffBC >= 2 && diffAB != diffAC){
                return true;
            }
            return false;
    }
}
