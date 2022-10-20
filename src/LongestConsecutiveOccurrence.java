public class LongestConsecutiveOccurrence 
{
	public static void main(String[] args) 
	{
		/*Write a Java Program to find the longest consecutive occurrence of 
		integers in a given array
		int[] arr={4,3,25,6,7,8,9,2,3,10}
		*/
		int[] arr= {4,3,25,6,7,8,9,2,3,10};
		int count=0;
		int max=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]+1==arr[i+1])
			{
				count++;
			}
			else
			{
				count=0;
			}
			max=Math.max(max, count+1);
		}
		System.out.println("Longest Consecutive Occurence of Integers is "+max);
		
	}
}
