public class bonus {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;i<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                System.out.print(k+" ");
            }
            for(int l=1;l<n;l++){
                System.out.println(l+" ");
            }
            System.out.println();
        }
    }
}
