package justchecking;

public class Truck extends Vehicle{
	private double price;

	public Truck(String name, int qty, double price, Engine engine, int speed) {
		super(name, qty, price, engine, speed);
	}

	@Override
	public double calcTax(Vehicle vehicle) {
		double TAX = 0.20;
		return (vehicle.totalBeforeTax(vehicle) * TAX);
	}
	@Override
	public double totalAfterTax(Vehicle vehicle){
		return vehicle.totalBeforeTax(vehicle) + calcTax(vehicle);
	}


	@Override
	public int milesPerHour() {
		return this.getSpeed();
	}
}
