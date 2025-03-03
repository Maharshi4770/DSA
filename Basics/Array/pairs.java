public class pairs {

    public static void pairs(int nums[]){
        int tp =0;
        for(int i=0;i<nums.length;i++){
            int curr = nums[i]; 
            for(int j=i+1;j<nums.length;j++){
                System.out.print("("+curr+","+nums[j]+") ");
            }
            System.out.println();
        }
        System.out.println("Total pairs are : "+tp);
    }
    public static void main(String[] args) {
        int number[]= {3,6,9,12,15,18,21};
        pairs(number);
    }
}
