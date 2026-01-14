package chapter13;

public class GeneralNoGeneric {
	
	public void PrintIntArr(Integer arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}
	
	public void PrintDoubleArr(Double arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}
	
	public void PrintCharArr(Character arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}

}
