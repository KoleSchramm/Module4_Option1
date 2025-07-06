public class Cone extends Shape{
    double radius;
    double height;

    //Constructors
    public Cone(){
        radius = 0;
        height = 0;
    }

    public Cone(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    //Surface area and volume
    @Override
    public double surface_area() {
        return Math.PI*radius*(radius+Math.sqrt(Math.pow(height,2) + Math.pow(radius,2)));
    }

    @Override
    public double volume() {
        return Math.PI*Math.pow(radius,2)*(height/3);
    }

    //Print surface area and volume to string
    public String toString(){
        System.out.println("Cone:");
        System.out.println(String.format("Surface Area: %.2f",surface_area()));
        System.out.println(String.format("Volume: %.2f",volume()));
        System.out.println();
        return null;
    }
}
