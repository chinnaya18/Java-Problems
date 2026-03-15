class ThreeDShape {

    private int shapeId;

    protected double radius;
    protected double height;

    static int count = 0;

    ThreeDShape(int id, double r, double h) {
        shapeId = id;
        radius = r;
        height = h;
        count++;
    }

    void displayShape() {
        System.out.println("Shape ID: " + shapeId);
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
    }
}

class Cylinder extends ThreeDShape {

    double surfaceArea;
    double volume;

    Cylinder(int id, double r, double h) {
        super(id, r, h);
    }

    void calculateSurfaceArea() {
        surfaceArea = 2 * Math.PI * radius * (radius + height);
    }

    void calculateVolume() {
        volume = Math.PI * radius * radius * height;
    }

    void display() {

        super.displayShape();

        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);
        System.out.println("----------------------------");
    }
}

class Main {
    public static void main(String[] args) {

        Cylinder[] cyl = new Cylinder[3];

        cyl[0] = new Cylinder(1, 3, 5);
        cyl[1] = new Cylinder(2, 4, 6);
        cyl[2] = new Cylinder(3, 2.5, 7);

        for (int i = 0; i < cyl.length; i++) {
            cyl[i].calculateSurfaceArea();
            cyl[i].calculateVolume();
            cyl[i].display();
        }

        System.out.println("Total 3D Shape Objects Created: " + ThreeDShape.count);
    }
}