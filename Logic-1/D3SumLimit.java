//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//The program has 2 non-negative ints, a and b, return their sum, so long 
//as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b. 
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
