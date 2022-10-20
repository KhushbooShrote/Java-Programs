public class StringMaximize 
{
	 static public void main(String[] args) 
	{
		/*Write a Java Program to generate Output "aabbbcccc" with the input 
		"a2b3c4"
		 */
		String str="a2b3c4";
		stringMultiply(str);
	}
	public static void stringMultiply(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				System.out.print(str.charAt(i));
			}
			else
			{
				int a=Character.getNumericValue(str.charAt(i));
				{
					for(int j=1;j<a;j++)
					{
						System.out.print(str.charAt(i-1));
					}
				}
			}
		}
	}
}
