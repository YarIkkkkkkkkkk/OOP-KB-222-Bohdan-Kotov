package lab4;

public class Circle extends Figure {
    private int radius;

    public Circle(Point a, int radius) {
        super(a);
        this.radius = radius;
        if (radius <= 0) {
            throw new IllegalArgumentException("Таке коло не існує");
        }
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public Point centroid() {
        return a;
    }

    @Override
    public String toString() {
        return "Circle [" + a + radius + "]";
    }

    public static void main(String[] args) {
        Point center = new Point(0, 0);
        try {
            Circle circle = new Circle(center, 6);
            System.out.println("Площа кола: " + circle.getArea());
            System.out.println("Координати центра кола: " + circle.centroid());
            System.out.println("Коло: " + circle.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}