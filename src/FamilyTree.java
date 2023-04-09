import java.util.Iterator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class FamilyTree implements Serializable, Iterable<Human> {
    private List<Human> humanList;

    public FamilyTree(List<Human> humanList) {
        this.humanList = humanList;
    }

    public FamilyTree() {
        this.humanList = new ArrayList<>();
    }

    public List<Human> SearhChild(Human human1) {
        List<Human> childrenList = new ArrayList<>();
        for (Human man : humanList
        ) {
            if (man.getMother() == human1 || man.getFather() == human1) {

                childrenList.add(man);
            }

        }
        return childrenList;

    }
    public List<Human> getHumanList() {
        return humanList;
    }

    public void setHumanList(List<Human> humanList) {
        this.humanList = humanList;
    }

    @Override
    public String toString() {
        return "FamilyTree{" +
                "humanList=" + humanList +
                '}';
    }


    public void add(Human parent1) {
        humanList.add(parent1);

    }

    @Override
    public Iterator iterator() {
        return new FamilyIterator(humanList);
    }

}


