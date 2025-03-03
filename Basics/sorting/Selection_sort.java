public class Selection_sort {
    public static void selection(int a[]){
            int temp;
            for(int i=0;i<a.length-1;i++){
                for(int j=0;j<a.length-1-i;j++){
                    if(a[j]>a[j+1]){
                        temp = a[j+1];
                        a[j+1] = a[j];
                        a[j] = temp;
                    }
                }
            }
            for(int k=0;k<a.length;k++){
                System.out.print(a[k]+" ");
            }
    }
    public static void main(String[] args) {
        int nums[] = {7,2,6,8,9,3,5,8};
        selection(nums);
    }
}
