package CountColumnInMatrix2D;

import java.util.Scanner;

public class CountColumnInMatrix2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Array row: ");
        int row = input.nextInt();
        System.out.print("Input Array colum: ");
        int column = input.nextInt();
        double[][] arr2D = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Input element [%d][%d]: ", (i + 1), (j + 1));
                arr2D[i][j] = input.nextInt();
            }
        }
        System.out.println("Current Array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("%-20f", arr2D[i][j]);
            }
            System.out.println("");
        }
        System.out.print("Input column want to count SUM: ");
        int columnLoc = input.nextInt();
        double columnSum = 0;

        if (columnLoc - 1 >= 0 && columnLoc - 1 <= arr2D[0].length - 1) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (columnLoc - 1 == j) {
                        columnSum += arr2D[i][j];
                    }
                }
            }
            System.out.printf("Sum value in column %d is: %f", columnLoc, columnSum);
        } else {
            System.out.println("Column value is invalid");
        }
    }
}
