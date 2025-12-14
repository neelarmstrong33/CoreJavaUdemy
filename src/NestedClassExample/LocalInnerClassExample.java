package NestedClassExample;

public class LocalInnerClassExample {
    int instanceVariable = 1;
    static int classVariable = 2;

    public void display() {

        int methodLocalVariable = 3;

        class LocalClass {
            int localInnerVariable  = 4;

            public void print() {
                System.out.println(instanceVariable + classVariable + methodLocalVariable + localInnerVariable);
            }
        }

        LocalClass localClassObj = new LocalClass();
        localClassObj.print();
    }
}
