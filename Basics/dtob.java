public class dtob {
    public static void conversion(int n){
        int mynum = n;
        int binnum = 0;
        int pow = 0;

        while (n>0) {
            int rem = n%2;
            binnum =  binnum + (rem * (int)Math.pow(10, pow));

            pow++;
            n = n/2;
        }
        System.out.println("Binary form of "+mynum+ " is "+binnum);
    }
    public static void main(String[] args) {
        conversion(5);
    }
}
