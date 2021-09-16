package dahood;

public class TheHood {
    public static void main(String[] args) {
        Projex northSide = new Projex(10,
                "r&c deli",
                "All of them",
                "Desert Eagles",
                "LiqsandTricks", "cuban");
        northSide.crackHeads = 16;

        Projex southSide = new Projex(30,
                "Simmy Deli",
                "none",
                ".50 Cal",
                "AllYouCanDrink", "Gase");

        System.out.println(northSide);
        System.out.println("--------------------------");
        System.out.println(northSide.getRobbed("Amazon"));
    }

}
