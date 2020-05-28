//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class A1CigarParty {
    public static boolean cigarParty(int cigars, boolean isWeekend){
        if(isWeekend){
            return cigars >= 40;
        }
        else if(!isWeekend){
            return (cigars >= 40 && cigars <= 60);
        }
        return false;
    }
}
