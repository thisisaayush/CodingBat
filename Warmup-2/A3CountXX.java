//Author: Aayush Shahi Thakuri
//University: Minnesota State University, Mankato
package WarmUp2;
public class A3CountXX {
    public static void main(String[] args) {
        System.out.println(countXX("hexxlxlxddxxxs,xxx"));
    }
    public static int countXX(String str){
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx")) count++;
        }
        return count;
    }
}
