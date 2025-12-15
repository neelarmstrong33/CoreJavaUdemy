package SingletonClassExample;

public class LazyInitializationExample {
    private static LazyInitializationExample lazyInitializationObj;
    private LazyInitializationExample() {

    }

    public static LazyInitializationExample getInstance() {
        if(lazyInitializationObj == null) {
            lazyInitializationObj = new LazyInitializationExample();
        }
        return lazyInitializationObj;
    }
}
