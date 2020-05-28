package String1;
public class D6WithoutX2 {
    public static String withoutX2(String str){
        if(str.isEmpty()){
            return str;
        }
        else if(str.length() == 1 && str.charAt( 0 ) == 'x'){
            return "";
        }
        else if((str.charAt( 0 ) == 'x') && (str.charAt( 1 ) == 'x')){
            return str.substring( 2 );
        }
        else if(!(str.charAt( 0 ) == 'x') && !(str.charAt( 1 ) == 'x')){
            return str;
        }
        else if((str.charAt( 0 ) == 'x') && !(str.charAt( 1 ) == 'x')){
            return str.substring( 1 );
        }
        else if(!(str.charAt( 0 ) == 'x') && (str.charAt( 1 ) == 'x')){
            return str.substring( 0,1 ) + str.substring( 2 );
        }
        return str;
    }
}
