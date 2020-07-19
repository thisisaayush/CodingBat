package Array2;

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
