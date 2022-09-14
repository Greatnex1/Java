package Records;
//Records are used to avoid broiler plate codes in certain types of classes
public record EmployeeRecord(String name, int age) {

    // using a compact constructor
    public EmployeeRecord{
        if(age<18){
            throw new IllegalArgumentException("Not an adult yet");
        }

    }
    static void  write(){
        System.out.println("I write");
    }
}
