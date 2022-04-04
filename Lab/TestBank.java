package Lab;

public class TestBank {
    public static void main(String[] args) {
       BankA a = new BankA();
      System.out.println("a = " + a.getBalance());
      
      BankB b = new BankB();
      System.out.println("b = " + b.getBalance());

      BankC c = new BankC();
      System.out.println("c = " + c.getBalance());

    }
}
