package lab2;

public class Triangle {
    Point ver1;
    Point ver2;
    Point ver3;

    public Triangle(Point ver1, Point ver2, Point ver3) {
        this.ver1 = ver1;
        this.ver2 = ver2;
        this.ver3 = ver3;
        if (ver1 == ver2 || ver1 == ver3 || ver2 == ver3) {
            throw new IllegalArgumentException("Точки не повинні співпадати.");
        }
        double side1 = new Segment(ver1, ver2).length();
        double side2 = new Segment(ver1, ver3).length();
        double side3 = new Segment(ver2, ver3).length();

        if (side1 + side2 <= side3 || side1 + side3 <= side2
                || side2 + side3 <= side1) {
            throw new IllegalArgumentException("Трикутник з такими точками не існує.");
        }
    }

    public double area() {
        double area = 0.5 * Math.abs(
                (ver1.x - ver3.x) * (ver2.y - ver3.y) - (ver2.x - ver3.x) * (ver1.y - ver3.y));
        return area;
    }

    public Point centroid() {
        double centerx = (ver1.x + ver2.x + ver3.x) / 3;
        double centery = (ver1.y + ver2.y + ver3.y) / 3;
        return new Point(centerx, centery);
    }

    public static void main(String[] args) {
        try {
            Point ver1 = new Point(0, 0);
            Point ver2 = new Point(1, 5);
            Point ver3 = new Point(2, 3);
            Triangle triangle = new Triangle(ver1, ver2, ver3);
            double area = triangle.area();
            Point centroid = triangle.centroid();
            System.out.println("Площа трикутника: " + area);
            System.out.println("Координати центра трикутника: " + centroid);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;

        }
    }
}
