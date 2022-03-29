package assigment;

import Section2.Employee;

public class Array {
    public static void main(String[] args) {
        
        int a[] = new int[5];
        System.out.println(a[0]);


        String b [] = new String[10];
        b[0] = "Ali";
        b[9] = "Sami";

        System.out.println(b.length);
        System.out.println(b[0].length());


        Employee e[] = new Employee[100];
        e[0].setName("Ali");
        for(int i = 0; i < e.length; i++){

            e[i] = new Employee();

        }
        e[0].setName("Ali");


    }


}
