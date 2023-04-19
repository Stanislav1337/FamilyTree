package Creatures;
import Genders.Sex;
import java.util.List;

public interface Creature<E> {

    int getId();
    String  getName();

    String getLastName();

    abstract Creature getMother();

    abstract Creature getFather();

    List<E> getChildrens();



    Sex getSex();

    void addChildren(Creature human);

}
