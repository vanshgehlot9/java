class Rectangle1{
    double width;
    double length;
   Rectangle(double w, double l) {
        width = w;
        length = l;
    
    }
    double perimeterOfRectangle() {
        return 2 * (length + width);
    }
    public static void main(String[] args){
       Rectangle rect1 = new Rectangle(15.0, 30.0);
       Rectangle rect2 = new Rectangle(18.0, 24.0);
       System.out.println("Rectangle");
       System.out.println("Area: " + rect1.area_of_Rectangle());
       System.out.println("Perimeter: " + rect2.perimeterOfRectangle());
    }
}