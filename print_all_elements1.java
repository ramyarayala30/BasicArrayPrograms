package arrays_chapter1;


//1.WAPT Print all elements in an array.


import java.util.Scanner;

public class print_all_elements1 {
	
	public static void main(String[] args) {
		System.out.println("entter size of the array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements in the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("[");
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
		System.out.print("]");
	}

}
