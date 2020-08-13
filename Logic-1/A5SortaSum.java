//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
//The program has  2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
//sortaSum(3, 4) → 7
//sortaSum(9, 4) → 20

public class A5SortaSum {
    public int sortaSum(int a, int b) {
            int sum = a + b;
            if(sum >= 10 && sum <= 19){
                return 20;
            }
            return sum;
    }
}
