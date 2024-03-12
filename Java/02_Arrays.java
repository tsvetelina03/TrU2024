import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = generateRandomArray(10);
        System.out.println("Генериран масив: " + Arrays.toString(array));
        findMinMaxAndSwap(array);
        System.out.println("Масив след размяната: " + Arrays.toString(array));
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static void findMinMaxAndSwap(int[] array) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            } else if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        System.out.println("Минимален елемент: " + array[minIndex]);
        System.out.println("Максимален елемент: " + array[maxIndex]);
    }
}
