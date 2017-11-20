package package1;

import java.util.ArrayList;

public class Order {
	
private Double cost;
private int totalTime;
private int prepTime;
private Driver driver;
private Customer customer;
private Restaurant restaurant;
private String status;
private ArrayList<Item> items;
private String comment;

public Order() {
	cost = 0.0;
	totalTime = 0;
	prepTime = 0;
	driver = new Driver();
	customer = new Customer();
	restaurant = new Restaurant();
	status = "unknown";
	items = new ArrayList<Item>();
	comment = "unknown";	
}

public void setCost(Double aValue) {cost = aValue;};
public Double getCost() {return cost;};

public void setTotalTime(int aValue) {totalTime = aValue;};
public int getTotalTime() {return totalTime;};

public void setPrepTime(int aValue) {prepTime = aValue;};
public int getPrepTime() {return prepTime;};

public void setDriver(Driver aDriver) {driver = aDriver;};
public Driver getDriver() {return driver;};

public void setCustomer(Customer aCustomer) {customer = aCustomer;};
public Customer getCustomer() {return customer;};

public void setRestaurant(Restaurant aRestaurant) {restaurant = aRestaurant;};
public Restaurant getRestaurant() {return restaurant;};

public void setStatus(String aStatus) {status = aStatus;};
public String getStatus() {return status;};

public void setItems(Item aItem) {items.add(aItem);};
public ArrayList<Item> getItems() {return items;};

public void setComment(String aComment) {comment = aComment;};
public String getComment() {return comment;};

public Double calculateCost() {
	double totalCost = 0.0;
	for (int i=0; i < items.size(); i++) {
		totalCost = totalCost + items.get(i).getPrice();
	}
	return totalCost;
	}

public int calculateTotalTime() {    // PrepTime + Route.calculateTime()
	int calculateTime = 15;
	int totalTime = 0;
	for (int i=0; i < items.size(); i++) {
		totalTime = totalTime + items.get(i).getPrepTime();
	}
	totalTime = totalTime + calculateTime;    // need to create Route Class with method calculateTime();
	return totalTime;
}

public int calculatePrepTime() {
	int totalPrepTime = 0;
	for (int i=0; i < items.size(); i++) {
		totalPrepTime = totalPrepTime + items.get(i).getPrepTime();
	}
	return totalPrepTime;
}

public void printStatus() {
	System.out.printf("%s\n", this.status);
}

public void writeComment(String aComment) {
	comment = aComment;
}

public void addItem(Item aItem) {
	items.add(aItem);
	cost = this.calculateCost();
	totalTime = this.calculateTotalTime();
	prepTime = this.calculatePrepTime();
}

public void removeItem(Item aItem) {
	items.remove(aItem);
	cost = this.calculateCost();
	totalTime = this.calculateTotalTime();
	prepTime = this.calculatePrepTime();
}

public void printOrder() {
	System.out.printf("Cost: $%.2f\n", cost); 
	System.out.printf("Total Time: %d\n", totalTime);
	System.out.printf("Prep Time: %d\n", prepTime);
	System.out.printf("Driver: %s\n", driver.getName());
	System.out.printf("Customer: %s\n", customer.getName());
	System.out.printf("Restaurant: %s\n", restaurant.getName());
	System.out.printf("Status: %s\n", status);
	System.out.printf("Items:\n");
	for (int i=0; i < items.size(); i++) {
		System.out.printf("%s\n", items.get(i).getName());
	}
	System.out.printf("Comment: %s\n\n", comment);
}
}
