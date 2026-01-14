package chapter09.Computer;

public class ComputerMain01 {

	public static void main(String[] args) {
		//Computer cp = new Computer();
		Computer cp2 = new DeskTop();
		Computer cp3 = new MyNoteBook();
		
		cp2.display();
		cp2.typing();
		
		cp3.display();
		cp3.typing();

	}

}
