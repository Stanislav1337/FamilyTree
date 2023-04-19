package FamilyTrees;

import Creatures.Creature;
import Humans.Human;
import Humans.ComparatorByID;
import Humans.ComparatorByName;
import Humans.HumanIterator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.*;

public class FamilyTree<E extends Creature> implements Serializable,Iterable<E> {
    private List<E> familyTree;
    public FamilyTree(java.util.List<E> familyTree) {
        this.familyTree = familyTree;
    }
    public FamilyTree() {
        this.familyTree = new ArrayList<>();
    }

    public java.util.List<E> getFamilyTree() {
        return familyTree;
    }


    public void add(E human) {
        if (!familyTree.contains(human)) {
            this.familyTree.add(human);
            if (human.getFather() != null) human.getFather().addChildren(human);
            if (human.getMother() != null) human.getMother().addChildren( human);
        }
    }

    public void delHumanID(int id) {
        for (Creature item : this
        ) {
            if (item.getId() == id) {
                getFamilyTree().remove(item);
            }
        }
    }



    public List<E> searchHuman(String lastName) {
        List<E> searchTemp = new ArrayList<>();
        for (E item : familyTree) {
            if (item.getName().equals(lastName)) searchTemp.add(item);
        }
        return searchTemp;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FamilyTree that = (FamilyTree) o;
        return Objects.equals(familyTree, that.familyTree);
    }


    @Override
    public int hashCode() {
        return Objects.hash(familyTree);
    }

    @Override
    public String toString() {
        for (E item : familyTree) {
            System.out.println(item);
        }
        return " ";
    }

    @Override
    public Iterator<E> iterator() {

        return new HumanIterator(familyTree);
    }

    public void sortByID() {
        familyTree.sort((Comparator<? super E>) new ComparatorByID());
    }

    public void sortByName() {
        familyTree.sort((Comparator<? super E>) new ComparatorByName());
    }
}

