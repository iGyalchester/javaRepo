package company;

public class HireDate {
    public Integer month, day, year;

    public HireDate(Integer month, Integer day, Integer year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public String toString() {
        return "HireDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
}
