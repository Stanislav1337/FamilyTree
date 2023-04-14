package FamilyTrees;

import Creatures.Creature;
import Humans.Human;
import java.util.Iterator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class FamilyTree<T extends Creature> implements Serializable , Iterable<T>{
    private List<T> humanList;
    public FamilyTree(List<T> humanList) {
        this.humanList = humanList;
    }
    public FamilyTree() {
        this.humanList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "FamilyTrees.FamilyTree{" +
                "humanList=" + humanList +
                "}\n";
    }
    public void add(T human) {
        humanList.add(human);

    }

    @Override
    public Iterator<T> iterator() {
        return new IteratorFamilyTree(humanList);
    }
}

