package testing;

public class HourlyEmployee extends Employee implements IPay{

	private double hourlyWage, hoursWorked;

	public HourlyEmployee(String name, HireDate hireDate, Double hourlyWage) {
		super(name, hireDate);
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyWage() {
		return this.hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public Double calcPay() {

		return this.hourlyWage * this.hoursWorked;
	}

	@Override
	public void pay() {
		System.out.println(this.hourlyWage * this.hoursWorked);
	}
	public void printPaymentInfo(){

		System.out.println(this.getName() + ":" + this.hourlyWage + "/hour " + "- "  + this.hoursWorked + " worked.");

	}

}