public class Task1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введіть рядок:");

        String input = scanner.nextLine();

        System.out.println("Hello, " + input);
        scanner.close();
    }
}
