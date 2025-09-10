package arrays_chapter1;


//WAPT Print the elements of an array in reverse order


public class printing_Array_elements_in_reverse_3 {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
