package lab4;

public class Triangle extends Figure {
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        super(a);
        this.b = b;
        this.c = c;
        if (a == b || a == c || b == c) {
            throw new IllegalArgumentException("Точки не повинні співпадати.");
        }
        double side1 = Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
        double side2 = Math.sqrt(Math.pow(c.x - a.x, 2) + Math.pow(c.y - a.y, 2));
        double side3 = Math.sqrt(Math.pow(c.x - b.x, 2) + Math.pow(b.y - c.y, 2));
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalArgumentException("Трикутник з такими точками не існує.");
        }
    }

    @Override
    public double getArea() {
        double area = 0.5 * Math.abs((a.x - c.x) * (b.y - c.y) - (b.x - c.x) * (a.y - c.y));
        return area;
    }

    @Override
    public Point centroid() {
        double centerx = (a.x + b.x + c.x) / 3;

        double centery = (a.y + b.y + c.y) / 3;
        return new Point(centerx, centery);
    }

    @Override
    public String toString() {
        return "Triangle[A" + a + "B" + b + "C" + c + "]";
    }

    public static void main(String[] args) {
        Point pointA = new Point(0, 0);
        Point pointB = new Point(2, 0);
        Point pointC = new Point(6, 2);
        try {
            Triangle triangle = new Triangle(pointA, pointB, pointC);
            System.out.println("Площа трикутника: " + triangle.getArea());
            System.out.println("Координати центра трикутника: " + triangle.centroid());
            System.out.println("Трикутник: " + triangle.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

    }
}
