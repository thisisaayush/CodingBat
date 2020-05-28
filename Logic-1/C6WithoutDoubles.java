//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class C6WithoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if((die1 == 6 || die2 == 6) && noDoubles ){
            return 7;
        }
            else  if(die1 == die2 && noDoubles){
            return die1 + die2 + 1;
        }
            return die1 + die2;
    }
}
