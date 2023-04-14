package Creatures;
import Genders.Sex;

import java.time.LocalDate;
import java.util.List;

public interface Creature<E> {
    String  getName();

    String getLastName();

    abstract Creature getMother();

    abstract Creature getFather();



    default Sex getSex() {
        return null;
    }

    void addChildren(Creature human);

}
