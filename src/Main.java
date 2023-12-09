import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int summa = 0;
        int summa2 = 0;
        for (int i = 0; i < 400; i++) {
            linkedList.add(new Random().nextInt(20));
            summa+=linkedList.get(i);
        }
        System.out.println("linkedList = " + linkedList);
        System.out.println("summa = " + summa);


        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(linkedList);
        Iterator<Integer> rr = hashSet.iterator();
        while (rr.hasNext()) {
            Integer ee = rr.next();
            summa2+=ee;
        }
        System.out.println("hashSet = " + hashSet);
        System.out.println("summa2 = " + summa2);

    }
}