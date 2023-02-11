/* Static keyword: Basically if we set the variable/method as static, and then if we change the value
                   then it will change for all the objects*/
//Static means same for every object;
//IMP--> For static we do not need to create objects, It can be directly accessed using class name

public class UseOfStatic {
    public static void main(String[] args) {
        //here company is called directly using class name car without creating any object;
        System.out.println("Company name before merger: "+Car.company);
        Car.company = "TATA";
        System.out.println("Company name after merger: "+Car.company);

        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        c1.company = "BMW";  // here even if I change the value of company for c1, it will also e changed for c2 & c3
        System.out.println(c2.company);

    }
}

class Car {
    String category;
    String colour;
    int average;
    static String company = "Maruti";
}