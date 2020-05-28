//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class D3SumLimit {
    public int sumLimit(int a, int b) {
            int sum = a + b;
            String s = String.valueOf(sum);
            String A = String.valueOf(a);
            int ls = s.length();
            int la = A.length();

            if(ls == la){
                return sum;
            }
            return a;
    }
}
