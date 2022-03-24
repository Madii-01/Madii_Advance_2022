package Section2;



public class Avarage {
    public static void main(String[] args) {

        

        int sum = 0;
        for(int i = 0 ; i < args.length ; i++)
        System.out.println("mark : "+ args[i]);
        
        
        System.out.println("sum =" + "Cont " + args.length + "Avarage" + (sum/args.length) );
    }
    
}
