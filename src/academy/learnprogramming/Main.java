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

        System.out.println("----------------------------");

        int[] array = new int[number];
        for (int i=0; i<array.length; i++) {
            int input = scanner.nextInt();
            scanner.nextLine();
            array[i] = input;
        }

        System.out.println("----------------------------");

        for (int i=0; i<array.length; i++) {
            System.out.println("Element["+ i + "] = " + array[i]);
        }

        int[] reversedArray = reverse(array);

        System.out.println("----------------------------");
        for (int i=0; i<reversedArray.length; i++) {
            System.out.println("Element[" + i + "] = " + reversedArray[i]);
        }
    }

    private static int[] reverse(int[] array) {
        int[] arrayReversed = new int[array.length];

        arrayReversed[0] = array[array.length-1];

        for (int i=1; i<array.length; i++ ) {
            int element = array.length-(i+1);
            arrayReversed[i] = array[element];
        }
        return arrayReversed;
    }
}
