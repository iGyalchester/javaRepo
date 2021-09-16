package helloworld;

public class TotalBill {
    public static void main(String[] args) {
        double bills[] = {1.5,1.9,2.8,5.7};

        System.out.println(calculateTotalBill(bills));


    }
    //currentBill = 0;
    //currentBill + 1.5;
    //currentBill + 1.9;
    //currentBill + 2.8;
    // return

    public static double calculateTotalBill(double[] bills){

        double currentBill = 0;

        for(int i =0;i<bills.length;i++){

            currentBill+=bills[i]; //i instead of 2.
        }
        return currentBill;
    }
}
