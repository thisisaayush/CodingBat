//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic2;
public class A1MakeBricks {
    public boolean makeBricks(int small, int big, int goal) {
                if(goal > 5 * big + small){
                    return false;
                }
                else if(goal % 5 > small){
                    return false;
                }
                return true;
    }
}
