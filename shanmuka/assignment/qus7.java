package assignment;

//7. Write a Java program to find max and min number from an array


public class qus7 {
    public static void main(String[] args) {
        int[] numbers = {23,1,51,20,38,17};
        int maxNumber = findMaxNumber(numbers);
        int minNumber = findMinNumber(numbers);

        System.out.println("Maximum number : "+maxNumber);
        System.out.println("Minimum number : "+minNumber);

    }

        public static int findMaxNumber(int[] arr){
            int max = arr[0];
            for(int i=0;i<arr.length;i++){
                if (arr[i]>max) {
                    max = arr[i];
                }
            }
            return max;
        }

        public static int findMinNumber(int[] arr){
            int min = arr[0];
            for(int i=1;i<arr.length;i++){
                if (arr[i]<min) {
                    min = arr[i];
                    
                }
            }
            return min;
        }
}
