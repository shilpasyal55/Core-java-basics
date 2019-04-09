//int []arr = new int[5]
//int arr[] = new int[5]
//int arr[] = new int[]{2,3,4,5,5} //automaticaly size assign according to number of value
// int arr[] = new int[2]{3,4} //error, size or values cannot mention together
//int arr[]= {2,3,3}
import java.util.*;
class ArrayExample {
	public static void main(String[] args) {
		int []arr = new int[4];
		int arr2[] = {2,3,4,5};
		int arr3[] = new int[]{3,4,5,5};

		//add values to arr array
		arr[0] = 9;
		arr[1] = 6;
		// arr[9] = 7;  //Exception..index greater than sizee

		System.out.println("Arr " + arr[1]);
		System.out.println("Arr2 " + arr2[1]);
		System.out.println("Arr3 " + arr3[2]);

		int marks[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 subject marks");
		for (int i = 0; i < 5 ; i++ ) {
			marks[i] = sc.nextInt();
		}

		for (int i= 0; i < 5 ; i++ ) {
			System.out.println("Subject " + (i+1) + " Marks " + marks[i] );
		}
 	}
}