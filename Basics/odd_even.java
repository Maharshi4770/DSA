import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0) {
            System.out.println("Number is even : "+a);
        }else{
            System.out.println("Number is odd : "+a);
        }
        sc.close();
    }
}
