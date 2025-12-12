import AnnontationExample.*;
import ReflectionClassExample.ReflectionClassExampleTwo;

import java.lang.reflect.InvocationTargetException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
//        Calculation obj = new Calculation("neel");
        /*
        ConcreteClassExampleCar car = new ConcreteClassExampleCar();
        car.startEngine();
         */

        /*
        Bike bike = new Bike();
        bike.fuel();
        bike.wheels();
         */

//        Truck truck = new Truck();
//        truck.start();

//        Audi audi = new Audi(32);
//        audi.pressBreak();
//        audi.pressClutch();
//        audi.pressDualBreakSystem();
//        System.out.println(audi.mileage);
//        System.out.println(audi.getNumberOfWheels());


//        StaticNestedClassExample.NestedClassExample nestedObj = new StaticNestedClassExample.NestedClassExample();
//        nestedObj.print();

//        OuterNestedClassExample outerClassObj = new OuterNestedClassExample();
//        OuterNestedClassExample.InnerNestedClass innerClassObj = outerClassObj.new InnerNestedClass();
//        innerClassObj.print();

//        Class reflectionClassObj = ReflectionClassExampleOne.class;
//        System.out.println(reflectionClassObj.getName());
//        System.out.println(Modifier.toString(reflectionClassObj.getModifiers()));

//        Class reflectionClassEagle = ReflectionClassEagle.class;
//        Method[] methods = reflectionClassEagle.getMethods();
//
//        for(Method method : methods) {
//            System.out.println("Method name: " + method.getName());
//            System.out.println("Return Type: " + method.getReturnType());
//            System.out.println("Class Name: " + method.getDeclaringClass());
//            System.out.println("****");
//        }

//        Class reflectionClassObj = ReflectionClassExampleOne.class;
//        Method[] methods = reflectionClassObj.getDeclaredMethods();
//        for(Method method :  methods) {
//            System.out.println("MethodName: " + method.getName());
//        }

//        Class reflectionClassEagleOne = Class.forName("ReflectionClassExample.ReflectionClassEagleOne");
//        Object reflectionClassEagleObject = reflectionClassEagleOne.newInstance();
//
//        Method flyMethod = reflectionClassEagleOne.getMethod("fly", int.class, boolean.class, String.class);
//        flyMethod.invoke(reflectionClassEagleObject, 1,true,"hello");

//        Class reflectionClassEagleTwo = ReflectionClassExampleTwo.class;

        //Get public fields with this
//        Field[] fields = reflectionClassEagleTwo.getFields();
//        for(Field field : fields) {
//            System.out.println("FieldName: " + field.getName());
//            System.out.println("Type: " +field.getType());
//            System.out.println("Modifiers: " + Modifier.toString(field.getModifiers()));
//            System.out.println("*********");
//        }

        //Get private fields with this
//        Field[] fields = reflectionClassEagleTwo.getDeclaredFields();
//        for(Field field : fields) {
//            System.out.println("FieldName: " + field.getName());
//            System.out.println("Type: " +field.getType());
//            System.out.println("Modifiers: " + Modifier.toString(field.getModifiers()));
//            System.out.println("*********");
//        }

//        ReflectionClassExampleTwo reflectionClassExampleTwoObj  =  new ReflectionClassExampleTwo();
//        Field field = reflectionClassEagleTwo.getDeclaredField("breed");
//        field.set(reflectionClassExampleTwoObj, "eagleBrownBreed");
//        System.out.println(reflectionClassExampleTwoObj.breed);

//        DeprecatedExampleMobile deprecatedExampleMobile = new DeprecatedExampleMobile();
//        deprecatedExampleMobile.dummyMethod();

//        OverrideExampleEagle overrideExampleEagle = new OverrideExampleEagle();
//        overrideExampleEagle.fly();

//        System.out.println(ParentTestClass.class.getAnnotation(MyCustomAnnontationWithInherited.class));

//        System.out.println(ChildTestClass.class.getAnnotation(MyCustomAnnontationWithInherited.class));

        Category[] categoryAnnotationArray = Eagle.class.getAnnotationsByType(Category.class);
        for(Category annontation: categoryAnnotationArray) {
            System.out.println(annontation.name());
        }

    }
}