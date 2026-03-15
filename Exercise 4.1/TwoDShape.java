class TwoDShape {

    private int shapeId;

    protected double radius;

    static int count = 0;

    TwoDShape(int id, double r) {
        shapeId = id;
        radius = r;
        count++;
    }

    void displayShape() {
        System.out.println("Shape ID: " + shapeId);
        System.out.println("Radius: " + radius);
    }
}

class Circle extends TwoDShape {

    double area;

    Circle(int id, double r) {
        super(id, r);
    }

    void calculateArea() {
        area = Math.PI * radius * radius;
    }

    void display() {

        super.displayShape();

        System.out.println("Area of Circle: " + area);
        System.out.println("-------------------------");
    }
}

class Main {
    public static void main(String[] args) {

        Circle[] circles = new Circle[3];

        circles[0] = new Circle(1, 3.0);
        circles[1] = new Circle(2, 4.5);
        circles[2] = new Circle(3, 5.2);

        for (int i = 0; i < circles.length; i++) {
            circles[i].calculateArea();
            circles[i].display();
        }

        System.out.println("Total 2D Shape Objects Created: " + TwoDShape.count);
    }
}