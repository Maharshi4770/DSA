import java.util.Scanner;

public class function {
    public static int sum(int a,int b){ //parameters or formal parameters that we are defined in function defination
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum(a,b); 
        // Arguments or Actual Parameters function call we can pass
        System.out.println("The sum is : "+sum);
        sc.close();
    }
}