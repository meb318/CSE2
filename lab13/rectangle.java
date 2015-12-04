//Max Brungardt
//Print area of a rectangle using non static methods

public class rectangle{ //class
    
    double x;//non static variable for width
    double y;//non static variable for height
    public double height; //setting variable to be used in multiplication
    public double width; //setting variable to be used in multiplication
        
    public void setWidth(double x){ //width method
        width = x; //set width variable equal to x
    }
    public void setHeight(double y){ //height method
        height = y; //set height variable equal to y
    }
    public double getArea(){ //area method
        return width * height; //return the multiplication of x * y
    }
    
    public static void main(String[] args){ //main method
        rectangle r1 = new rectangle(); //set varaible r1 of type Rectangle
        r1.setHeight(5.3); //initialize height
        r1.setWidth(7.3); //initialize width
        System.out.println(r1.getArea()); //print the area of the rectangle
        
    }
}