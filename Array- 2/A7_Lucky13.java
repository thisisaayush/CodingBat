package Array2;

public class A7_Lucky13 {
    public static boolean lucky13(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == 1 || array[i] == 3){
                return false;
            }
        }
        return true;
    }
}
