import java.util.Scanner;
public class demo {
    
    public static Boolean search(int a[][],int key){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if (a[i][j]==key) {
                    System.out.println("Element found at cell ("+i+ ","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Element not found");
        return false;

    }
  
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length , m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //Output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, 2);
        sc.close();
    }
}