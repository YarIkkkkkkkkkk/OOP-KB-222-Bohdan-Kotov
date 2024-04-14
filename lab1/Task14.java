import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] array1 = { 1, 3, 2, 7, 4 };
        int[] array2 = { 1, 3, 2, 7, 4 };
        System.out.println("Введіть параметр зсуву: ");
        Integer shift = scanner.nextInt();
        scanner.close();
        cycleSwap(array1);
        System.out.println("Результат виконання cycleSwap: " + Arrays.toString(array1));
        cycleSwap(array2, shift);
        System.out.println("Результат виконання cycleSwap за введеним параметром зсуву : " + Arrays.toString(array2));
    }

    public static void cycleSwap(int[] array) {
        int n = array.length;
        int lastElement = array[n - 1];
        for (int i = n - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElement;
    }

    public static void cycleSwap(int[] array, int shift) {
        int n = array.length;
        for (int s = 0; s < shift; s++) {
            int lastElement = array[n - 1];
            for (int i = n - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = lastElement;
        }
    }

}
