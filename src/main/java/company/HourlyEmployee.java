package company;

public class HourlyEmployee extends Employee implements IPay{
    private double hourlyWage, hoursWorked;

    public HourlyEmployee(String name, HireDate hireDate) {
        super(name, hireDate);
    }

    @Override
    public Double calcPay() {
        return null;
    }

    @Override
    public void pay() {
        System.out.println(this.hourlyWage * this.hoursWorked);
    }


}
