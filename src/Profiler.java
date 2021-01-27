import java.util.LinkedList;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Random;

public class Profiler {
    public static void main(String[] args) {
        // run the 3 methods
        mainArrList();
        linkArrList();
        hashArrList();
    }

    private static void mainArrList() {
        ArrayList<Integer> items = new ArrayList<>();
        Random rand = new Random();
        for(int i=0; i<200000; i++) {
            items.add(rand.nextInt(200000));
        }

        for(int i=0; i<200000; i++) {
            items.remove(0);
        }
    }

    private static void linkArrList() {
        LinkedList<Integer> items = new LinkedList<Integer>();
        Random rand = new Random();
        for(int i=0; i<200000; i++) {
            items.add(rand.nextInt(200000));
        }

        for(int i=0; i<200000; i++) {
            items.remove(0);
        }
    }

    private static void hashArrList() {
        Hashtable<Integer, Integer> items = new Hashtable<>();
        Random rand = new Random();
        for(int i=0; i<200000; i++) {
            items.put(i, rand.nextInt(200000));
        }

        for(int i=0; i<200000; i++) {
            items.remove(i);
        }
    }
}