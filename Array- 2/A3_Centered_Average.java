package Array2;
//This program prints out the average of all int elements of a given array.
//Except ignoring the largest and smallest values in the array. If there are multiple copies 
//of the smallest value, ignore just one copy, and likewise for the largest value.
public class A3_Centered_Average {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Centered average: " + average( array ));
    }
    public static double average(int array[]){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < array.length ; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
            sum = sum + array[i];
        }
        int len = array.length - 2;
        double avg =(double) (sum - max - min) / len ;
        return avg;
    }
}
