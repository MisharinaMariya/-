package figure;

public class Circle extends Background implements Form {
    public Circle(String colorBackground, String colorBorder, double radius) {
        super(colorBackground, colorBorder);
        this.radius=radius;
    }

    private double radius;




    @Override
    public double getSquare() {
        return PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }
}
