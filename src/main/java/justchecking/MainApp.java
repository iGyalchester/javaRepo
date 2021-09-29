package justchecking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainApp {
	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[3];

		Car car = new Car("Honda", 21700, 137 );
		vehicles[0] = car;

		Truck truck = new Truck("GM", 28000, 114 );
		vehicles[1] = truck;

		Bike bike = new Bike("Suzuki", 12690, 190 );
		vehicles[2] = bike;

		Vehicle.printVehicleNamesAndPrices(vehicles);

		//arrayList of driveable cars
		ArrayList <DriveAble> driveAbles = new ArrayList<DriveAble>();

		driveAbles.add(car);
		driveAbles.add(truck);

		Vehicle.getSpeedOfDriveAbleVehicles(vehicles);


		System.out.println(car.totalBeforeTax());
		System.out.println(car.totalAfterTax());

//		Collections.sort(driveAbles, new Comparator<DriveAble>() {
//			@Override
//			public int compare(DriveAble s1, DriveAble s2){
//				return Integer.valueOf(s1.spee);
//			}
//		});

	}

}
