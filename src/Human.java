import java.util.List;
public class Human {
    Human mother;
    Human father;
    String name;
    String lastName;
    Sex sex;
    String birthday;
    public Human(Human mother, Human father,  String name, String lastName, Sex sex, String birthday) {

        this.mother = mother;
        this.father = father;
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
    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
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

    @Override
    public String toString() {
        return "Human{" +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                '}';

    }


}

enum Sex{
    male, female
}



