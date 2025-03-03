public class spiral_matrix {

    public static void print_spiral(int a[][]){
        int startrow = 0;
        int startcol = 0;
        int endcol = a[0].length-1;
        int endrow = a.length-1;

        while (startrow<=endrow && startcol<=endcol) {
            //Top
            for(int j=startcol;j<=endcol;j++){
                System.out.print(a[startrow][j]+" ");
            }
            //Right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(a[i][endcol]+" ");
            }
            //Bottom
            for(int j=endcol-1;j>=startcol;j--){
                if(startcol==endcol){
                    return;
                }
                System.out.print(a[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i--){
                System.out.print(a[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        print_spiral(a);
    }
}
