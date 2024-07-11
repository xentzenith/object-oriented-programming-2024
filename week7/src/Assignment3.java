import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        int[] myArray = {23, 45, 1, 56, 34, 78, 9, 22, 48, 45};

        // Array Sorting
        bubbleSort(myArray);
        System.out.println("Sorted array: " + Arrays.toString(myArray));

        // Array Manipulation
        int[] newArray = new int[myArray.length * 2];
        System.arraycopy(myArray, 0, newArray, 0, myArray.length);
        Random rand = new Random();
        for (int i = myArray.length; i < newArray.length; i++) {
            newArray[i] = rand.nextInt(100) + 101;
        }
        System.out.println("New array: " + Arrays.toString(newArray));

        // Array Searching
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int searchNumber = scanner.nextInt();
        int searchIndex = -1;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == searchNumber) {
                searchIndex = i;
                break;
            }
        }
        if (searchIndex != -1) {
            System.out.println("Number found at index: " + searchIndex);
        } else {
            System.out.println("Number not found.");
        }
        

        // Array Modification
        System.out.print("Enter an index to modify: ");
        int modifyIndex = scanner.nextInt();
        System.out.print("Enter a new value: ");
        int newValue = scanner.nextInt();
        if (modifyIndex >= 0 && modifyIndex < newArray.length) {
            newArray[modifyIndex] = newValue;
            System.out.println("Modified array: " + Arrays.toString(newArray));
        } else {
            System.out.println("Index out of bounds.");
        }

        // Array Rotation
        System.out.print("Enter number of positions to rotate: ");
        int positions = scanner.nextInt();
        rotateLeft(newArray, positions);
        scanner.close();
        System.out.println("Rotated array: " + Arrays.toString(newArray));
    }

    // Bubble sort algorithm
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swapping arrays
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Rotate array to the left by given positions
    public static void rotateLeft(int[] array, int positions) {
        int n = array.length;
        positions = positions % n;
        int[] temp = new int[positions];
        System.arraycopy(array, 0, temp, 0, positions);
        System.arraycopy(array, positions, array, 0, n - positions);
        System.arraycopy(temp, 0, array, n - positions, positions);
    }


}
