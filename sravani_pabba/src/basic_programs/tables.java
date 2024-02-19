package basic_programs;

public class tables {
	public static void main(String[] Args) {
		int p=1,i,j,result=1;
		System.out.println("To print mathematical numbers from 1 to 10");
		for(i=1;i<=10; i++) 
		{
			System .out.println("****** " + i + " Table is *******");
			for(j=1;j<=20; j++) 
			{
				result = i * j;
				System .out.println( i + "*" + j + "=" + result);
				
			}
		}
			
		}

}
