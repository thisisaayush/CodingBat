//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
/*
This program is about a squirrel party. It is successful when the number of cigars is between 40 and 60, inclusive. Unless 
it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party
with the given values is successful, or false otherwise.
*/
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
