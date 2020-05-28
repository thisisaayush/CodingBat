//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
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
