package NestedClassExample;

public class UsingAccessModifierExample {
    int instanceVariable = 10;
    static int classVariable = 20;

    private static class NestedClass {
        public void print() {
            System.out.println(classVariable);
        }
    }

    public void display() {
        NestedClass nestedObj = new NestedClass();
        nestedObj.print();
    }
}
