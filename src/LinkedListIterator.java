import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListIterator implements Iterator<Integer> {
    private int aktualniIndex;
    private MujSpojovySeznam linkedList;

    public LinkedListIterator(MujSpojovySeznam linkedList) {
        this.aktualniIndex = 0;
        this.linkedList = linkedList;
    }

    @Override
    public boolean hasNext() {
        return aktualniIndex < linkedList.count();
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        aktualniIndex++;
        return linkedList.getIndex(aktualniIndex - 1);
    }
}