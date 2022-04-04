package Section2;

public class Bicycle implements Vechile {

    
    
    int speed ;
    int gear ; 



    @Override
    public void chnageGear(int newGear) {
       this.gear = newGear; 
        
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
        
    }

    @Override
    public void applyBreaks(int decrement) {
       speed = speed - decrement;
        
    }

public void print(){
System.out.println("Bicycle -> speed: " + speed +" gear: " +gear);


}

    
}
