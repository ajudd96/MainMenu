package mainMenu;
import mainMenu.CreditCard;

public class TestDriverForCreditCard {
	
	public static void main(String[] args) {
		/* initialize */
		CreditCard c1 = new CreditCard();
		
		/* test setters and getters */
		System.out.println(c1.getType());	// expect "Credit Card"
		System.out.println(c1.getCVV() + "\n" 
							+ c1.getExpireDate() + "\n"
							+ c1.getNumber() + "\n"
							+ c1.getName() );	// expect 4 lines of ""
		c1.setCVV("123");
		System.out.println(c1.getCVV());	//	expect "123"
		c1.setExpireDate("April 1 2020");	
		System.out.println(c1.getExpireDate());	// expect "April 1 2020"
		c1.setNumber("1234 5678 9101 1232");
		System.out.println(c1.getNumber());	// expect "1234 5678 9101 1232"
		c1.setName("Alex Doe");
		System.out.println(c1.getName());	// expect "Alex Doe"
	}

}
