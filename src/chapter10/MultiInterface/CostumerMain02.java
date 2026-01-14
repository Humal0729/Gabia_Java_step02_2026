package chapter10.MultiInterface;

public class CostumerMain02 {

	public static void main(String[] args) {
		Customer ct = new Customer();
		
		System.out.println("=====Buy=====");
		Buy buyer = ct;
		buyer.buy();
		buyer.order();
		
		System.out.println("=====Sell=====");
		Sell seller = ct;
		seller.sell();
		seller.sellorder();
		seller.order(); //바이어부터 읽음 (디폴트)
		
		// seller 부모 | Customer 자식
		if (seller instanceof Customer) {
			Customer customer2 = (Customer) seller;
			System.out.println("-------Down Chasting-------");
			customer2.buy();
			customer2.sell();
			customer2.sellorder();
			customer2.order();
		} // if

	}

}
