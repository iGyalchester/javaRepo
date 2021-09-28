package company;

public abstract class Person {

    private String name;

    public Person(String name){
        this.name = name;
    }
    //declared that this mUST be implemented by those who EXTEND from this class
    public abstract Double calcPay();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
