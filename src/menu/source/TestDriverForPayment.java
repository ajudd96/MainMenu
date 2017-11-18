package mainMenu;
import mainMenu.Payment;

public class TestDriverForPayment {
	
	public static void main(String[] args) {
		/* Initiate Payment */
		Payment p1 = new Payment();
		
		/* test setters and getters */
		System.out.println(p1.getType()); //expect ""
		p1.setType("type1");
		System.out.println(p1.getType()); //expect "type1"
		p1.setType("type2");
		System.out.println(p1.getType()); //expect a "type2"
	}
}
