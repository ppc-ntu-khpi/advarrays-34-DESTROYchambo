package domain;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Massiv {

    //метод для сортування
    public static int[][] sortM(int[][] matrix) {
        int n = matrix.length;
        //перетворення матриці в одновимірний масив
        int[] chisla = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .toArray();

        Arrays.sort(chisla);
        //перетворення назад у матрицю 
        return IntStream.range(0, n)
                .mapToObj(i -> Arrays.copyOfRange(chisla, i * n, (i + 1) * n))
                .toArray(int[][]::new);
    }
}
