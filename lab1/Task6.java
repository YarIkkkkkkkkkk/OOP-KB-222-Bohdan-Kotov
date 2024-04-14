public class Task6 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введіть загальну суму рахунку та кількість друзів:");

        Integer suma = scanner.nextInt();
        Integer friends = scanner.nextInt();
        if (suma <= 0 || friends <= 0) {
            System.out.println("Сума та кількість друзів мають бути додатнім числом відмінним від 0");
        } else {
            System.out.println("Кожному припадає частина " + (suma + suma * 0.1) / friends);

        }

        scanner.close();
    }
}
