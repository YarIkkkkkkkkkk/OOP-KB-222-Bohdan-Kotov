import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] inputArray = { 1, -1, 0, 4, 6, 10, 15, 25 };
        boolean[] resultArray = getSumCheckArray(inputArray);
        System.out.println("Результат: " + Arrays.toString(resultArray));
    }

    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] result = new boolean[array.length];

        result[0] = false;
        result[1] = false;

        for (int i = 2; i < array.length; i++) {
            if (array[i] == array[i - 1] + array[i - 2]) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }

        return result;
    }
}
