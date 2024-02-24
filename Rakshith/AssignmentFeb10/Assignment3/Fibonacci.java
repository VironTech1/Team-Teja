package Assignment3;

public class Fibonacci {
    public static void main(String[] args) {
        // Series  0,1, 1,2,3,5,8
        int firstValue = 0;
        int secondValue = 1;
        int n=11;

        for (int i = 0; i < n; i++) {
            System.out.print(firstValue +" ");// print firstValue always

            int nextTerm = firstValue + secondValue; //0+1= 1-- 2
            firstValue = secondValue;// 1 -- 1
            secondValue = nextTerm;//1-- 2



        }

    }
}
