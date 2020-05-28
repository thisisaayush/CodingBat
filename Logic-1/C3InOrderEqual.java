//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class C3InOrderEqual {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
                if(a < b && b < c && !equalOk){
                    return true;
                }
                if(equalOk && a <= b && b <= c){
                    return true;
                }
                return false;
    }
}
