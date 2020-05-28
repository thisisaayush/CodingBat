//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic2;
public class A3EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
                int diffA = Math.abs(a - b);
                int diffB = Math.abs(b - c);
                int diffC = Math.abs(c - a);
                int diff = a - b - c;

                if(diff == 0){
                    return true;
                }
                if((a == b || b == c || a == c)) {
                    return false;
                }
                    else if (diffA == diffB || diffA == diffC || (diffC == diffB)) {
                        return true;
                    }

                return false;
    }
}
