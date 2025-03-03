public class BtoD {
    public static void conversion(int n){
        int mynum = n;
        int pow = 0;
        int decnum = 0;

        while (n>0) {
            double ld = n % 10;
            decnum =  (int)(decnum + (ld * Math.pow(2, pow)));

            pow++;
            n = n/10;
        }
        System.out.println("Decimal of " +mynum+ " is "+decnum);
    }
    public static void main(String[] args) {
        conversion(101);
    }
}
