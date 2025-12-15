import AnnontationExample.*;
import GenericClassExample.*;
import NestedClassExample.LocalInnerClassExample;
import NestedClassExample.UsingAccessModifierExample;
import ReflectionClassExample.ReflectionClassExampleTwo;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

//        Category[] categoryAnnotationArray = Eagle.class.getAnnotationsByType(Category.class);
//        for(Category annontation: categoryAnnotationArray) {
//            System.out.println(annontation.name());
//        }

//        UsingAccessModifierExample usingAccessModifierExample = new UsingAccessModifierExample();
//        usingAccessModifierExample.display();

//        LocalInnerClassExample localInnerClassExample = new LocalInnerClassExample();
//        localInnerClassExample.display();

//        GenricClassExamplePrint genricClassExamplePrintObj = new GenricClassExamplePrint();
//        genricClassExamplePrintObj.setPrintValue(1);
//        Object printValue = genricClassExamplePrintObj.getPrintValue();
//        //We cannot use printValue directly, we have to typecast it, else it will be compile time error
//        if((int)printValue == 1) {
//        }

//        GenericClassExamplePrintOne<Integer> genericClassExamplePrintOneObj1 = new GenericClassExamplePrintOne<Integer>();
//        genericClassExamplePrintOneObj1.setPrintValue(1);
//        Integer printValue = genericClassExamplePrintOneObj1.getPrintValue();
//        if(printValue == 1) {
//            System.out.println(printValue);
//        }

//        ColorPrint colorPrintObj = new ColorPrint();
//        colorPrintObj.setPrintValue("2");
//        String printValue = colorPrintObj.getPrintValue();
//        if(Objects.equals(printValue, "2")) {
//            System.out.println(printValue);
//        }

//        ColorPrintOne<String> colorPrintObj = new ColorPrintOne<>();
//        colorPrintObj.setPrintValue("2");
//        String printValue = colorPrintObj.getPrintValue();
//        if(Objects.equals(printValue, "2")) {
//            System.out.println(printValue);
//        }

//        GenericPairExample<String, Integer> genericPairExampleObj = new GenericPairExample<>();
//        genericPairExampleObj.put("Hello", 1234);

//        RawTypeGenericExample<String> rawTypeGenericExampleObj = new RawTypeGenericExample<>();
//        //Internally it passes Object as parametrized;
//        RawTypeGenericExample rawTypeGenericExample = new RawTypeGenericExample();
//        rawTypeGenericExample.setPrintValue(1);
//        rawTypeGenericExample.setPrintValue("hello");

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Bus());
        vehicleList.add(new Car());

        List<Bus> busList = new ArrayList<>();

        /*
        List<Bus> busList = new ArrayList<>();
        vehicleList =busList; //No
        busList = vehicleList; //No
         */

        /*
        Vehicle vehicleObj = new Vehicle();
        Bus busObj = new Bus();

        vehicleObj = busObj; //ok
        */

        Print printObj = new Print();
        List<Object> objList = new ArrayList<>();
//        printObj.setPrintValues(busList);
        printObj.setPrintValues(objList);
        printObj.setPrintValues(vehicleList);

        



    }
}