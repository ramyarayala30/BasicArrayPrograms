package arrays_chapter1;

//WAPT Print all elements at even indices in an array.
public class elements_at_even_indices_4 {
	public static void main(String[] args) {
		
	int[] a= {1,2,3,4,5};
	for(int i=0;i<a.length;i++)
	{
		if(i%2==0)
		{
			System.out.print(a[i]+" ");
		}
	}

}
}
