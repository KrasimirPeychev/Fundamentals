package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowNumber = Integer.parseInt(scanner.nextLine());

        int n = rowNumber;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.print(" ");
    }
}

