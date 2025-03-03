public class counting {

    public static void Counting(int a[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            largest = Math.max(largest,a[i]);
            // if(a[i]>largest){  Both is correct do w
            //     largest = a[i];
            // }
        }
        int count[] = new int[largest+1];
        for(int i=0;i<a.length;i++){
            count[a[i]]++;
        }

        //Sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                a[j] = i;
                j++;
                count[i]--;
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
        int a[] = {5,4,3,1,4,2};
        Counting(a);
        printarray(a);
    }
}
