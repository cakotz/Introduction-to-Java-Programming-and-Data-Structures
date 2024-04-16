public class Rectangle {
    /*
    double width - Specifies the width of the rectangle object.
    double height - Specifies the height of the rectangle object.
     */
    private double width = 1;
    private double height = 1;

    //Getters and setters for width and height.
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    //Default constructor.
    Rectangle() {}

    //Argument constructor.
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }



    //Returns the area of the rectangle object.
    public double getArea() {
        return width * height;
    }

    //Returns the perimeter of the rectangle object
    public double getPerimeter() {
        return (width * 2) + (height * 2);
    }
}
