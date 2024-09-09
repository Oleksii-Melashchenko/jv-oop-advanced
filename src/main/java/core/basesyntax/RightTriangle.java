package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle," + " area: " + calculateArea() + " sq. units,"
                + " firsLeg: " + firstLeg + " units," + " second leg: " + secondLeg
                + " units," + " color: " + color);

    }

    @Override
    public double calculateArea() {
        int index = 2;
        return (double) (firstLeg * secondLeg) / index;
    }
}