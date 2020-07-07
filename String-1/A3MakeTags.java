//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
//This program is simple demonstration of HTML tags, it prints out the entered tag parameter and word parameter in the following
//formate:
//makeTags("i", "Yay") → "<i>Yay</i>"
//makeTags("i", "Hello") → "<i>Hello</i>"
package String1;
public class A3MakeTags {
    public static String makeTags(String tag, String word){
        return "<" + tag + ">" + word + "</"+ tag +">";
    }
}
