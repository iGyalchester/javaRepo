package justchecking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Vehicle implements DriveAble {
	private String name;
	private double price;
	private int speed;
	private double tax = 15;

	public Vehicle(String name, double price, int speed) {
		this.name = name;
		this.price = price;
		this.speed = speed;

	}

	public double totalBeforeTax(){
		return this.price;
	}

	public double totalAfterTax(){
		double taxed = (price * tax) / 100;

		return taxed + price;
	}


	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}


	public void printVehicleNamesAndPrices() {
		System.out.println(name + " : " + price);
	}


	public double getSpeedOfDriveAbleVehicles() {
		return this.speed;
	}


}
