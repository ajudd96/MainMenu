package mainMenu;

public class CreditCard extends Payment{
	private String number;
	private String CVV;
	private String expireDate;
	private String name;
	
	public CreditCard() {
		setType("Credit Card");
		number = "";
		CVV = "";
		expireDate ="";
		name= "";
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String aNumber) {
		number = aNumber;
	}
	
	public String getCVV() {
		return CVV;
	}
	
	public void setCVV(String aCVV) {
		CVV = aCVV;
	}
	
	public String getExpireDate() {
		return expireDate;
	}
	
	public void setExpireDate(String aExpireDate) {
		expireDate = aExpireDate;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String aName) {
		name = aName;
	}
}
