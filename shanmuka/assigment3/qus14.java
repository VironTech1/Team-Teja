package assigment3;
/*
1
12
123
1234
12345
 * 14. Print the "*" in above pattern

 */


 public class qus14 {
    public static void main(String[] args) {
        int rows =5;

        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    
}
