package Array2;

public class A2_Big_Difference {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Big difference: " + bigDifference( array ));
    }
    public static int bigDifference(int array[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < array.length ; i++){
            if(array[i] > max)//This if statement will used to find the maximum int element from the given array.
            {
                max = array[i];
            }
            if(array[i] < min)//
            {
                min = array[i];
            }
        }
        return max - min;
    }
}
