//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class C8RedTicket {
    public int redTicket(int a, int b, int c) {
            if(a == 2 && b == 2 && c == 2){
                return 10;
            }
            else if(a == b && a == c){
                return 5;
            }
            else if(b != a && c != a){
                return 1;
            }
            return 0;
    }
}
