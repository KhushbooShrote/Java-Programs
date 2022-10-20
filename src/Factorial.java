import java.util.Scanner;
public class Factorial 
{   
	// Print factorial of a number
	public static int checkFactorial(int n)
	{
		int i,fact=1;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int fact=checkFactorial(num);
		System.out.println("Factorial of number: "+fact);
	}
}
