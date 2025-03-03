public class Bubble_sort {
    public static void selection(int a[]){
            for(int i=0;i<a.length-1;i++){
                int min = i; 
                for(int j=i+1;j<a.length-1;j++){
                    if (min > a[j]) {
                        a[j] = min;
                    }
                }
            }
    }
    public static void main(String[] args) {
        int nums[] = {2,1,7,3,8,4};
        selection(nums);
    }
}
