import java.util.Arrays;
import java.util.Scanner;

public class RecurringElementsInArrayH {
    public static void printRecurringElementsInArray(int[] arr) {
        int i, j, count;
        for (i = 0; i < arr.length; i++) {
            count = 1;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                } else {
                    break;
                }
            }
            i = j - 1;
            if (count > 1) {
                System.out.println("The recurring element is " + arr[i] + " and its repeated " + count + " times in the given array.");
            }
        }
    }
    public static void printRepeatingElementsInArray(int[] arr) {
        System.out.println("Repeated elements are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && (i != j)) {
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        printRecurringElementsInArray(arr);

        System.out.println();
        printRepeatingElementsInArray(arr);
    }
}

