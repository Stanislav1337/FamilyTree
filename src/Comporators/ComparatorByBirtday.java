package Comporators;

import Humans.Human;

import java.util.Comparator;

public  class ComparatorByBirtday implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getBirthday().compareTo(o2.getBirthday());
    }
}
