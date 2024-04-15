public class Task5 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введіть a b h:");

        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        Integer h = scanner.nextInt();
        if (a > b || a >= h) {
            int day = 0;
            int pidn = 0;
            while (pidn < h) {
                pidn = pidn + a;
                day++;
                if (pidn < h) {
                    pidn = pidn - b;
                }
            }
            System.out.println("Підніметися за " + day + " днів");

        } else {
            System.out.println("Impossible");
        }
        scanner.close();
    }
}