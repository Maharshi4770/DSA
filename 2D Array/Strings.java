import java.util.Scanner;
public class Strings {
    public static void printstring(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        System.out.println(name1 + name2 +"is this");
        String friend = "no one";
        System.out.println(friend.charAt(5));
        String s1 = "Mummy";
        printstring(s1);
        //Finding an length of an string
        // System.out.println(name1.length());
        sc.close();
    }
}
