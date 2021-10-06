package company;

public class CheckCashingJawn {
    public static void main(String[] args) {
        //create an array to hold employees
        Employee[] employees = new Employee[2];
        //Create an HireDate
        HireDate hireDate = new HireDate(9,21,2021);
        //create two employee objects
        HourlyEmployee hourlyEmployee = new HourlyEmployee("McSHan", hireDate);
        employees[0] = hourlyEmployee;


        SalariedEmployee salariedEmployee = new SalariedEmployee("Jada", hireDate);
        employees[1] = salariedEmployee;

        //ClassName.staticMethod();
        Hr.issueBadge(employees);
        Entrepreneur entrepreneur = new Entrepreneur("Cece");

        IPay[] payablePeeps = {hourlyEmployee,salariedEmployee, entrepreneur };
        Hr.payPerson(payablePeeps);
    }

}
