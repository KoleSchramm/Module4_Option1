public class Cylinder extends Shape{
    double radius;
    double height;

    //Constructors
    public Cylinder(){
        radius = 0;
        height = 0;
    }

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    //Surface area and volume
    @Override
    public double surface_area() {
        return 2*Math.PI*radius*height+2*Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return Math.PI*Math.pow(radius,2)*height;
    }

    //Print surface area and volume to string
    public String toString(){
        System.out.println("Cylinder:");
        System.out.println(String.format("Surface Area: %.2f",surface_area()));
        System.out.println(String.format("Volume: %.2f",volume()));
        System.out.println();
        return null;
    }
}
