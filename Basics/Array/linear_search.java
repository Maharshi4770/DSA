import java.util.Scanner;

public class linear_search {

    public static void search(int find[]){
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        for(int i=0;i<find.length;i++){
            if (find[i] == a) {
                flag = true;
            }

        }
        if(flag==true){
            System.out.println("Value is Present in the array");
        }else{
            System.out.println("VAlue is not present in the aray");
        }    
            sc.close();
    }
    public static void main(String[] args) {
        int arr[] = {10,20,40,50,230,23};
        search(arr);
    }
}