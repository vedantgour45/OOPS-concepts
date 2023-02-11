// Constructor chaining is the process of calling one constructor from another constructor with respect to current        object.
// One of the main use of constructor chaining is to avoid duplicate codes while having multiple constructor (by means    of constructor overloading) and make code more readable.
//Constructor chaining can be done in two ways:
//   1) Within same class: It can be done using this() keyword for constructors in the same class.
//   2) From base class: by using super() keyword to call the constructor from the base class.
//Constructor chaining occurs through inheritance. A sub-class constructor’s task is to call super class’s constructor   first. This ensures that the creation of sub class’s object starts with the initialization of the data members of the  superclass. There could be any number of classes in the inheritance chain. Every constructor calls up the chain till   the class at the top is reached.
// This process is used when we want to perform multiple tasks in a single constructor rather than creating a code for    each task in a single constructor we create a separate constructor for each task and make their chain which makes the  program more readable.
public class ConstructorChaining {
    public static void main(String[] args) {

    }
}
