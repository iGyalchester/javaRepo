package justchecking;

public class Truck extends Vehicle{
	private double price;
	private double tax = 20;

	public Truck(String name, double price, int speed) {
		super(name, price, speed);
	}

	@Override
	public double totalAfterTax(){
		double taxed = (this.price * tax) / 100;

		return taxed + price;
	}

}
