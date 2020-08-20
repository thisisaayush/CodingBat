//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
/*
We are having a party with amounts of tea and candy. Return the int outcome of the party
encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5.
However, if either tea or candy is at least double the amount of the other one, the party is great (2). 
However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
*/
package Logic1;
public class B7TeaParty {
    public static int teaParty(int tea, int candy) {
       if(tea < 5 || candy < 5){
           return 0;
       }
       else if((tea >= 5 || candy >= 5) && (tea >= candy * 2 || candy >= tea * 2)){
           return 2;
       }
       return 1;
    }
}
