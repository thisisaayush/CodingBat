package Array2;
//This program returns the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7.
public class A5_Sum67 {
    public static void main(String[] args) {
        int array[] = {1,5,6,3,7,9};
        System.out.println("Sum67: " + sum67( array ));
    }
    public static int sum67(int[] array){
        int sum = 0;

        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == 6){
                while (array[i] != 7){
                    i++;
                }
            }
            else {
                sum = sum + array[i];
            }
        }
        return sum;
    }
}
