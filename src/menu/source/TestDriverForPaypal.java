package mainMenu;
import mainMenu.Paypal;

public class TestDriverForPaypal {
	
	public static void main(String[] args) {
	/* initialize */
	Paypal pp1 = new Paypal();
	
	/* test setters and getters */
	System.out.println(pp1.getType()); // expect "Paypal"
	System.out.println(pp1.getEmail());	// expect ""
	pp1.setEmail("test@email.com");
	System.out.println(pp1.getEmail());	// expect "test@email.com"
	
	}
}
