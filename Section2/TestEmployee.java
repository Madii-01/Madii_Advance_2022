package Section2;



public class TestEmployee{
   public static void main(String[] args) {
    Employee e1 = new Employee();
    Employee e2 = new Employee();
    Employee e3 = new Employee();
    Employee e4 = new Employee(4, "laith" ,200);
    PartTimeEmployee e5 = new PartTimeEmployee();
    FullTimeEmployee e6 = new FullTimeEmployee();
    Manger e7 = new  Manger();
    Manger e8 = new  Manger();
    e1.setId(1);
    e1.setName("Ahmad");
    e1.setSalary(1000);


    e2.setId(2);
    e2.setName("Madi");
    e2.setSalary(2000);

    e5.setId(5);
    e5.setName("madi");
    e5.setSalary(1000);
    e5.setHour(15);

    e6.setId(6);
    e6.setName("ali");
    e6.setSalary(1000);
    e6.setVacation(30);

   e7.setId(7);
   e7.setName("Madi");
   e7.setSalary(1000);
   e7.setBouns(55);


   e8.setId(8);
   e8.setName("Madi");
   e8.setSalary(2000);
   e8.setPerc(0.02);


    


    System.out.println("Employee 1: "+ e1.getId() + " " + e1.getName() + " " + e1.getSalary());

    System.out.println("Employee 2: "+ e2.getId() + " " +e2.getName() + " " + e2.getSalary());

    System.out.println("Employee 3: "+ e3.getId() + " " +e3.getName() + " " + e3.getSalary());

    System.out.println("Employee 4: "+ e4.getId() + " " +e4.getName() + " " + e4.getSalary());
    

    

    System.out.println(e1);
    System.out.println(e2.toString());

    System.out.println(e1.equals(e2)?"Equal":"Not Equal");  // the equal sign is  from an Ternary Operator 
    


    System.out.println("Employee 5: "+ e5.getId() + " " +e5.getName() + " " + e5.getSalary() + " " + e5.getHour());
    
    
    System.out.println("Employee 6: "+ e6.getId() + " " +e6.getName() + " " + e6.getSalary() + " " + e6.getVacation());
    
    
    System.out.println("Employee 7: "+ e7.getId() + " " +e7.getName() + " " + e7.getSalary() + " " + e7.getBouns() + "\n" + e7.calculateSalry());


    System.out.println("Employee 8: "+ e8.getId() + " " +e8.getName() + " " + e8.getSalary() +  " \n" + e8.calculateNetSalary());
    
    
    }


    
   }

   

    

   

