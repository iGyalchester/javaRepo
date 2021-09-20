package whileloop;

public class WhileLoopClass {
    public double num1, num2;
    public int count;

    public WhileLoopClass(){
        this.count = count;
        this.num1 = num1;
        this.num2 = num2;
    }
    public void DoTheMath(double x, double y){
        num1 = x;
        num2 = y;
        count = 0;

        do {

            //while our number is greater than 1
            //divide the number by 2
            num1 = num1 / num2;

            //increase our count by 1
            count++;
            System.out.println(count);
            System.out.println(num1 + " Will be divided next \n");

        } while (num1 >= 1);
        System.out.println(count);;
    }

    @Override
    public String toString() {
        return "WhileLoopClass{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", count=" + count +
                '}';
    }
}
