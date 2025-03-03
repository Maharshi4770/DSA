import java.util.Scanner;

public class sum_n {

    public static void main(String[] args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while (i<=n) {
            a += i;
            i++;
        }
        System.out.println(a);
        sc.close();
    }
}