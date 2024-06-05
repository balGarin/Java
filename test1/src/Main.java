import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {7, 4, 2, 0, 1, 3, 4, 9};
//        System.out.println(Arrays.toString(array));
//
//        insertionSort(array);
//        System.out.println(Arrays.toString(array));
        choiceSort(array);


    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            /*
             * К этой строчке массив [0, ..,  j] отсортирован и все его элементы меньше key.
             * В то же время массив [j + 2, .., i] отсортирован и все его элементы больше key.
             * Если вставить key на место j + 1 весь массив [0, .., i] станет отсортированным.
             */
            array[j + 1] = key;
        }
    }

    public static void sortedByMe(int[] array) {
        int minIndex = 0;
        int swap = 0;
        int iterator = 1;
        while (iterator != array.length) {
            for (int i = iterator; i < array.length; i++) {
                if (array[minIndex] > array[i]) {
                    swap = array[minIndex];
                    array[minIndex] = array[i];
                    array[i] = swap;
                }
            }
            iterator++;
            minIndex++;
        }


    }

    public static void choiceSort(int[] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int swap = array[i];
            array[i] = array[minIndex];
            array[minIndex] = swap;
        }
       LocalDate localDate=LocalDate.of(2012,11,3);
localDate.compareTo(LocalDate.of(2022,11,2));

    }


}

