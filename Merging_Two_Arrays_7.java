package arrays_chapter1;

import java.util.Arrays;


//WAPT MERGE 2 ARRAYS

public class Merging_Two_Arrays_7 {
	
	public static int[] merge(int[] a,int[] b)
	{
		int[] c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		return c;
	}
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int[] b= {6,7,8,9,10};
		int[] c=merge(a,b);
		System.out.println(Arrays.toString(c));
	}
}
