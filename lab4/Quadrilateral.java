package lab4;

public class Quadrilateral extends Figure {
    private Point b;
    private Point c;
    private Point d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        super(a);
        this.b = b;
        this.c = c;
        this.d = d;

        double side1 = Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
        double side2 = Math.sqrt(Math.pow(c.x - b.x, 2) + Math.pow(c.y - b.y, 2));
        double side3 = Math.sqrt(Math.pow(d.x - c.x, 2) + Math.pow(d.y - c.y, 2));
        double side4 = Math.sqrt(Math.pow(a.x - d.x, 2) + Math.pow(a.y - d.y, 2));
        double diagonal = Math.sqrt(Math.pow(c.x - a.x, 2) + Math.pow(c.y - a.y, 2));
        if (side1 + side2 <= diagonal || diagonal + side1 <= side2 || diagonal + side2 <= side1
                || side4 + side3 <= diagonal || diagonal + side3 <= side4 || diagonal + side4 <= side3) {
            throw new IllegalArgumentException("Чотирикутник не існує");
        }
    }

    @Override
    public double getArea() {
        double area = 0.5 * Math
                .abs((a.x * b.y + b.x * c.y + c.x * d.y + d.x * a.y - b.x * a.y - c.x * b.y - d.x * c.y - a.x * d.y));
        return area;
    }

    @Override
    public Point centroid() {

        double centerx = (a.x + b.x + c.x + d.x) / 4;

        double centery = (a.y + b.y + c.y + d.y) / 4;
        return new Point(centerx, centery);
    }

    @Override
    public String toString() {
        return "Quadrilateral [A" + a + "B" + b + "C" + c + "D" + d + "]";
    }

    public static void main(String[] args) {
        Point pointA = new Point(0, 3);
        Point pointB = new Point(3, 3);
        Point pointC = new Point(3, 0);
        Point pointD = new Point(0, 0);
        try {
            Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);
            System.out.println("Площа чотирикутника: " + quadrilateral.getArea());
            System.out.println("Координати центра чотирикутника: " + quadrilateral.centroid());
            System.out.println("Чотирикутник: " + quadrilateral.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}