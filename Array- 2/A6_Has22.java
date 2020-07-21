package Array2;

public class A6_Has22 {
    public static boolean has22(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == 2 && array[i + 1] == 2){
                return true;
            }
        }
        return false;
    }
}
