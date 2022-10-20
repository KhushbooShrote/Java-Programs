import java.util.Scanner;
public class ReverseNumber 
{   
	//Program to find Reverse of Number
	public static int revNum(int number)
	{
		int dig,reverse=0;
		while(number!=0)
		{
			dig=number%10;
			reverse=reverse*10+dig;
			number=number/10;
		}
		return reverse;
	}
	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int result=revNum(num);
		System.out.println("reverse number is="+result);
	}
}
