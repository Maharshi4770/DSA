import java.util.Scanner;
public class binary_search {

    public static int b_search(int arr[]){
        Scanner sc = new Scanner(System.in);
        int key =sc.nextInt();
        int first = 0 , last = arr.length-1; 

        while (first<=last) {
            int mid = (first+last)/2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                first = mid+1;
            }else{
                last = mid - 1;
            }
            sc.close();
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {5,12,15,18,20,23,27,33 };
        System.out.println("Index for key is : " + b_search(num));
    }
}
