package justchecking;

public class Car extends Vehicle{


	public Car(String name, int qty, double price, Engine engine, int speed) {
		super(name, qty, price, engine, speed);
	}

	@Override
	public double totalAfterTax(Vehicle vehicle) {
		return vehicle.totalBeforeTax(vehicle) + calcTax(vehicle);
	}

	@Override
	public int milesPerHour() {
		return this.getSpeed();
	}
}
