package testing;

public class CheckCashingJawn {
    public static void main(String[] args) {
        //create an array to hold employees
        Employee[] employees = new Employee[3];
        //Create an HireDate
        HireDate hireDate = new HireDate("9","21","2021");
        //create two employee objects
        HourlyEmployee mcSHan = new HourlyEmployee("McSHan", hireDate, 16.0);
        mcSHan.setHourlyWage(25.0);
        mcSHan.setHoursWorked(40);

        employees[0] = mcSHan;


        SalariedEmployee jade = new SalariedEmployee("Jada", hireDate, 165526.0);
        jade.setSalary(165526.0);
        employees[1] = jade;

        //ClassName.staticMethod();
        HireDate CeceHireDate = new HireDate("9","21","2021");
        Entrepreneur cece = new Entrepreneur("Cece", CeceHireDate, 200.2);
        cece.setRate(200.2);

        employees[2] = cece;
        Hr.issueBadge(employees);
        System.out.println("---------------------");

        IPay[] payablePeeps = {mcSHan,jade, cece };
        Hr.payPerson(payablePeeps);
        System.out.println("---------------------");

        IPay mcSHan11 = mcSHan;
        Hr.printPaymentInfo(mcSHan);

        IPay jade1 = jade;
        Hr.printPaymentInfo(jade1);

        IPay cece1 = cece;
        Hr.printPaymentInfo(cece1);

    }

}
