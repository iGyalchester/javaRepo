package justchecking;

public abstract class Vehicle implements DriveAble{

	private int qty;
	private String name;
	private double price;
	private int speed;
	private final double TAX = 0.15;
	private Engine engine;

	public Vehicle(String name, int qty, double price, Engine engine, int speed) {
		this.engine = engine;
		this.qty = qty;
		this.name = name;
		this.price = price;
		this.speed = speed;

	}


	public double getPrice() {
		return price;
	}

	public int getQty() {
		return qty;
	}

	public double getTax() {
		return this.TAX;
	}

	public Engine getEngine() {
		return engine;
	}

	public int getSpeed() {
		return this.speed;
	}

	public double totalBeforeTax(Vehicle vehicle){
		return this.price * this.qty;
	}

	public double calcTax(Vehicle vehicle) {
		return (vehicle.totalBeforeTax(vehicle) * this.TAX);
	}

	public abstract double totalAfterTax(Vehicle vehicle);

	public String getName() {
		return this.name;
	}




}
