package OOP.Inheritance.Institution;

public class UnderGraduate extends Student{
    int  year;
    public UnderGraduate(String name, String age) {
        super(name, age);
        year = 0;
    }

    @Override
    public void setAge(String age) {
        year += 1;
        super.setAge(age);
    }
}
