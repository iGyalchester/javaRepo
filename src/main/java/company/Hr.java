package company;

public class Hr {

    //
    public static void payPerson(IPay[] payablePeople){
        for (IPay x : payablePeople ) {
            x.pay();
        }
    }

    //issueBade
    public static void issueBadge(Employee[] employees){
        for (Employee e : employees) {
            System.out.println(e.getName());
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.hireDate);
        }
    }

}
