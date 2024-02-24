java.util.Scanner sc = new java.util.Scanner(System.in);

class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


int n = sc.nextInt();
	    int col = n;
	    int rows = n;
	    for(int i =0; i<rows;i++){
	        for(int j=0; j<col; j++){
	            if(i==n/2 || j==n/2)
	                System.out.print(" * ");
	            else if((i == n/2 -1 || i == n/2 + 1) && (j == n/2-1 || j == n/2 + 1))
	                System.out.print(" * ");
	            else
	                System.out.print("   ");
	        }
	        System.out.println();
	    }
    }
}