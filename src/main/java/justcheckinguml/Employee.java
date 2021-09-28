package justcheckinguml;

public abstract class Employee extends Customer{

	private final double discount;

	protected Employee(double discount) {
		this.discount = discount;
	}

	public double getDiscount() {
		return discount;
	}

	public abstract void printEmpPriceAfterDisc(Clothing clothing);
}
