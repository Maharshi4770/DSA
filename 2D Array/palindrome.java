public class palindrome{

    public static void checkpalindrome(String str){
        int flag = 0;
        for(int i=0;i<str.length()/2;i++){
            if (str.charAt(i)==str.charAt(str.length()-i-1)) {
                flag = 1;
            }
        }
        
        if (flag==0) {
            System.out.println("String is not palindrome");
        }else{
            System.out.println("String is palindrome");
        }
    }
    public static void main(String[] args) {
        String s1 = "Sona";
        checkpalindrome(s1);
    }
}