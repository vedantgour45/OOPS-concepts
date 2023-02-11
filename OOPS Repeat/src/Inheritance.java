/*It allows a class to use the properties and methods of another class*/
// The purpose of inheritance in java, is to provide the "reusability" of code  so that a class has to write only the unique features  and rest of the common properties and functionalities can be inherited from the another class
/* A class can only inherit the fields and methods of another class, if it extends the class */
/* Child Class: The class that extends the features of another class
                is known as child class, subclass or derived class */
/*Parent Class: The class that shares the fields and methods with the child class
                is known as parent class, super class or Base class */

public class Inheritance {
    public static void main(String[] args) {
        CAR c1 = new CAR();
        c1.color = "Black";
        c1.vehicleNumber = 10045;
        c1.category = "SUV";
        c1.companyName = "BMW";

        BIKE b1 = new BIKE();
        b1.cc = 350;

        ElectricCAR c2 = new ElectricCAR();
        c2.power = 70000;
        c2.category = "Sedan";
    }
}

class Vehicle {           // Parent class == Super class == Base class
    String color;
    String companyName;
    int vehicleNumber;
}

class CAR extends Vehicle {        // Child class == Sub class == Derived class --> of Vehicle class
    String category;
}

class ElectricCAR extends CAR {   // Child class == Sub class == Derived class --> of CAR class
    int power;                    // This will properties of CAR class as well as Vehicle;
}

class BIKE extends Vehicle {      // Child class == Sub class == Derived class --> of Vehicle class
    int cc;
}