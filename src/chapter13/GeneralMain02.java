package chapter13;

public class GeneralMain02 {

	public static void main(String[] args) {
		General general = new General();
		
		Integer arr[] = {10,20,30,40,50};
		general.printArr(arr);
		
		Double[] dArr = { 10.1, 20.1, 30.1, 40.1, 50.1 };
		general.printArr(dArr);

		Character[] cArr = { 'A', 'B', 'C', 'D', 'E' };
		general.printArr(cArr);

	}

}
