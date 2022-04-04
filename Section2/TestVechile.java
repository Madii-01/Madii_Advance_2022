package Section2;

public class TestVechile   {
    public static void main(String[] args) {
        
        Bicycle b = new Bicycle();
        b.chnageGear(2);
        b.speedUp(3);
        b.applyBreaks(1);
        System.out.println("Bicycle state");
        b.print();

    System.out.println("\n");

        Bike bike = new Bike();

        bike.chnageGear(5);
        bike.speedUp(7);
        bike.applyBreaks(3);
        System.out.println("Bike state");
        bike.print();


    }
}

   