

public class GenericClass <E> {
    
    private E value;

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
    
    public static void main(String[] args) {
        GenericClass<String> x = new GenericClass<String>();

        GenericClass<Integer> y = new GenericClass<Integer>();


        x.setValue("Madiii");
        y.setValue(12345);


        System.out.println(x.getValue());
        System.out.println(y.getValue());


    }
}
