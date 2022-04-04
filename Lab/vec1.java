package Lab;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class vec1 {
    public static void main(String[] args) {
        
        Vector vec1 = new Vector<String>(4);

        Vector vec2 = new Vector<String>(4);

        vec1.addElement("F");
        vec1.addElement("W");
        vec1.addElement("Q");
        vec1.addElement("F");

        vec2.addElement("A");
        vec2.addElement("V");
        vec2.addElement("S");
        vec2.addElement("B");

        vec1.addAll(0,vec2);

    System.out.println(vec1);

    if(vec1.contains("W")){

        System.out.println("W still exists in the index of " + vec1.indexOf("W"));
    }else{
        System.out.println("W does not exist");
    }

    Collections.sort(vec1);
    System.out.println(vec1);


    List<String> subList = vec1.subList(1 , 5);

    System.out.println("the sublist is: "+subList);

    System.out.println("is vec1 equal to vec2 ? " +vec1.equals(vec2));




    }

    
}
