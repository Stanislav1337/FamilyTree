import java.util.Iterator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class FamilyTree<T extends Human> implements Serializable , Iterable<T>{
    private List<T> humanList;
    public FamilyTree(List<T> humanList) {
        this.humanList = humanList;
    }
    public FamilyTree() {
        this.humanList = new ArrayList<>();
    }
    public List<T> getHumanList() {
        return humanList;
    }
    public void setHumanList(List<T> humanList) {
        this.humanList = humanList;
    }


    @Override
    public String toString() {
        return "FamilyTree{" +
                "humanList=" + humanList +
                "}\n";
    }



    public void add(T human) {
        humanList.add(human);

    }
    public void removeHuman(T human) {
        if (human.getMother() != null){
            human.getMother().getChildren().remove(human);
        }
        if (human.getFather() != null) {
            human.getFather().getChildren().remove(human);
        }
        humanList.remove(human);
    }
    @Override
    public Iterator<T> iterator() {
        return new IteratorFamilyTree(humanList);
    }
}

