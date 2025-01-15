package figure;

public class Rectangle extends Background implements Form {


    public Rectangle(String colorBackground, String colorBorder, double sideA, double sideB) {
        super(colorBackground, colorBorder);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    private double sideA;
    private double sideB;

    @Override
    public double getPerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    public double getSquare() {
        return sideA * sideB;

    }
}
