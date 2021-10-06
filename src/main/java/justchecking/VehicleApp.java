package justchecking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class VehicleApp {

	public static void printVehicleNamesAndPrices(Vehicle[] vehicles) {
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.getName() + " : " + vehicle.getPrice());
		}
	}


	public static void getSpeedOfDriveAbleVehicles(ArrayList<DriveAble> vehicles) {
		for (DriveAble vehicle : vehicles) {
			System.out.println(vehicle.milesPerHour());
		}
	}

	public static void sortAndPrintVehiclesBySpeed(ArrayList<DriveAble> vehicles) {
		for(DriveAble i : vehicles){
			System.out.println(i);
		}

	}


}
