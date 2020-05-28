//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package Logic1;
public class A2DateFashion {
    public int dateFashion(int you, int date) {
            if((you <= 2 || date <= 2)){
                return 0;
            }
            else if(you >= 8 || date >= 8){
                return 2;
            }
            else{
                return 1;
            }
    }
}
