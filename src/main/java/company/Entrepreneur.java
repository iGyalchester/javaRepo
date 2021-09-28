package company;

public class Entrepreneur extends Person implements IPay{

    public Double rate;

    public Entrepreneur(String name) {
        super(name);
    }

    @Override
    public Double calcPay() {
        return null;
    }

    @Override
    public void pay() {
        System.out.println(rate);
    }
}
