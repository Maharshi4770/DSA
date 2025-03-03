import java.util.ArrayList;
import java.util.Collections;

public class AL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //Add Operation it will add an element to the end of and ArrayList generally perform append operation
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);

        //Get Operation
        int a = list.get(0);
        System.out.println(a);                  

        //Add element in between
        list.add(1,5);
        System.out.println(list);

        //Set Element
        list.set(0, 3);
        System.out.println((list));

        //Remove Element
        list.remove(2);

        //Size 
        System.out.println(list.size());

        //loops
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        
        //Sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
