public class Task2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введіть кількість секунд:");

        Integer seconds = scanner.nextInt();
        while (seconds > 86400) {
            seconds = seconds - 86400;
        }
        int hours = seconds / 3600;
        int remainingSeconds = seconds % 3600;
        int minutes = remainingSeconds / 60;
        int remainingMinutes = remainingSeconds % 60;
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, remainingMinutes);
        scanner.close();
    }
}
