
import java.util.ArrayList;
import java.util.List;
public class FamilyTree {
    List<Human> humanList;

    List<Human> menList;
    public FamilyTree(List<Human> humanList){
        this.humanList = humanList;
    }
    public FamilyTree(){
        this.humanList = new ArrayList<>();
    }
    public List<Human> SearhChild(Human human1){
        List<Human> childrenList = new ArrayList<>();
        for (Human man : humanList
             ) {
            if (man.getMother() == human1 || man.getFather() == human1){

                childrenList.add(man);
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
