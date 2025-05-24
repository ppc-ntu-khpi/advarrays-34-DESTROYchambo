package test;

import static domain.Massiv.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Вхідна матриця N
        int[][] matrix = {
            {1, 4, 9},
            {5, 8, 6},
            {3, 5, 0}
        };
        
        //вивід початкової матриці
        System.out.println("first matrix:");
        Arrays.stream(matrix).forEach(row
                -> System.out.println(Arrays.toString(row)));

        int[][] sorted = sortM(matrix);
        
        //вивід відсортованої матриці
        System.out.println("sorted: ");
        Arrays.stream(sorted).forEach(row
                -> System.out.println(Arrays.toString(row)));
    }
}
