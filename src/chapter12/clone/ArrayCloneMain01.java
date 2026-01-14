package chapter12.clone;

public class ArrayCloneMain01 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2;
		
		arr2 = arr1.clone();
		
		System.out.println("Cloned arr2");
		for(int num:arr2) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		arr2[3]=0;
		System.out.println("Changed arr1");
		for(int num:arr1) {
			System.out.print(num + " ");
		} 
		
		System.out.println();
		
		System.out.println("Changed arr2");
		for(int num:arr2) {
			System.out.print(num + " ");
		}

	}

}
