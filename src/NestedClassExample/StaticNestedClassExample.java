package NestedClassExample;

public class StaticNestedClassExample {
    int instanceVariable = 10;
    static int classVariable = 20;

    public static class NestedClassExample {
        public void print() {
            System.out.println(classVariable);
        }
    }
}
