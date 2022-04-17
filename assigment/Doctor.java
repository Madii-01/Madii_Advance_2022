package assigment;

public class Doctor implements Staff {
    int id = 0;
    int baseSalary = 1500;


@Override
public void CalcSalary(){
    System.out.println(baseSalary);
}


@Override
public double CalcLoad(){
    
}

}
