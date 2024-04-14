public class Task8 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введіть послідовність чисел:");
        int num;
        int kilkist = 0;
        int sum = 0;
        while ((num = scanner.nextInt()) != 0) {
            sum = sum + num;
            kilkist++;

        }
        System.out.println("Середнє значення " + sum / kilkist);

        scanner.close();
    }
}
