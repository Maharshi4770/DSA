public class diagonal_sum {
    public static int summation(int a[][]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == j) {
                    sum += a[i][j];
                } else if (i + j == a.length - 1) {
                    sum += a[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        summation(a);
    }
}
