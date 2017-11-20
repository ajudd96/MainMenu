package package1;


public class Driver1 {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		Driver driv1 = new Driver();
		Restaurant rest1 = new Restaurant();
		
		Item item1 = new Item();
		Item item2 = new Item();
		Item item3 = new Item();
		
		Order order1 = new Order();
		
		cust1.setName("Frank");
		driv1.setName("Susan");
		rest1.setName("Billy Bob's Java Cafe");
		
		item1.setName("chicken wrap");
		item2.setName("ceaser salad");
		item3.setName("french fries");
		
		item1.setType("Entree");
		item2.setType("Side");
		item3.setType("Side");
		
		item1.setDescription("It is a wrap with chicken");
		item2.setDescription("It is a salad with ceaser dressing and chicken");
		item3.setDescription("They are fried potatoes");
		
		item1.setPrepTime(15);
		item2.setPrepTime(10);
		item3.setPrepTime(8);
		
		item1.setPrice(7.95);
		item2.setPrice(3.95);
		item3.setPrice(2.50);
		
		order1.addItem(item1);
		order1.addItem(item2);
		order1.setDriver(driv1);
		order1.setCustomer(cust1);
		order1.setRestaurant(rest1);
		order1.setCost(order1.calculateCost());
		order1.setTotalTime(order1.calculateTotalTime());
		order1.setPrepTime(order1.calculatePrepTime());
		order1.setStatus("At Restaurant");
		order1.setComment("Knock on door 3 times, wait 2 min then leave the food by the door");
		
		//testing printing out order
		System.out.printf("Order\n\n");
		order1.printOrder();
		//remove ceaser salad
		order1.removeItem(item2);
		//add french fries
		order1.addItem(item3);
		
		//testing printing order after replacing item
		System.out.printf("Updated Order\n\n");
		order1.printOrder();
				
	}
		
}
