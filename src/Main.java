import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        try {
            MujSpojovySeznam seznam = new MujSpojovySeznam();

            seznam.addToEnd(9);
            seznam.addFirst(3);
            seznam.addFirst(4);
            seznam.addToEnd(5);
            seznam.addFirst(1);
            seznam.addFirst(2);

            //System.out.println(seznam.deleteLast());
            //System.out.println(seznam.getIndex(4));
            //System.out.println(seznam.count());
            //System.out.println(seznam.deleteFirst());
            //System.out.println(seznam.indexOf(40));
            System.out.println(seznam.contains(9));
            System.out.println(seznam);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
