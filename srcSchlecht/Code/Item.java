package package1;

public class Item {
private String name;
private String type;
private String description;
private int prepTime;
private Double price;

public Item() {
	name = "unknown";
	type = "unknown";
	description = "unknown";
	prepTime = 0;
	price = 0.0;
}

public void setName(String aName) {name = aName;};
public String getName() {return name;};

public void setType(String aType) {type = aType;};
public String getType() {return type;};

public void setDescription(String aDescription) {description = aDescription;};
public String getDescription() {return description;};

public void setPrepTime(int aPrepTime) {prepTime = aPrepTime;};
public int getPrepTime() {return prepTime;};

public void setPrice(Double aPrice) {price = aPrice;};
public Double getPrice() {return price;};
}
