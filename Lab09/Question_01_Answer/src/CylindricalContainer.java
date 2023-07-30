public class CylindricalContainer extends Container {
    private double height;
    private double radius;

    public CylindricalContainer(double R, double H) {
        this.radius = R;
        this.height = H;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
