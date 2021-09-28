package justcheckinguml;

public class HourlyEmployee extends Employee implements Discountable{

	protected HourlyEmployee(double discount) {
		super(discount);
	}

	
	@Override
	public double getDiscount() {
		double discount = 0;
		return discount;
	}

	@Override
	public void printEmpPriceAfterDisc(Clothing clothing) {

	}

	@Override
	public double calcDiscount() {
		return 0;
	}

	@Override
	public String toString() {
		return "HourlyEmployee{}";
	}

}
