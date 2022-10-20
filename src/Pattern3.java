import java.util.Scanner;

public class Pattern3 
{
	/*Print Pattern
		12344321
		123**321
		12****21
		1******1
	 */
	public static void printPattern(int num)
	{
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num-i+1;j++)
			{
				System.out.print(j);
			}
			for(int j=1;j<=2*i-2;j++)
			{
				System.out.print("*");
			}
			for(int j=num-i+1;j>=1;j--)
			{
				System.out.print(j);
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
