package mainMenu;

public class Paypal extends Payment{
	private String email;
	
	public Paypal() {
		setType("Paypal");
		email ="";
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String aEmail) {
		email = aEmail;
	}
}
