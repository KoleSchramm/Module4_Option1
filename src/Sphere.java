public class Sphere extends Shape{

    double radius;

    //Constructors
    public Sphere(){
        radius = 0;
    }

    public Sphere(double radius){
        this.radius = radius;
    }

    //Surface area and volume
    @Override
    public double surface_area() {
        return 4*Math.PI*Math.pow(radius,2);
    }

    @Override
    public double volume() {
        return (4.0/3)*Math.PI*Math.pow(radius,3);
    }

    //Print surface area and volume to string
    public String toString(){
        System.out.println("Sphere:");
        System.out.println(String.format("Surface Area: %.2f",surface_area()));
        System.out.println(String.format("Volume: %.2f",volume()));
        System.out.println();
        return null;
    }
}
