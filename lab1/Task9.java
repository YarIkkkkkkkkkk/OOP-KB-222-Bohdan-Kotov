public class Task9 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введіть a b c:");
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        Double c = scanner.nextDouble();
        double discrim = (b * b) - 4 * a * c;
        if (discrim < 0) {
            System.out.println("no roots");
        } else if (discrim == 0) {
            System.out.println(-b / (2 * a));
        } else {
            double x1 = (-b + Math.sqrt(discrim)) / (2 * a);
            double x2 = (-b - Math.sqrt(discrim)) / (2 * a);
            System.out.println(x1 + " " + x2);
        }

        scanner.close();
    }
}
