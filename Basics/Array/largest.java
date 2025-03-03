public class largest {
    public static int largest_number(int max[]) {
        int largest = Integer.MIN_VALUE;
        // boolean flag = true;
        for (int i = 0; i < max.length; i++) {
            if (max[i] > largest) {
                largest = max[i];
                // flag = true;
            }
        }               
        // if (flag == true) {
        //     System.out.println("Largest number is " + largest);
        // }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 40, 50, 224, 23 };
        System.out.println("Largest Number is :" + largest_number(arr));
    }
}