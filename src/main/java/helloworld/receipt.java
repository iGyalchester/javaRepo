package helloworld;

import org.w3c.dom.ls.LSOutput;

public class receipt {
    public static void main(String[] args) {
        String Product = "Rice";
        String Message = "Thank you. Come Again!!!";


        int Qty = 20;
        float Distance = 50;
        float Price = 5;
        float fee = 0;

        if (Distance > 0 && Distance < 5){
            fee = 2;
        } else if (Distance >= 5 && Distance <= 15) {
            fee = 5;
        } else if (Distance > 15 && Distance <= 25) {
            fee = 10;
        }else if (Distance > 25 && Distance <= 50){
            fee = 15;
        }else if (Distance > 50){
            fee = 20;
        }
        float Total = (Qty * Price) + fee;




        System.out.println("Product\t Qty\t Price\t Distance\t Total");
        System.out.println("----\t ---\t -----\t ----- \t\t------");
        System.out.println(Product + "\t\t" + Qty + "\t\t" + Price + "\t\t" + Distance + "\t" + Total);
        System.out.println("\t" + Message);

    }
}
