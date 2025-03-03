public class prime_range {

    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void primeraneg(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primeraneg(10);
    }
}
