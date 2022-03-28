package Section2;

public class Manger extends Employee {

    

    private double bouns;

    private double perc;

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public double getPerc() {
        return perc;
    }

    public void setPerc(double perc) {
        this.perc = perc;
    }



   double calculateSalry(){

     double totalSalary = getSalary() + getBouns();


     return totalSalary;


   }

   double calculateNetSalary(){

    double netWorth = getSalary() - (getSalary() * getPerc());


    return netWorth;
        
}

  





    }

