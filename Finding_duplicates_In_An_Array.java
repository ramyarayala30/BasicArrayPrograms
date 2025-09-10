package arrays_chapter1;


//WAPT Print all duplicate elements in an array

public class Finding_duplicates_In_An_Array {
	
	public static void main(String[] args) {
		
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
			if(count>1 && a[i]!=visited)
			{
				System.out.println(a[i]+" is duplicate");
			}
				
		}
	
		
		
	}

}
