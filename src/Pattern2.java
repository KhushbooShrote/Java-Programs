import java.util.Scanner;
public class Pattern2 
{  
	/* Print Pattern
		ABCD
		BCDE
		CDEF
		DEFG
	*/
	public static void printPattern(int num)
	{
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				System.out.print((char)(64+i+j-1));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter number of lines");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		printPattern(n);
	}
}
