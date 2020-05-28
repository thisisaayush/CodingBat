//Author: Aayush Shahi Thakuri
//Universtiy: Minnesota State University, Mankato
package String1;
public class D3DeFront {
public static String deFront(String str){
    if(!(str.charAt( 0 ) == 'a') && !(str.charAt( 1 ) == 'b')){
        return str.substring( 2 );
    }
    else if((str.charAt( 0 ) == 'a') && (str.charAt( 1 ) == 'b')){
        return str.substring( 0 );

    }
    else if(str.charAt( 0 ) == 'a' && !(str.charAt( 1 ) == 'b')){
        return str.substring( 0,1 ) + str.substring( 2 );
    }
    else {
        return str.substring( 1 );
        }
    }
}
