public class Bubble_sort {
    public static void b_sort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void printarray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[] = {5,3,9,1,4};
        b_sort(a);
        printarray(a);
    }
}