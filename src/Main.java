//This program is intended to work with the "Triangle.java" program.
//This is a Main class with the main method. We can also add a main method in the Triangle
//class definition. Here it is done separate.


//Create instances of the Triangle class
public class Main {
    public static void main(String[] args) {
//      class_type_name instance_Name = new(keyword) class_type_name(actual parameters)
        Triangle TriangleA = new Triangle(15, 34,23,13,6.4);
        Triangle TriangleB = new Triangle(4,3.5, 3,3,3);

        double triangleAArea = TriangleA.findArea();
//        finaArea() is an instance(non static) method,
//        unlike for example pow method(which is a static method) of the math class.
//        Static methods are accessed through their class, like "math.pow"
        System.out.println(triangleAArea);
        double triangleBArea = TriangleB.findArea();
        System.out.println(triangleBArea);

//      Below is a example of instance variables for TriangleA and TriangleB instances of the Triangle
//      class. Non static variables of a class are variable whose values change in difference instances.

        System.out.println(TriangleA.base);
        System.out.println(TriangleB.sideLenThree);

//      Static variables don't change per instance, but rather if you change them all instances are changed.

        System.out.println(Triangle.numOfSides);

    }
}
