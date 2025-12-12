package NestedClassExample;

public class OuterNestedClassExample {
    int instanceVariable = 10;
    static int classVariable = 20;

    public class InnerNestedClass{
        public void print() {
            System.out.println(classVariable + instanceVariable);
        }
    }
}
