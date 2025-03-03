public class bcoefficient {
public static int fact(int n){
    int fact = 1;
    for(int i=1;i<=n;i++){
        fact = fact * i;
    }
    return fact;
}

    public static int binCoeff(int n,int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int nmr = fact(n-r);
        int bcoe = fact_n/(fact_r * nmr);
        return bcoe;
    }
    public static void main(String[] args) {
            System.out.println(binCoeff(5, 2));
    }
}