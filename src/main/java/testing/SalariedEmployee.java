package testing;

public class SalariedEmployee extends Employee implements IPay {

	private Double salary;


	public SalariedEmployee(String name, HireDate hireDate, Double salary) {
		super(name, hireDate);
	}

	public Double getSalary() {
		return this.salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public void pay() {
		System.out.println(this.salary);
	}

	@Override
	public void printPaymentInfo() {
		System.out.println(this.getName() + ":" + this.salary);
	}

}

