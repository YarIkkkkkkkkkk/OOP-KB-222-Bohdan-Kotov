import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        int[] inputArray = { 18, 1, 3, 6, 7, -5 };
        int[] result = removeLocalMaxima(inputArray);
        System.out.println("Результат виконання: " + Arrays.toString(result));
    }

    public static int[] removeLocalMaxima(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int count = 0;

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                continue;
            }
            result[count] = arr[i];
            count++;
        }
        if (arr[0] <= arr[1]) {
            result[count] = arr[0];
            count++;
        }
        if (arr[n - 1] <= arr[n - 2]) {
            result[count] = arr[n - 1];
            count++;
        }
        int[] finalResult = Arrays.copyOf(result, count);
        return finalResult;
    }
}
