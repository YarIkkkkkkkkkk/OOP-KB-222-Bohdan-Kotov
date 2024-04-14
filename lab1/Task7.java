public class Task7 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введіть послідовність чисел:");
        int num;
        int max = Integer.MIN_VALUE;
        while ((num = scanner.nextInt()) != 0) {

            if (num > max) {
                max = num;
            }

        }
        System.out.println("Найбільше число " + max);

        scanner.close();
    }
}
