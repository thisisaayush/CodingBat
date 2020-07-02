//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program is about 2 int values greater than 0, which returns whichever value is nearest to 21 without going over. Return 0 if they both go over.
package Logic2;
public class A8BlackJack {
    public int blackjack(int a, int b) {
        int diffA = 21 - a;
        int diffB = 21 - b;

        if( a > 21 && b > 21){
            return 0;
        }
        else if(a <= 21 && b <= 21){
            if(diffA < diffB){
                return a;
            }
            else return b;
        }
        else if(a <= 21){
            return a;
        }
        else {
            return b;
        }
    }
}
