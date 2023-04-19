import FamilyTrees.FamilyTree;
import Humans.Human;
import Services.Service;
import Genders.Sex;
import Presenter.Presenter;
import UI.Console;
import UI.View;


public class Main {
    public static void main(String[] args) {
//         DataRepository data = new DataRepository();
//        FamilyTree family = new FamilyTree();
//
//        Human parent1 = new Human( "Михаил", "Попущенный", Sex.male, "11.09.2001");
//        Human parent2 = new Human("Светлана", "Опущенная", Sex.female, "03.09.1972");
//        Human child3 = new Human(, parent2, parent1, "Олег", "Отчаянный", Sex.male, "12.11.2002");
//        Human child4 = new Human("Анна", "Опущенная", Sex.female, "13.08.2010");
//
//        family.add(parent1);
//        family.add(parent2);
//        family.add(child3);
//        family.add(child4);
//        FamilyTree family1;
//        data.save(family, "family");
//        family1 = data.load("family");
//        System.out.println(family1);
//        System.out.println(family);


//        family1.getHumanList().sort(new Humans.ComparatorByName());
//        System.out.println(family1);
//
//        family1.getHumanList().sort(new Humans.ComparatorByBirtday());
//        System.out.println(family1);

//        System.out.println(family);
//        System.out.println("Удалился " +child3.getName());
//        family.removeHuman(child3);
//        System.out.println(family);



        View view = new Console();
        Service service = new Service();
        Presenter presenter = new Presenter(view, service);
        view.start();

    }


}