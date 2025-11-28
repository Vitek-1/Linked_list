import java.util.Iterator;

public class MujSpojovySeznam implements Iterable<Integer>{

    private Node head;
    private Node tail;
    private int size;

    public MujSpojovySeznam() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    public void addToEnd(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            addFirst(value);
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public int getIndex(int index){
        int cislo = 0;
        Node curr = head;
        for (int i = 0; i < index+1; i++) {
            if (curr != null) {
                cislo = curr.value;
                curr = curr.next;
            }else{
                System.out.println("Nelze najit index");
            }
        }
        return cislo;
    }

    public int deleteLast(){
        int cislo;
        Node delete = head;
        for (int i = 0; i < size - 2 ; i++) {
            delete = delete.next;
        }
        cislo = delete.next.value;
        delete.next = null;

        tail = delete;
        size--;
        return cislo;
    }

    public int count(){
        return size;
    }

    public int deleteFirst(){
        int cislo = head.value;
        head = head.next;
        size--;
        return cislo;
    }

    public boolean isEmpty(){
        if (size != 0){
            return false;
        }
        return true;
    }

    public int indexOf(int value){
        Node hledany = head;
        for (int i = 0; i < size - 1; i++) {
            if (hledany.value == value){
                return i;
            }
            hledany = hledany.next;
        }
        return -1;
    }

    public boolean contains(int value){
        Node temp = head;
        for (int i = 0; i < size - 1; i++) {
            if (temp.value == value){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public String toString() {
        String text = "";
        Node curr = head;
        while (curr != null) {
            text += curr.value + " --> ";
            curr = curr.next;
        }
        text += "null";
        return text;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value = " + value +
                    '}';
        }
    }

}
