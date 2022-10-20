public class StringMinimize 
{
	public static void main(String[] args) 
	{
		String str="abbcccdddf";
		int count=1;
		for(int i=0;i<str.length()-1;i++)
		{
			count=1;
			boolean isCovered=false;
			for(int j=0;j<str.length()-1;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					if(i<j)
					{
						count++;
					}
					else if(i>j)
					{
						isCovered=true;
					}
				}	
			}
			if(!isCovered)
			{
				System.out.print(str.charAt(i));
				System.out.print(count);
			}	
		}	
		System.out.print(str.charAt(str.length()-1));
		System.out.print(count);
	}
}
