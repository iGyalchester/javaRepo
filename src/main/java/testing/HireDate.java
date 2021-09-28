package testing;

public class HireDate {
	public String month;
	public String day;
	public String year;

	public HireDate(String month, String day, String year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Hire Date: " +
				" " + month +
				", " + day +
				", " + year +
				'}';
	}
}
