public class Ex13 {
    public static void main(String[] args) {
        rectangle rect = new rectangle();
        rect.setLength(23);
        rect.setWidth(17);
        int area = rect.calculateArea();
        int perimeter = rect.calculatePerimeter();

        System.out.println("Area of rectangle is "+area+" perimeter is "+ perimeter);
    }
}

class rectangle{

    private int length;
    private int width;

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        if(length > 0) this.length = length;
        else System.out.println("Length can't be negative");
        
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        if(width >  0) this.width = width;
        else System.out.println("Width can't be negative");
        
    }

    public int calculateArea(){
        return length*width;
    }

    public int calculatePerimeter(){
        return 2*(length+width);
    }

    
}