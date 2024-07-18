package Lab4;


public class Triangle extends Shape{

    public  void equilateral (double height , double base) throws Exception{
        if (height != base){
            throw new Exception("The height and base are not equal , it is a equilateral triangle");
        }
    }




    private double height;
    private double base;
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return 0.5 * height * base;
    }

    @Override
    public double calculateCircumference() {
        return 3 * height;
    }
}
