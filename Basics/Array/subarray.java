public class subarray {
                                                                    
    public static void sub_array(int a[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                currsum = 0;
                for(int k=i;k<=j;k++){
                    currsum +=a[k];
                }
                if (maxsum <currsum) {
                    maxsum = currsum;
                }
                System.out.println(currsum);
            }
        }
        System.out.println("Max sum is "+maxsum);
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};
        sub_array(nums);
    }
}