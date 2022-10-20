public class ReverseString 
{
	public static void main(String[] args) 
	{
        /*Write a Java Program to reverse a String.
         String="RahulShettyAcademy"
        */
		String str="RahulShettyAcademy";
		String strRev="";
		for(int i=0;i<str.length();i++)
		{
			strRev=str.charAt(i)+strRev;
		}
		System.out.println("Reversed String is "+strRev);
	}
}
