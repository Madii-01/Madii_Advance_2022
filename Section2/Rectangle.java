package Section2;

public class Rectangle extends shape {
    
private int height;
private int width;



    public Rectangle(int height, int width) {
    this.height = height;
    this.width = width;
}

    public int getHeight() {
    return height;
}



public void setHeight(int height) {
    this.height = height;
}


public int getWidth() {
    return width;
}


public void setWidth(int width) {
    this.width = width;
}



    @Override
    public double calcArea(){

        return height * height;
    }




    @Override
    public String toString() {
        return "Rectangle [height=" + height + ", width=" + width + "]";
    }
    
}
