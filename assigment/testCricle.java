package assigment;

public class testCricle {
    public static void main(String[] args) {
        circle c1 = new circle();
        circle c2 = new circle();
        circle c3 = new circle();
        circle c4 = new circle();


        c1.setRadius(5);

        c2.setRadius(7);

        c3.setRadius(3.5);

        c4.setRadius(5);


        System.out.println(c1.toString());

        System.out.println(c2.toString());

        System.out.println(c3.toString());



        System.out.println(c1.equals(c3)?"Equal":"Not Equal"); 

        System.out.println(c1.equals(c4)?"Equal":"Not Equal"); 

    }

}
