package Practice.NOV27;

import java.util.Iterator;
import java.util.Vector;

public class Test5 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2, 100);

        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());

        Iterator<Integer> it = v.iterator();

        while(it.hasNext()) {
            int n = it.next();
            System.out.println(n);
        }

        int sum = 0;
        for(int num: v){
            sum += num;
        }

        System.out.println(sum);
    }
}
