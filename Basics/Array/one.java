public class one {

    public static void demo(int marks[],int notchangable){
        notchangable = 10;
        for(int i=0;i<marks.length;i++){
            marks[i] += 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {97,98,99};
        int notchangable = 5;
        demo(marks,notchangable);

        System.out.println(notchangable);

        //For printing an array
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}