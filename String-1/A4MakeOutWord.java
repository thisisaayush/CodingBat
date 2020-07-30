//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program for instance returns an "out" string length 4, such as "<<>>", and a word, a new
//string where the word is in the middle of the out string, e.g. "<<word>>"
package String1;
public class A4MakeOutWord {
    public static String makeOutWord(String out, String word){
        return out.substring(0,2) + word + out.substring(2,4);
    }
}
