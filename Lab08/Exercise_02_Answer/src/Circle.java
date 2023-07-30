public class Circle implements Shape {
    private double ra;
    public Circle(double ra) {
        this.ra = ra;
    }
    // Getter and setter for radius
    public double getRadius() {
        return ra;
    }
    public void setRadius(double ra) {
        this.ra = ra;
    }
    public double calculateArea() {
        return Math.PI * ra * ra;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * ra;
    }
}


