package arrays_chapter1;

import java.util.Arrays;

//WAPT Sort an array without using predefined methods

public class Sorting_The_Array {
	
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
	
	public static void main(String[] args) {
		int[]a= {1,5,3,6,3,2,1};
		int[] sort=sort(a);
		System.out.println(Arrays.toString(sort));
	}
	
	

}
