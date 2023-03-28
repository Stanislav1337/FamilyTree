
import java.util.ArrayList;
import java.util.List;
public class FamilyTree {
    List<Human> humanList;
    public FamilyTree(List<Human> humanList){
        this.humanList = humanList;
    }
    public FamilyTree(){
        this.humanList = new ArrayList<>();
    }
    public List<Human> SearhChild(Human human1){
        List<Human> childrenList = new ArrayList<>();
        for (Human a : humanList
             ) {
            if (a.getMother() == human1 || a.getFather() == human1){

                childrenList.add(a);
            }

        }
            return childrenList;
    }
    @Override
    public String toString() {
        return "FamilyTree{" +
                "humanList=" + humanList +
                '}';
    }

}
