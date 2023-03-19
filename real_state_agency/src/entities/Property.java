package entities;

public class Property {

	private String type;
	private Double price;

	public Property() {
	}

	public Property(String type, Double price) {
		this.type = type;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
}
