//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program is about 3 int values, a b c, which returns their sum. However, if one of the values is 13 then it does not
//count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
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
