package ExcerciseThree;

public class CarApplication {
    public static void main(String[] args) {
        Car Pcar = new Car("toyota", "2022", 3000);
        Car Jcar = new Car("boyo", "2020", 6000);

        double discount = Pcar.getPrice() - (Pcar.getPrice())*0.05;
        double discount1= Jcar.getPrice() - (Jcar.getPrice())* 0.07;

        System.out.printf("Pcar is at %.2f discount",discount);
        System.out.printf("%nJcar is at %.2f discount", discount1);


    }
}