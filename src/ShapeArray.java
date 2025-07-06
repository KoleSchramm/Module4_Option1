public class ShapeArray {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[3];

        Sphere sphere = new Sphere(4);
        Cylinder cylinder = new Cylinder(4,4);
        Cone cone = new Cone(4,4);

        shapeArray[0] = sphere;
        shapeArray[1] = cylinder;
        shapeArray[2] = cone;

        for(int i = 0; i<3; i++){
            shapeArray[i].toString();
        }
    }
}
