package Services;

import Creatures.Creature;
import FamilyTrees.FamilyTree;
import WorkFiles.InOutFiles;
import WorkFiles.inOutSerialObject;

public class Service {

    private FamilyTree<Creature> familyGroup;
    public Service() {
        this.familyGroup = new FamilyTree<Creature>();

    }


    public FamilyTree getFamilyGroup() {
        return familyGroup;
    }
    public void saveFamilygroup(String str) {
        InOutFiles save = new inOutSerialObject();
        save.saveFile(this.familyGroup, str);
    }

    public void loadFamilygroup(String str) {
        InOutFiles load = new inOutSerialObject();
        this.familyGroup = load.loadFile(str);

    }
}
