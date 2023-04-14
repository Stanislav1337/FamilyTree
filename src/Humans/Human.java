package Humans;

import Creatures.Creature;
import Genders.Sex;
import Presenter.Presenter;
import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;

public class Human implements Serializable, Creature {
    private Human mother;
    private Human father;
    private List<Human> children;
    private String name;
    private String lastName;
    private Sex sex;
    private String birthday;

    public Human(Human mother, Human father, String name, String lastName, Sex sex, String birthday) {

        this.mother = mother;
        this.father = father;
        children = new ArrayList<>();
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.birthday = birthday;
        mother.addChild(this);
        father.addChild(this);

    }
    public Human(String name, String lastName, Sex sex, String birthday) {

        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.birthday = birthday;
        children = new ArrayList<>();

    }

    public Human(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
        children = new ArrayList<>();
    }

    public void addChild(Human child){
        children.add(child);
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public void addChildren(Creature human) {

    }

    public String getBirthday() {
        return birthday;
    }





    @Override
    public String toString() {
        return "Human{" +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                "}\n";

    }


}


