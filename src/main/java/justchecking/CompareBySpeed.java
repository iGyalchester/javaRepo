package justchecking;

import java.util.Comparator;

public class CompareBySpeed implements Comparator<DriveAble> {

	public int compare(DriveAble x, DriveAble y) {

		if (x.getSpeed() > y.getSpeed()){
			return 1;
		}else
			return -1;
	}
}
