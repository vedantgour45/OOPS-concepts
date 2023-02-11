// If a class has multiple methods having same name but different in parameters, it is known as Method Overloading
// Method overloading increases the readability of the program.
// There are three ways to overload the method in java
// ----> By changing number of arguments
// ----> By changing the data type
// ----> By changing the order of the arguments
//Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
//There are 2 types of polymorphism;
// 1) Compile time polymorphism/Static polymorphism  2) Runtime polymorphism/Dynamic polymorphism.
//Method overloading is used for compile time polymorphism

public class MethodOverloading {
    public static void main(String[] args) {
        Photographers p = new Photographers();
        p.clicks();
        p.clicks("Vedant");
        p.clicks("Shivani", 9);
        p.clicks("Ritika", 8);
        p.clicks("Amit", 8, "Canon");
    }
}

class Photographers {
    String name;
    int rating;
    String gearBrand;

    void clicks() {
        System.out.println("clicks");
    }
    void clicks(String name) {
        System.out.println(name+", clicks");
    }
    void clicks(String name, int rating) {
        System.out.println(name + " with " +rating+" rating, clicks");
    }
    void clicks(int rating, String name) {
        System.out.println(name + " with " +rating+" rating, clicks");
    }
    void clicks(String name, int rating, String gearBrand) {
        System.out.println(name + " with " +rating+" rating, clicks with a "+ gearBrand +" camera");
    }
}

//This is method overloading, as we have different methods/functions with same name but diff arguments or same arguments with different order(Example: line 30 & line 33);