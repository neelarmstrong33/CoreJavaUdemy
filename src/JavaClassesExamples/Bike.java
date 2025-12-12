package JavaClassesExamples;

abstract class ConcreteClassExampleVehicle {

    abstract void fuel();

    public void wheels() {
        System.out.println("All vehicles have wheels.");
    }
}

public class Bike extends ConcreteClassExampleVehicle {

    @Override
    public void fuel() {
        System.out.println("Bike uses petrol");
    }
}


