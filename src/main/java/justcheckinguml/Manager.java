package justcheckinguml;

public class Manager extends Employee implements Discountable{


	protected Manager(double discount) {
		super(discount);
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
		return "Manager{}";
	}

}
