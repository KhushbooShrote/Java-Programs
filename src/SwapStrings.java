public class SwapStrings 
{
	public static void main(String[] args)
	{
		//Write a Java Program to swap two given Strings.
		 String str1="Abhi";
		 String str2="Shashi";
		 str1=str1+str2;
		 str2=str1.substring(0,str1.length()-str2.length());
		 str1=str1.substring(str2.length());
		 System.out.println("String 1 is "+str1+" "+"String 2 is "+str2);
	}
}
