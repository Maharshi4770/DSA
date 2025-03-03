public class Insertion_Sort {
    public static void i_sort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
           while (j>=0 && a[j]>temp) {
                    //Shift
                    a[j+1] = a[j];
                    j--;
                
           }
           a[j+1] = temp;
        }
    }

    public static void printarray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = { 4, 2, 6, 1, 9, 7 };
        i_sort(a);
        printarray(a);
    }
}
