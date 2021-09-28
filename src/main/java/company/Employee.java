package company;

public abstract class Employee extends Person {

    public HireDate hireDate;

    public Employee(String name, HireDate hireDate) {
        super(name);
        this.hireDate = hireDate;
    }

}
