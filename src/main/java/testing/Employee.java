package testing;

public class Employee extends Person implements IPay{

	public Employee(String name) {
		super(name);
	}


	public HireDate hireDate;

	public Employee(String name, HireDate hireDate) {
		super(name);
		this.hireDate = hireDate;
	}


	@Override
	public void printPaymentInfo() {

	}

	@Override
	public void pay() {

	}

	@Override
	public String name() {
		return null;
	}
}
