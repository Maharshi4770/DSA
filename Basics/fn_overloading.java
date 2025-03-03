public class fn_overloading {
    public static int sum(int a,int b,int c){
        return a + b + c;
    }
    public static int sum(int a,int b){
        return a + b;
    }
    public static int sum(int a,int b,int c,int d){
        return a + b + c + d;
    }
    public static int minus(int a,int b){
        return a - b;
    }
    public static double minus(double a,double b){
        return a - b;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,2,3,5));
        System.out.println(sum(5,2,3));
        System.out.println(sum(5,2));
        System.out.println(minus(5, 2));
        System.out.println(minus(7.5, 4.3));
    }    
}
