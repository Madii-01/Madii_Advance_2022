package Section2;

public class Circle2 extends shape {

    private double raduis;

    public Circle2(double raduis) {
        this.raduis = raduis;
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }

    @Override
    public String toString() {
        return "Circle [raduis=" + raduis + "]";
    }

    
    @Override
    public double calcArea(){

        return Math.PI * raduis * raduis;
    }
}
