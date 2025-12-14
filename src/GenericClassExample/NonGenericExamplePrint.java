package GenericClassExample;

public class NonGenericExamplePrint<T> {
    T value;

    public T getPrintValue() {
        return value;
    }

    public void setPrintValue(T value){
        this.value = value;
    }
}
