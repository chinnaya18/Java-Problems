abstract class Shapes {

    protected String color;
    protected String name;
    protected int sno;

    static int count = 0;

    Shapes(String color, String name) {
        this.color = color;
        this.name = name;
        sno = ++count;
    }

    void displayInfo() {
        System.out.println("Shape No: " + sno);
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }

    static int countInfo() {
        return count;
    }
}


abstract class TwoDShapes extends Shapes {

    TwoDShapes(String color, String name) {
        super(color, name);
    }

    abstract double getArea();
}

abstract class ThreeDShapes extends Shapes {

    protected double volume;

    ThreeDShapes(String color, String name) {
        super(color, name);
    }

    abstract double getVolume();
}

class Circle extends TwoDShapes {

    private double radius;

    Circle(String color, String name, double radius) {
        super(color, name);
        this.radius = radius;
    }

    double getArea() {
        double area = Math.PI * radius * radius;

        displayInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("----------------------");

        return area;
    }
}

class Cuboid extends ThreeDShapes {

    private double length;
    private double width;
    private double height;

    Cuboid(String color, String name, double l, double w, double h) {
        super(color, name);
        length = l;
        width = w;
        height = h;
    }

    double getVolume() {
        volume = length * width * height;

        displayInfo();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Volume: " + volume);
        System.out.println("----------------------");

        return volume;
    }
}

/* class TestShape {

    public static void main(String[] args) {

        Circle c1 = new Circle("Red", "Circle", 5);
        c1.getArea();

        Cuboid cb1 = new Cuboid("Blue", "Cuboid", 4, 3, 2);
        cb1.getVolume();

        System.out.println("Total Shapes Created: " + Shapes.countInfo());
    }
} */

/* class TestShapes {

    public static void main(String[] args) {

        Shapes[] shapes = new Shapes[4];

        shapes[0] = new Circle("Green", "Circle", 3);
        shapes[1] = new Circle("Yellow", "Circle", 4);
        shapes[2] = new Cuboid("Black", "Cuboid", 2, 3, 4);
        shapes[3] = new Cuboid("White", "Cuboid", 5, 2, 3);

        for (Shapes s : shapes) {

            if (s instanceof Circle)
                ((Circle) s).getArea();

            if (s instanceof Cuboid)
                ((Cuboid) s).getVolume();
        }

        System.out.println("Total Shapes Created: " + Shapes.countInfo());
    }
} */

class polyTestShapes {

    public static void main(String[] args) {

        Shapes s1 = new Circle("Pink", "Circle", 6);
        Shapes s2 = new Cuboid("Gray", "Cuboid", 3, 4, 5);

        ((Circle) s1).getArea();
        ((Cuboid) s2).getVolume();

        System.out.println("Total Shapes Created: " + Shapes.countInfo());
    }
}