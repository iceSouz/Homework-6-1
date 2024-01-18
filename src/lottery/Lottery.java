package lottery;

import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static final int LENGTH_ARRAY = 7;

    public static void main(String[] args) {
        Random random = new Random();

        int[] array1 = new int[LENGTH_ARRAY];
        int[] array2 = new int[LENGTH_ARRAY];

        for (int i = 0; i < LENGTH_ARRAY; i++) {
            array1[i] = random.nextInt(10);
            array2[i] = random.nextInt(10);
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        int countOfMatches = 0;
        for (int i = 0; i < LENGTH_ARRAY; i++) {
            if (array1[i] == array2[i]) {
                countOfMatches++;
            }
        }

        System.out.println("Array1 = " + Arrays.toString(array1));
        System.out.println("Array2 = " + Arrays.toString(array2));
        System.out.println("Count of matches = " + countOfMatches);
    }
}
