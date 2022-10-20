import java.util.Scanner;

public class PrimeNumber 
{
	//print all prime numbers upto given number N
	public static Boolean isPrime(int n)
	{
		int i;
		if(n<=1)
		{
			return false;
		}
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void printPrime(int n)
	{
		for (int i = 2; i <= n; i++) 
		{
			if (isPrime(i))
				System.out.print(i + " ");
		}
	}
	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		Boolean result=isPrime(num);
		printPrime(num);
	}
}
