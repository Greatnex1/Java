package Records;

public class Main {
    public static void main(String[] args) {
        EmployeeRecord employ = new EmployeeRecord("Odinaka", 23);
        System.out.println(employ);
        EmployeeRecord.write();

    }

}
