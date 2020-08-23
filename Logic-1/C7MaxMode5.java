//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//The program has two int values, return whichever value is larger.
//However if the two values have the same remainder when divided by 5,
//then the return the smaller value. However, in all cases, if the two values are the same, return 0.
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
