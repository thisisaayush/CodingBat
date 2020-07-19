package Array2;

public class A4_Sum13 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9};
        int array1[] = {2,3,13,1};
        int arr[] = {};
        System.out.println("1: " + sum( array ));
        System.out.println("2: " + sum( array1 ));
        System.out.println("3: " + sum( arr ));
    }
    public static int sum (int array[]){
        int sum = 0;

        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == 13){
                i++;
            }
            sum = sum + array[i];
        }
        return sum;
    }
}
