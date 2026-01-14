package chapter13;

public class GeneralNoGenericMain01 {

	public static void main(String[] args) {
		GeneralNoGeneric general = new GeneralNoGeneric();
		
		Integer arr[] = {10,20,30,40,50};
		general.PrintIntArr(arr);
		
		Double[] dArr = { 10.1, 20.1, 30.1, 40.1, 50.1 };
		general.PrintDoubleArr(dArr);

		Character[] cArr = { 'A', 'B', 'C', 'D', 'E' };
		general.PrintCharArr(cArr);

	}

}
