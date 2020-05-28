//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class A7Love6 {
    public boolean love6(int a, int b) {
        int sum = a + b;
        int diff = Math.abs(a - b);
            if(a == 6 || b == 6 ){
                return true;
            }
            else if (sum == 6){
                return true;
            }
            else if(diff == 6 ){
                return true;
            }
            return false;
    }
}
