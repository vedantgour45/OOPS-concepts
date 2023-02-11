//constructor is basically used to set default values for our objects;
//constructor has exactly same name as of the class;
//constructor do not have a return type;
//The new keyword  creates the object of class and invokes the constructor to initialize this newly created object.

public class Constructor {
    public static void main(String[] args) {
        Photographer p1 = new Photographer();

        System.out.println("Name of photographer: " + p1.name);
        System.out.println("Rating of photographer: " + p1.rating);
        System.out.println("Type of photographer: " + p1.type);
        p1.thePhotographerClicks();
        System.out.println();

        Photographer p2  = new Photographer("Vipul", 9, "Wedding photographer");

        System.out.println("Name of photographer: " + p2.name);
        System.out.println("Rating of photographer: " + p2.rating);
        System.out.println("Type of photographer: " + p2.type);
        p2.thePhotographerClicks();
    }
}

class Photographer {
    String name;
    int rating;
    String type;

    //Default constructor;
    Photographer() {
        System.out.println("=== Inside default constructor ===");
        name = "Vedant";
        rating = 7;
        type = "Street Photographer";
    }

    //Parameterised constructor;
    Photographer(String name, int rating, String type) {
        System.out.println("=== Inside parameterised constructor ===");
        this.name = name;           //this keyword means we are referring to the class variables;
        this.rating = rating;
        this.type = type;
    }

    void thePhotographerClicks(){
        System.out.println("Eat !! Click !! Sleep !! Repeat !!");
    }
}