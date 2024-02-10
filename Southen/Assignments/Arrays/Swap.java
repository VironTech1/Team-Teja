package arrays.southen.com;

public class Swap {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            array[i] = array[3];
            array[3] = temp;
        }
        
        for(int val : array){
            System.out.println(val);
        }
    }
}

