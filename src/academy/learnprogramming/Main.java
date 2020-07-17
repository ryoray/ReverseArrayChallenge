package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

    }

    private static void reverse(int[] array) {
        int[] arrayToReverse = array;
        int[] arrayReversed = new int[arrayToReverse.length];
        int elementToSwapFirst;
        int elementToSwapLast;
        int temp;
        int FirstElementAfterSwap;
        int LastElementAfterSwap;

        for (int i=0; i<(arrayToReverse.length/2); i++ ) {
            elementToSwapFirst = arrayToReverse[i];
            elementToSwapLast = arrayToReverse[arrayReversed.length-1];
            
            temp = elementToSwapFirst;
            elementToSwapFirst = elementToSwapLast;
            elementToSwapLast = temp;

            arrayReversed[i] = elementToSwapFirst;
            arrayReversed[arrayReversed.length-i] = elementToSwapLast;
        }
    }
}
