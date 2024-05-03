package lab2;

public class Line {
    double k;
    double b;

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        if (this.k == other.k) {
            return null;
        } else {
            double x = (other.b - this.b) / (this.k - other.k);
            double y = this.k * x + this.b;
            return new Point(x, y);

        }
    }

    public static void main(String[] args) {
        Line line1 = new Line(1.0, 1.0);
        Line line2 = new Line(-1.0, 3.0);
        System.out.println(line1.intersection(line2));

    }
}
