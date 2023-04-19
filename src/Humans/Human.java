package Humans;

import Creatures.Creature;
import Genders.Sex;
import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Human implements Serializable, Comparable<Human>, Creature {
    private int id;
    private Human mother;
    private Human father;
    private List<Human> children;
    private String name;
    private String lastName;
    private Sex sex;

    public Human(int id, Human mother, Human father, List<Human> children, String name, String lastName, Sex sex, String birthday) {
        this.id = id;
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.birthday = birthday;
    }

    private String birthday;


    public Human(String name, String lastName, Sex sex, String birthday) {

        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.birthday = birthday;
        children = new ArrayList<>();

    }

    public Human(int id, String name, String lastname, Sex sex, Human mother, Human father) {
        this.id = id;
        this.name = name;
        this.lastName = lastname;
        this.father = father;
        this.mother = mother;
        this.sex = sex;
        children = new ArrayList<>();
    }

    public void addChild(Human child){
        children.add(child);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Human getMother() {
        return mother;
    }

    @Override
    public Human getFather() {
        return father;
    }

    @Override
    public List getChildrens() {
        return null;
    }

    public List<Human> getChildren() {
        return children;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public Sex getSex() {
        return sex;
    }

    @Override
    public void addChildren(Creature human) {

    }

    public String getBirthday() {
        return birthday;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StringBuilder getHumanInfo() {
        StringBuilder sbH = new StringBuilder();
        sbH.append(this.id);
        sbH.append(",");
        sbH.append(this.name);
        sbH.append(",");
        sbH.append(this.lastName);
        sbH.append(",");
        sbH.append(this.sex);
        return sbH;
    }



    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, sex);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return id == human.id && Objects.equals(name, human.name) && Objects.equals(lastName, human.lastName)  && sex == human.sex;
    }

    @Override
    public int compareTo(Human o) {
        return name.compareTo(o.name);

    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                '}';
    }
}


