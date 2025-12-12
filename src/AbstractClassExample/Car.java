package AbstractClassExample;

public abstract class Car {

    public int mileage;

    Car(int mileage) {
        this.mileage = mileage;
    }

    public abstract void pressBreak();

    public abstract void pressClutch();

    public int getNumberOfWheels() {
        return 4;
    }

}