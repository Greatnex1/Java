package DesignPatterns.CHP1;

public class Duck {
    // Putting two classes together like the one below is called composition
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
public  Duck(){

}
     public void swim(){
         System.out.println("All ducks float,even decoy");
    }

    public void display() {

    }


    public  void performQuack(){
         quackBehaviour.quack();

    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public  void performFly(){
        flyBehaviour.fly();

    }


}
