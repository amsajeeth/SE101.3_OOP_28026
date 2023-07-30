abstract class Shape {
    public abstract double calculateArea();

    public void display() {
        System.out.println("Shape: " + this.getClass().getSimpleName());
        System.out.println("Area: " + calculateArea());
    }
}