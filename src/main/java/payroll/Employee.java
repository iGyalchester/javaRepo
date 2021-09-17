package payroll;

public class Employee {

    public double hoursWorked, hourlyPay, weeklyPay;
    public String name;

    public Employee(String name){
        this.name = name;
    }
    public void employeeWeekPay(double hoursWorked, double hourlyPay){
        this.weeklyPay = (hourlyPay * hoursWorked);
        System.out.println(weeklyPay);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hoursWorked=" + hoursWorked +
                ", hourlyPay=" + hourlyPay +
                ", weeklyPay=" + weeklyPay +
                ", name='" + name + '\'' +
                '}';
    }
}
