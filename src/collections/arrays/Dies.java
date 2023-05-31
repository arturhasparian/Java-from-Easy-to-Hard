package collections.arrays;

import java.security.SecureRandom;

public class Dies {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] frequency = new int[7];
        for (int i = 0; i < 1000; i++) {
            ++frequency[1 + random.nextInt(6)];
        }

        for (int i : frequency) {
            System.out.println("Side " + i + " : " + frequency[i]);
        }

        multidimArrayLauncher();

    }

    private static void multidimArrayLauncher() {
        int[][] ar = {{1, 2,}, {3, 4, 5, 6}, {7, 8, 9}};
        int[][] ar2 = new int[3][3];
        int[][] ar3 = new int[2][];
        ar3[0] = new int[2];
        ar3[1] = new int[4];

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.println(ar[i][j]);

            }
        }
    }
}
