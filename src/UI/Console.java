package UI;

import FamilyTrees.FamilyTree;
import Humans.Human;
import Presenter.Presenter;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public  class Console<T> implements View{
    private Scanner scanner;
    private Presenter presenter;
    private Menu menu;
    private boolean work;


    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
    @Override
    public void start() {
        scanner = new Scanner(System.in);
        menu = new Menu(this);
        work = true;
        while (work){
            hello();
            String command = scanner.nextLine();
            if (checkInput(command)){
                menu.execute(Integer.parseInt(command));
            } else {
                System.out.println("что-то пошло не так");
            }
        }
    }

    private boolean checkInput(String text){
        return text.matches("[0-9]+");
    }

    private void hello() {
        System.out.println(menu.printMenu());
    }

    @Override
    public void print(String text){
        System.out.println(text);
    }

    public void finish(){
        work = false;
    }

    public void HumanAdd(){
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию");
        String lastName =  scanner.nextLine();
        System.out.println("Введите пол");
        String sex = scanner.nextLine();
        List<String> human = new ArrayList<>();
        Collections.addAll(human, name, lastName, sex);
        presenter.addHuman(human);
    }

    public void humanDelete() {
        System.out.println("Введите Id номер объекта, который хотите удалить");
        String strID = scanner.nextLine();
        try {
            int id = Integer.parseInt(strID);
            presenter.delHuman(id);
        } catch (NumberFormatException e) {
            System.out.println("Неверный ввод");
        }
    }

    public void searchHuman() {
        System.out.println("Введите Фамилию для поиска");
        String lastName = scanner.nextLine();
        presenter.searchHuman(lastName);
    }

    public void saveFile(){
        System.out.println("Введите имя файла");
        String nameFile = scanner.nextLine();
        presenter.saveList(nameFile);
    }
    public void loadFile() {
        System.out.println("Введите имя файла");
        String nameFile = scanner.nextLine();
        presenter.loadList(nameFile);
    }
    public void showList(){
        presenter.showList();
    }

}
