public class CountCapitalizedWords 
{
	public static void main(String[] args) 
	{
		/*Write a Java Program to get the count of Capitalized words and 
		  small words in a String
		 */
		String str="RahulShettyAcademy";
		String strRev="";
		int countCapital=getCapitalizedWords(str);
		int countSmall=getSmallWords(str);
		System.out.println("Capitalized Words in given string are "+countCapital);
		System.out.println("Small Words in given string are "+countSmall);
	}
	public static int getCapitalizedWords(String str)
	{    
		int countCap=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
			{
				countCap++;
			}
		}	
		return countCap;
	}
	public static int getSmallWords(String str)
	{
		int countSma=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			{
				countSma++;
			}
		}	
		return countSma;
	}
}
