//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic2;
public class A4LuckySum {
    public int luckySum(int a, int b, int c) {
            if(a == 13){
                return 0;
            }
            else if(b == 13){
                return a;
            }
            else if(c == 13){
                return a + b;
            }
            return a + b + c;
    }
}
