package lab4;

public abstract class Figure {
    protected Point a;

    public Figure(Point a) {
        this.a = a;
    }

    public abstract double getArea();

    public abstract Point centroid();

    public abstract String toString();
}