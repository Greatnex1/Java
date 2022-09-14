package OOP.Inheritance.Sports;

public class Player {
    RunBehaviour runBehaviour;

    public void setTechniques(RunBehaviour runBehaviour) {
        this.runBehaviour = runBehaviour;
    }

    private String name;

    private int number;

    private double salary;

//    public Player(String name, int number, double salary) {
//        this.name = name;
//        this.number = number;
//        this.salary = salary;
//    }
    public Player(){

    }

    public void run(){
        runBehaviour.run();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
