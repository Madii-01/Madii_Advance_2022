package Section2;
import java.util.Vector;


public class TestVector {
    public static void main(String[] args) {
        
Vector vs = new Vector();
Vector vl = new Vector();

Vector<String> vstring =  new Vector<String>();
Vector<Employee> ve =  new Vector<Employee>();

vs.addElement("hamzah");
vs.addElement("Asefan");
vl.addElement(1);
vl.addElement(vs);
vl.addElement(1000.90);


System.out.println(vl);
System.out.println("Element at pops 2 " + vl.elementAt(2));
System.out.println("Element at pops 1 " + ((Vector)vl.elementAt(1)).elementAt(1));



vstring.addElement("Abed Al Qader");
vstring.addElement("Madi");



Employee e1 = new Employee(1,"Ahmad",2000);


Employee e2 = new Employee(2, "Ali", 1000);


ve.addElement(e1);
ve.addElement(e2);





    }
}
