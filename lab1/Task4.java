import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введіть кількість незнайомців:");

        Integer numnez = scanner.nextInt();
        if (numnez == 0 || numnez < 0) {
            System.out.println("Кількість має бути додатньою і відмінною від 0");
            scanner.close();
            return;
        } else {
            ArrayList<String> names = new ArrayList<>();
            int i = 0;
            while (i <= numnez) {
                String namenez = scanner.nextLine();
                names.add(namenez);
                i++;
            }
            for (String item : names) {
                System.out.println("Hello, " + item);
            }
        }

        scanner.close();
    }
}
