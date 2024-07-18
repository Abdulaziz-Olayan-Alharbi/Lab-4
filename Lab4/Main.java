package Lab4;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(3.5);
        System.out.println(circle.getRadius());
        circle.setRadius(4);
        System.out.println(circle.getRadius());
        System.out.println("Area of circle :"+circle.calculateArea());
        System.out.println("Circumference of circle : "+circle.calculateCircumference());
        System.out.println("************************************");

        Rectangle rectangle = new Rectangle(5.6, 6.2);
        System.out.println(rectangle.getWidth()+" , "+rectangle.getHeight());
        rectangle.setWidth(7.5);
        rectangle.setHeight(11);
        System.out.println(rectangle.getWidth()+" , "+rectangle.getHeight());
        System.out.println("Area of rectangle :"+rectangle.calculateArea());
        System.out.println("Perimeter of rectangle : "+rectangle.calculateCircumference());
        System.out.println("************************************");

        try {
            Triangle triangle = new Triangle(4.2, 4.2);
            triangle.equilateral(triangle.getHeight(), triangle.getBase());
            System.out.println(triangle.getBase() + " , " + triangle.getHeight());
            triangle.setBase(3.5);
            triangle.setHeight(3.5);
            triangle.equilateral(triangle.getHeight(), triangle.getBase());
            System.out.println(triangle.getBase() + " , " + triangle.getHeight());
            System.out.println("Area of triangle :" + triangle.calculateArea());
            System.out.println("Perimeter of triangle : " + triangle.calculateCircumference());
            System.out.println("************************************");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }








    }
}
