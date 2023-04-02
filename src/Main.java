import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human( "Михаил", "Попущенный", Sex.male, "11.09.2001");
        Human human2 = new Human("Светлана", "Опущенная", Sex.female, "03.09.1972");
        Human tree = new Human(human2, human1, "Олег", "Отчаянный", Sex.male, "12.11.2002");
        List<Human> people = new ArrayList<>();
        people.add(human1);
        people.add(human2);
        people.add(tree);

        FamilyTree family = new FamilyTree(people);
        System.out.println(family.SearhChild(human2));


    }


}