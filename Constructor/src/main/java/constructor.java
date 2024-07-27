public class constructor {
    public static void main(String[] args) {
        constructor obj = new constructor();
        obj.NonReturnable();
    }
    //Empty Constructor
    public constructor() {
        System.out.println("Empty Constructor");
    }
    //Non Returnable Constructor
    public void NonReturnable() {
        System.out.println("Non Returnable Constructor Called");

    }
    //Returnable Constructor
    public String Returnable() {
         return "Returnable Constructor ";

    }
}
