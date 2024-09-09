package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(String color, int firstBase, int secondBase, int height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    public IsoscelesTrapezoid(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid," + " area: " + calculateArea()
                + " sq. units," + " firsBase: " + firstBase + " units,"
                + " secondBase: " + secondBase + " units,"
                + " height: " + height + " units,"
                + " color: " + color);
    }

    @Override
    public double calculateArea() {
        return 0.5 * (firstBase + secondBase) * height;
    }
}