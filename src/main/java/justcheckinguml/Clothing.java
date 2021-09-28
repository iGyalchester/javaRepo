package justcheckinguml;

public class Clothing {

	private String description;
	private double price;
	private char size;


	public double getPrice() {
		return price;
	}

	public char getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "Clothing{" +
				"description='" + description + '\'' +
				", price=" + price +
				", size=" + size +
				'}';
	}
}
