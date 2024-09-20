import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class GenericPractice<M extends Number & Comparable<M>> {

    //private ArrayList<M> list;
    private LinkedList<M> list;
    private M initVal;

    public GenericPractice(M initVal) {
        this.initVal = initVal;
        //list = new ArrayList<>();
        list = new LinkedList<>();
        list.add(this.initVal);
    }

    public void storeValue(M val) {
        list.add(val);
    }

    public void changeValue(M val, int index) {
        list.set(index, val);
    }

    public void printArray() {
        if (list.isEmpty()) {
            System.out.println("empty list");
            return;
        }

        // print using an iterator
        Iterator<M> iter = list.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public void sortPrintArray() {
        list.sort(null);

        // print with for-each loop
        for (M val : list) {
            System.out.println(val);
        }
    }

    public void sortReversePrintArray() {
        list.sort(Collections.reverseOrder());

        // print with for-each method
        list.forEach(System.out::println);
    }

    public void clearList() {
        list.clear();
    }

    public static void main(String[] args) {
        GenericPractice<Integer> g = new GenericPractice<>(0);

        g.storeValue(1);
        g.storeValue(2);
        g.storeValue(3);

        g.printArray();

        System.out.println("--- reverse");

        g.sortReversePrintArray();

        System.out.println("--- sort");

        g.sortPrintArray();

        System.out.println("--- append");

        g.storeValue(4);
        g.storeValue(5);
        g.storeValue(6);

        g.printArray();

        System.out.println("--- change");

        g.changeValue(10, 0);

        g.printArray();

        System.out.println("--- clear");

        g.clearList();

        g.printArray();
    }
}