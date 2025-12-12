package AbstractClassExample;

abstract class Vehicle {

    //Abstract method
    abstract void fuelType();

    //Concrete Method
    void wheels() {
        System.out.println("Vehicles have wheels");
    }

    //Constructor
    Vehicle() {
        System.out.println("Vehicle Created");
    }
}
