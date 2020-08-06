//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic2;
//Here, you have to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) 
//and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
//Example:
//makeBricks(3, 1, 8) → true
//makeBricks(3, 1, 9) → false
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
