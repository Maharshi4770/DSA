import java.util.Scanner;

public class largest_threee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if (a > b && a > c) {
            System.out.println("A is larger Element : "+a);
        }
        else if(b > c && b > a){
            System.out.println("B is larger Element : "+b);
        }
        else{
            System.out.println("C is Larger Element : "+max);
        }
        sc.close();
    }
}