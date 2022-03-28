package Section2;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {

        Employee e1 = new Employee(1,"Ahmad",2000);

        Employee e2 = new Employee(2, "Ali", 1000);


        ArrayList<Employee> e = new ArrayList<Employee>();

        ArrayList<String> s = new ArrayList<String>();

        s.add("Abed Al Qader");
        s.add("Madii");

        e.add(e1);
        e.add(e2);



        System.out.println(e);
        System.out.println(s);





    }
}
