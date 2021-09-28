package testing;

public class Entrepreneur extends Employee implements IPay{

    public Double rate;

    public Entrepreneur(String name, HireDate hireDate, Double rate) {
        super(name, hireDate);
    }


    public Double getRate() {
        return this.rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }


    @Override
    public void pay() {
        System.out.println(this.rate + "/hour");
    }

    @Override
    public void printPaymentInfo() {
        System.out.println(this.getName() + ":" + this.rate + "/hour.");
    }

}
