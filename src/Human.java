import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



public class Human implements Serializable {
   private Human mother;
   private Human father;
   private List<Human> children;
   private String name;
   private String lastName;
   private Sex sex;
   private String birthday;
    public Human(Human mother, Human father,  String name, String lastName, Sex sex, String birthday) {

        this.mother = mother;
        this.father = father;
        children = new ArrayList<>();
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.birthday = birthday;
    }
    public Human(String name, String lastName, Sex sex, String birthday) {

        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.birthday = birthday;

    }

    public Human(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
        children = new ArrayList<>();
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

    public String getBirthday() {
        return birthday;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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

enum Sex{
    male, female
}



