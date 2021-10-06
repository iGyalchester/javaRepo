package justchecking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainApp {
	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[3];

		Engine carEngine = new Engine(6);
		Car car = new Car("Honda", 5, 27000, carEngine, 120);
		vehicles[0] = car;

		Engine truckEngine = new Engine(8);
		Truck truck = new Truck("GM", 3, 28000, truckEngine, 90);
		vehicles[1] = truck;

		Engine bikeEngine = new Engine(8);
		MotorBike bike = new MotorBike("Suzuki", 1, 12690, bikeEngine, 225);
		vehicles[2] = bike;
		System.out.println("==========Names and Prices.==========");
		VehicleApp.printVehicleNamesAndPrices(vehicles);

		//arrayList of driveable cars
		ArrayList<DriveAble> driveAbles = new ArrayList<>();
		driveAbles.add(car);
		driveAbles.add(truck);

		System.out.println("==========Speed of driveable vehicles.==========");
		VehicleApp.getSpeedOfDriveAbleVehicles(driveAbles);

		System.out.println("==========Car total before tax.==========");
		System.out.println(car.totalBeforeTax(car));

		System.out.println("==========Truck total after tax.==========");
		System.out.println(truck.totalAfterTax(truck));


		Comparator<DriveAble> compare = new CompareBySpeed();
		Collections.sort(driveAbles,compare);

		System.out.println("==========Compare by speed==========");
		VehicleApp.getSpeedOfDriveAbleVehicles(driveAbles);

	}


}
