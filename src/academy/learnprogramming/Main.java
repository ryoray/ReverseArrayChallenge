package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("How many number : ");
            number = scanner.nextInt();
        } while (number < 1);

        System.out.println("--------Input Number--------");

        int[] array = new int[number];
        for (int i=0; i<array.length; i++) {
            int input = scanner.nextInt();
            scanner.nextLine();
            array[i] = input;
        }

        System.out.println("------Original sequence-----");

        for (int i=0; i<array.length; i++) {
            System.out.println("Element["+ i + "] = " + array[i]);
        }

        int[] reversedArray = reverse(array);

        System.out.println("--------First Method--------");
        for (int i=0; i<reversedArray.length; i++) {
            System.out.println("Element[" + i + "] = " + reversedArray[i]);
        }

        reversedArray = anotherReverse(array);
        System.out.println("-------Second Method--------");
        for (int i=0; i<reversedArray.length; i++) {
            System.out.println("Element[" + i + "] = " + reversedArray[i]);
        }

        minValue(reversedArray);
        maxValue(reversedArray);
    }

    //First solution
    private static int[] reverse(int[] array) {
        int[] arrayReversed = new int[array.length];

        arrayReversed[0] = array[array.length-1];

        for (int i=1; i<array.length; i++ ) {
            int element = array.length-(i+1);
            arrayReversed[i] = array[element];
        }
        return arrayReversed;
    }

    //Another solution
    private static int[] anotherReverse(int[] array) {
        int maxIndex = array.length-1;
        int halfLength = array.length / 2;
        int temp;

        for (int i=0; i<halfLength; i++) {
            temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

        return array;
    }

    private static void minValue(int[] array) {
        int minimum = Integer.MAX_VALUE;

        for (int i=0; i<array.length; i++) {
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }

        System.out.println("-------Minimum Number-------");
        System.out.println("Minimum number is " + minimum);
    }

    private static void maxValue(int[] array) {
        int minimum = Integer.MIN_VALUE;

        for (int i=0; i<array.length; i++) {
            if (minimum < array[i]) {
                minimum = array[i];
            }
        }

        System.out.println("-------Maximum Number-------");
        System.out.println("Maximum number is " + minimum);
    }
}
