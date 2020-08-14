/* Class
   Attributes/properties/variables
   Behaviors/methods/functions
   Constructor
   Initializing a class variable with a dynamic variables through constructor
   Instance(non static) method vs static method
   Accessing way of instance(non static) method vs static method
   Instance(non static) variables vs static variables
   Instance of a class
   Accessing way of instance(non static) variables vs static variables



 */
//    defining a class blue print.
public class Triangle {
//Static variable of the class Triangle
    static int numOfSides = 3;

//  Class properties(attributes)
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

//  Class methods.
//  Create a constructor. A constructor is just one of the methods that a class can have.

    public /*no need to state return type*/Triangle(double base,
                    double height,
                    double sideLenOne,
                    double sideLenTwo,
                    double sideLenThree){
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;

//        no return statement needed, implicitly know by Java.
    }
//    findArea() for example can be one of the other functions of the class Triangle.
//    But it will have a return type and a return statement.

    public double findArea(){
        return (this.base * this.height)/2;

    }

}
