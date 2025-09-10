package arrays_chapter1;


//Wap to print frequency of each element in a array

public class Finding_Frequency_11 {
	
	public static void main(String[] args)
	{
		int[]a= {1,2,3,1,2,3,4,5};
		
		int visited=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			if(a[i]!=visited)
			{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=visited;
				}
			}
			}
			if(a[i]!=visited)
			{
				System.out.println(a[i]+" repeated "+ count+" time");
			}
				
		}
	
	}

}
