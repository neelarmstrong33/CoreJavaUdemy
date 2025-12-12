package AbstractClassExample;

public class Audi extends LuxuryCar {

    Audi(int mileage) {
        super(mileage);
    }

    @Override
    public void pressDualBreakSystem() {
        System.out.println("Press the Dual break of the Car");
    }

    @Override
    public void pressClutch() {
        System.out.println("Press the clutch for the Car");
    }
}