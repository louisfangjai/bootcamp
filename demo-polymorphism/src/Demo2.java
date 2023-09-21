public class Demo2 {


    public static void main(String[] args) {
        // Dynamic Polymorphism (Run-time)
        Building building = new House(); //
        // Building building2 = new Building(); compile error because buildiong is abstract class
        // Compile-time checks
        // building.getCapacity(); // compile error < building入面無method

        building.print(); // building 入面有method
        // Java is a compile language
        // Compile-time confirm you can call print() method
        // Run-time decide which print() is going to call
        // So, "building" variable call House's print() method
        // 因為Override左佢 用先
        // building.buildingPrint; compile error
        building.print2(); // I am House
        building.print3();// I am Building

        // Static Polymophism(compile-time)
        // Method Signature (method name+ parameters)
        // Constructor Signature

        House house = new House();
        house.print("hello"); //Overloading...hello
        house.print(); // I am House
        House house2 = new House(3.0d);
        house2.print("hello");
        house2.print();
        // House house3 = new House("String"); // Constructor not found
        //house2.print(3L);//method pinrt(long) not found

        //downcast
        long l1 = Long.valueOf(1L);//wrapper class->unbox
        Long l3 =3L ;//wrapper class->autobox

        long l2 = 2;// upcasting
        int i2 =(int)3L; // Downcast
        byte b2 = (byte)3L;

        //downcast(Run-time Polymorphism)
        Object obj = new Container();
        if(obj instanceof Cube){ // false, instanceof Contrainer 危險，因為父親可以有好多仔女, false
         Cube cube = (Cube)obj; // downcast: Object -> Cube
         System.out.println("obj is instance of Cube");
        }
        
        // Cube cube1 = (Cube)new Container(); // explicit downcast
        Object obj2 = new Cube(); //JVM
        if(obj2 instanceof Container){ //true
            Container container = (Container)obj2; // downcast: object-> Container
            System.out.println("obj2 is instance of Container");
        }
                //
            Object obj3 = new Clone();//JVM唔會幫你分析// Clone同Cube同level 兄弟姊妹關係
            Cube cube2 = (Cube)obj3; // java.lang.ClassCastException
            // runtime exception: run-time polymorphism，但complie time無問題

            Number number = Integer.valueOf(3);
            Double d1 = (Double)number; // java.lang.ClassCastException
            //因為 Integer同double 兄弟姊妹關係，唔似primiitve
            // 同level class唔可以互cast

        }
}
