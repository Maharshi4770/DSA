public class callby_value {
    public static void swap(int a, int b){
        int temp =  a;
        a = b;
        b = temp;
        System.out.println("Value of a is : "+a+" Value of b is : "+b);

    }
    public static void main(String[] args) {
        swap(5, 3);
    }
}
