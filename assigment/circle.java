package assigment;

public class circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double calcArea() {

        double area = Math.PI * radius * radius;
        return area;

    }

    double calcPara() {
        double para = 2 * Math.PI * radius;
        return para;

    }

    @Override
    public String toString() {
        return "[the area of the cirlce with the raduis of " + radius + " = " + calcArea() + "]" + "\n"
                + "[the parameter of the cirlce with the raduis of " + radius + " = " + calcPara() + "]" + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof circle) {
            circle that = (circle) obj;
            return this.radius == that.getRadius();
        }
        return false;

    }

}
