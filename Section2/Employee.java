package Section2;

public class Employee {
  private int id  ;
  private String name;
  private double salary;

  public Employee(){
    id = 99; 
    name = "Please entre name ";
    salary = 500;


  }

  public Employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public int getId() {

    return id;

  }

  public void setId(int id){

    this.id = id;

  }

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public double getSalary() {
    return salary;
}

public void setSalary(double salary) {
    this.salary = salary;
}

@Override
public String toString(){

  return "employee[id:"+id+", name: "+name+", salary:"+salary+"]";
}


@Override
public boolean equals(Object obj){
  if(obj instanceof Employee){
    Employee that = (Employee) obj;
    return this.id == that.getId();
  }
  return false;

  }

}
