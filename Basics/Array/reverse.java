public class reverse {

    public static void array_reverse(int a[]){
        int first=0,last = a.length-1;

        while (first<last) {
            int temp = a[first];
            a[first] = a[last];
            a[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {10,20,30,40,50,60};
        array_reverse(numbers);
        
        //For printing an reverse array
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
