public class Square extends Shape {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double panjang) {
        this.side = panjang;
    }

    public double area() {
        return side * side;
    }

    @Override
    public void printInfo() {
        System.out.println("Square " + color + ", area = " + area());
    }
}