// If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
//Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
//Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
//There are 2 types of polymorphism;
// 1) Compile time polymorphism/Static polymorphism  2) Runtime polymorphism/Dynamic polymorphism.
//Method overriding is used for runtime polymorphism
//Rules for Method Overriding:
//-----> The method must have the same name as in the parent class
//-----> The method must have the same parameter as in the parent class.
//-----> There must be an IS-A relationship (inheritance).
//A static method cannot be overridden.

public class MethodOverriding {
    public static void main(String[] args) {
        Bank b;
        //this is method overriding / runtime polymorphism
        b = new Bank();
        b.intrest(12);

        b = new Kotak();
        b.intrest(9);

        b = new HDFC();
        b.intrest(10);

        b = new SBI();
        b.intrest(11);

        System.out.println("Choose wisely");
    }
}

class Bank {
    void intrest(int ROI) {
        System.out.println("Avg rate of intrest is " + ROI + " %");
    }
}
class Kotak extends Bank {
    void intrest(int ROI) {
        System.out.println("Rate of intrest for KOTAK is " + ROI + " %");
    }
}

class HDFC extends Bank {
    void intrest(int ROI) {
        System.out.println("Rate of intrest for HDFC is " + ROI + " %");
    }
}

class SBI extends Bank {
    void intrest(int ROI) {
        System.out.println("Rate of intrest for SBI is " + ROI + " %");
    }
}