public class six {

    public static void inverted_half_pyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_half_pyramid(4);
        inverted_half_pyramid(5);
        inverted_half_pyramid(6);
    }
}