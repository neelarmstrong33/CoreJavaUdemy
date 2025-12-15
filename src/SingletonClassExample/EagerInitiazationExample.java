package SingletonClassExample;

public class EagerInitiazationExample {

    private static EagerInitiazationExample eagerInitiazationObj = new EagerInitiazationExample();

    private EagerInitiazationExample() {
    }

    public static EagerInitiazationExample getInstance() {
        return eagerInitiazationObj;
    }
}
