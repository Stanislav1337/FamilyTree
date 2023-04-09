import java.util.Iterator;
import java.util.List;

public class IteratorFamilyTree implements Iterator<Human>{
    private int index;
    private List<Human> list;

    public IteratorFamilyTree(List<Human> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Human next() {
        return list.get(index++);
    }
}
