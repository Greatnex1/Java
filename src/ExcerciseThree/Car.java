package ExcerciseThree;

public class Car {
        private String model;
        private String year;
        private double price;

        public Car(String model, String year, double price){
                this.model = model;
                this.year= year;
                this.price = price;
        }
        public void setName(String model){
                this.model = model;

        }
        public String getName() {
                return model;
        }
        public void setYear(String year){
                this.year = year;
        }
        public  String getType(){
                return year;
        }

        public double getPetrol(){
                return price;
         }

        public double getPrice() {
                return price;
        }

        //a constructor that initializes the three instance variables
        // a test application

}



