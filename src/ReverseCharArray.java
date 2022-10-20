public class ReverseCharArray 
{
	public static void main(String[] args) 
	{
		//Write a Java Program to reverse an array
		char[] s= {'a','b','c','d','e'};
		int end=s.length-1;
		int start=0;
		while(start<end)
		{
			char c=s[start];
			s[start]=s[end];
			s[end]= c;
			start++;
			end--;
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.print(" "+s[i]);
		}
	}
}
