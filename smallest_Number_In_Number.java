package arrays_chapter1;

//WAP TO FIND THE SMALLEST ELEMENT IN AN ARRAY

public class smallest_Number_In_Number {
	
	public static int[] sort(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		return a;
	}
	public static int largest(int[]a,int n)
	{
		int[] sort=sort(a);
		int largest=sort[n-1];
		return largest;
	}
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int n=2;	
		System.out.println(largest(a,n));
		
	}

}
