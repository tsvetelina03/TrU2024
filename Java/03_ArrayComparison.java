import java.util.Arrays;

public class ArrayComparison {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50, 60};
        int[] arr2 = {10, 20, 30, 40, 50, 60};
        int[] arr3 = {6, 5, 3, 2, 1};

        boolean areArr1AndArr2Equal = arrEqual(arr1, arr2);
        boolean areArr1AndArr3Equal = arrEqual(arr1, arr3);

        System.out.println("Are arr1 and arr2 equal? " + areArr1AndArr2Equal);
        System.out.println("Are arr1 and arr3 equal? " + areArr1AndArr3Equal);
    }

    static boolean arrEqual(int[] firstArr, int[] secondArr) {
        // Проверяваме дали дължините на масивите са еднакви
        if (firstArr.length != secondArr.length) {
            return false;
        }

        // Използваме метода equals от класа Arrays за сравнение на масивите
        return Arrays.equals(firstArr, secondArr);
    }
}
