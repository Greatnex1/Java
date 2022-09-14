package OOP.Inheritance.Sports;

public class Tennis extends Player{

    public Tennis(){

    }
    @Override
    public String getName(){
        return "Serena Williams";
    }
    @Override
    public double getSalary(){
        return 30000;

    }
}
