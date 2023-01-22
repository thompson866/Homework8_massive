import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] white = new int[3];
        for (int q = 0; q < white.length; q++) {
            white[q] = q + 1;
        }
        //   System.out.println(white[q]);

        double[] black = {1.57, 7.654, 9.986};
        //  for (int q = 0; q < black.length; q++) {
        //      System.out.println(black[q]);
        //   }
        int[] green = {100, 98, 55, 18};
        //  for (int q = 0; q < green.length; q++) {
        //  System.out.println(green[q]);
        //   }

        System.out.println("Task 2");
        for (int q = 0; q < white.length; q++) {
            System.out.print(white[q]);
            if (q != white.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int q = 0; q < black.length; q++) {
            System.out.print(black[q]);
            if (q != black.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int q = 0; q < green.length; q++) {
            System.out.print(green[q]);
            if (q != green.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        System.out.println("Task 3");
        for (int q = white.length - 1; q >= 0; q--) {
            System.out.print(white[q]);
            if (q != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int q = black.length - 1; q >= 0; q--) {
            System.out.print(black[q]);
            if (q != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int q = green.length - 1; q >= 0; q--) {
            System.out.print(green[q]);
            if (q != 0) {
                System.out.print(", ");
            }
        }
              System.out.println();
        System.out.println("Task 4 ");
        for (int q = 0; q < white.length; q++) {
            if (white[q] % 2 == 1) {
                white[q]++;
            }
        }
        System.out.println(Arrays.toString(white));


    }
}