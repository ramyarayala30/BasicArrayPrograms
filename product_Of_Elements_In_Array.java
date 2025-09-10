package arrays_chapter1;


//WAPT Calculate the Product of all elements in an array.

public class product_Of_Elements_In_Array {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int prod=1;
		for(int i=0;i<arr.length;i++)
		{
			prod=prod*arr[i];
		}
		System.out.println(prod);
	}
	
}
