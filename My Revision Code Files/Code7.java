// Define the circle class with two constructors
class SimpleCircle {
    double radius;

    /** Construct a circle with radius 1 **/
    SimpleCircle() {
        radius = 1;
    }

    /** Construct a circle with a specified radius */
    SimpleCircle(double radius) {
        this.radius = radius;
    }

    /** Return the area of this circle */
    double getArea() {
        return Math.PI * radius * radius;
    }

    /** Return the perimeter of this circle */
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /** Set a new radius for this circle */
    double setNewRadius(double newRadius) {
        radius = newRadius;
        return radius;
    }
}

public class Code7 {
    public static void main(String[] args) {
        // Create a circle with radius 1
        SimpleCircle circle1 = new SimpleCircle();

        // Create a circle with radius 25
        SimpleCircle circle2 = new SimpleCircle(25);

        // Create a circle with radius 125
        SimpleCircle circle3 = new SimpleCircle(125);

        // Modify circle radius
        // or circle2.setRadius(100)
        circle1.setNewRadius(100);

        // Get the area of the circle
        System.out.println(circle1.getArea());
        System.out.println(circle3.getArea());

        System.out.println(circle2.getPerimeter());
    }
}