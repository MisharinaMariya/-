package figure;

public class Triangle extends Background implements Form {

    public Triangle(String colorBackground, String colorBorder, double sideA, double sideB, double sideC) {
        super(colorBackground, colorBorder);
        this.sideA=sideA;
        this.sideB=sideC;
        this.sideC=sideC;
    }

    private double sideA;
    private double sideB;
    private double sideC;



    @Override
    public double getPerimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    public double getSquare() {
        double p=this.getPerimeter()/2;
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }
}
