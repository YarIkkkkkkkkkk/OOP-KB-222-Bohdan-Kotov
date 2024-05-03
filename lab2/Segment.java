package lab2;

public class Segment {
    Point start;
    Point end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
        if (start.x == end.x && start.y == end.y) {
            throw new IllegalArgumentException("Точки не повинні співпадати.");
        }

    }

    public double length() {
        return (Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2)));
    }

    public Point middle() {
        double serx = (start.x + end.x) / 2;
        double sery = (start.y + end.y) / 2;
        return new Point(serx, sery);
    }

    public Point intersection(Segment another) {
        double k1 = (end.y - start.y) / (end.x - start.x);
        double k2 = (another.end.y - another.start.y) / (another.end.x - start.x);
        double b1 = start.y - k1 * start.x;
        double b2 = another.start.y - k2 * another.start.x;
        Line line1 = new Line(k1, b1);
        Line line2 = new Line(k2, b2);
        Point peret = (line1.intersection(line2));
        if (peret == null) {
            return null;
        } else if (peret.x >= Math.min(start.x, end.x) &&
                peret.x <= Math.max(start.x, end.x) &&
                peret.y >= Math.min(start.y, end.y) &&
                peret.y <= Math.max(start.y, end.y) &&
                peret.x >= Math.min(another.start.x, another.end.x) &&
                peret.x <= Math.max(another.start.x, another.end.x) &&
                peret.x >= Math.min(another.start.y, another.end.y) &&
                peret.x <= Math.max(another.start.y, another.end.y)) {
            return peret;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        try {
            Point startPoint1 = new Point(1, 1);
            Point endPoint1 = new Point(4, 5);
            Point startPoint2 = new Point(2, 3);
            Point endPoint2 = new Point(5, 2);
            Segment segment1 = new Segment(startPoint1, endPoint1);
            Segment segment2 = new Segment(startPoint2, endPoint2);
            System.out.println("Довжина першого відрізка: " + segment1.length());
            Point middlePoint1 = segment1.middle();
            System.out.println("Середина першого відрізку: " + middlePoint1);
            Point intersectionPoint = segment1.intersection(segment2);
            System.out.println("Точка перетину: " + intersectionPoint);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
    }
}
