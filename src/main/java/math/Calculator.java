package math;

public class Calculator {

    public double num, add, subtract, divide, multiply, exponents;

    public Calculator() {

    }

    public void sum (double num1, double num2){
        this.add = num1 + num2;
        System.out.println(add);
    }

    public void subsTraction (double num1, double num2){
        this.subtract = num1 - num2;
        System.out.println(subtract);
    }

    public void division (double num1, double num2){
        this.divide = num1 / num2;
        System.out.println(divide);
    }
    public void multiplication (double num1, double num2){
        this.multiply = num1 * num2;
        System.out.println(multiply);
    }

    public void Xponent (double num1, double num2){
        this.exponents = Math.pow(num1,num2);
        System.out.println(exponents);
    }

    @Override
    public String toString() {
        return "Claculator{" +
                "num=" + num +
                ", add=" + add +
                ", subtract=" + subtract +
                ", divide=" + divide +
                ", multiply=" + multiply +
                ", exponents=" + exponents +
                '}';
    }
}
