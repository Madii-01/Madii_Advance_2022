package Section2;

public class TestShape {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        Circle2 s = new Circle2(7);
        
        r.print("Rectangle");

        System.out.println("Rectangle = " + r.calcArea()+"\n");

        s.print("Circle");
        System.out.println("Circle = " + s.calcArea()+"\n");
    }
}
