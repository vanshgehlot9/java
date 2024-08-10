class Rectangle{
    double width;
    double length;
    
    Rectangle(double w, double l) {
        width = w;
        length = l;
    }
    
    double areaOfRectangle() {
        return length * width;
    }
    
    double perimeterOfRectangle() {
        return 2 * (length + width);                                                                                                                                                                 
    }
    
    public static void main(String[] args){
       Rectangle rect1 = new Rectangle(15.0, 30.0);
       Rectangle rect2 = new Rectangle(18.0, 24.0);
       System.out.println("Rectangle 1");
       System.out.println("Area: " + rect1.areaOfRectangle());
       System.out.println("Perimeter: " + rect1.perimeterOfRectangle());
       
       System.out.println("\nRectangle 2");
       System.out.println("Area: " + rect2.areaOfRectangle());
       System.out.println("Perimeter: " + rect2.perimeterOfRectangle());
    }
}