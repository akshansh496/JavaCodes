package Hashmap;
import java.util.*;
public class HashSet_Code {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);


        if(set.contains(4))
        System.out.println("contians 4");
        set.remove(2);
        if(set.contains(2))
        System.out.println("contians 2");
        System.out.println(set.size());
        // set.clear();
        // System.out.println(set.size());

        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add ("Delhi");
        lhs.add ("Mumbai");
        lhs.add ("Noida");
        lhs.add ( "Bengaluru");
        System.out.println(lhs);
        TreeSet<String> ts = new TreeSet<>();
        ts.add ("Delhi");
        ts. add ( "Mumbai");
        ts.add ( "Noida");
        ts.add ( "Bengaluru");
        System.out.println(ts);

    }
}
