//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class C7MaxMode5 {
    public int maxMod5(int a, int b) {
            if(a == b){
                return 0;
            }
            else if( a % 5 == b % 5){
                if(a > b) {
                    return b;
                }
                else{
                    return a;
                }
            }
            else if(a > b){
                return a;
            }
            return b;
    }
}
