package Services;

import Creatures.Creature;
import FamilyTrees.FamilyTree;
import Genders.Sex;
import Humans.Human;
import WorkFiles.InOutFiles;
import WorkFiles.inOutSerialObject;

import java.util.List;

public class Service {
    private int id;
    private FamilyTree<Creature> familyGroup;
    public Service(FamilyTree familyGroup) {
        this.familyGroup = familyGroup;

    }
    public Service() {
        this.familyGroup = new FamilyTree<Creature>();

    }
    public FamilyTree getFamilyGroup() {
        return familyGroup;
    }


    public boolean delHumanID(int id){
        familyGroup.delHumanID(id);
        return true;
    }
    public void addHuman(String name, String lastname,  Sex sex, Human mother, Human father) {
        id++;
        familyGroup.add(new Human(id, name, lastname,  sex, mother, father));
    }

    public void addHuman(String name, String lastname,  Sex sex) {
        id++;
        familyGroup.add(new Human(id, name, lastname,  sex, null, null));
    }


    public List<Creature> searchHuman(String name){
        return familyGroup.searchHuman(name);
    }
    public void sortByID() {
        familyGroup.sortByID();
    }

    public void sortByName() {
        familyGroup.sortByName();
    }

    public void saveFamilyGroup(String str) {
        InOutFiles save = new inOutSerialObject();
        save.saveFile(this.familyGroup, str);
    }

    public void loadFamilyGroup(String str) {
        InOutFiles load = new inOutSerialObject();
        this.familyGroup = load.loadFile(str);
        id = 1;
        for (Creature item : this.familyGroup) {
            if (id < item.getId()) id = item.getId();
        }
    }


}
