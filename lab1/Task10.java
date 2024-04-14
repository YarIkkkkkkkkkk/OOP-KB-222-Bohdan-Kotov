public class Task10 {
    public static void main(String[] args) {
        int[] array = { 3, 7, 2, 9, 5 };
        int maxElement = max(array);
        System.out.println("Максимальний елемент: " + maxElement);
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
