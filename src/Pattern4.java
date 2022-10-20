import java.util.Scanner;

public class Pattern4 
{
	/* Print Pattern
   1
  121
 12321
1234321
 12321
  121
   1
	*/
	public static void printPattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=n-1;i++)
		{   
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(j);
			}
			for(int j=n-i-1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter no. of lines");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		printPattern(num);
	}

}