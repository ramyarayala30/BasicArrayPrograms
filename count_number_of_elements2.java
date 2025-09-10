package arrays_chapter1;


//2.WAPT to count the No. of elements in an array.


public class count_number_of_elements2 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,10,15};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			count=count+1;
		}
		System.out.println(count);
	}

}
