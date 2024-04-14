public class Task3 {
    public static final int passvord = 1488;

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введіть пароль:");

        Integer inpassword = scanner.nextInt();
        if (inpassword == passvord) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
        scanner.close();
    }
}