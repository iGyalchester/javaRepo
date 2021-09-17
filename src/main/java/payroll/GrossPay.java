package payroll;

public class GrossPay {
    public static void main(String[] args) {

        Employee employ1 = new Employee("Jeff");
        Employee employ2 = new Employee("Autumn");

        System.out.println(employ1);
        System.out.println("------------------------");

        System.out.println(employ2);
        System.out.println("------------------------");

        employ1.employeeWeekPay(40, 65);
        employ2.employeeWeekPay(40, 95);

    }
}
