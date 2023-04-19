package Humans;

import java.util.Comparator;

public class ComparatorByID implements Comparator<Human> {


    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o1.getId(), o2.getId());

    }
}
