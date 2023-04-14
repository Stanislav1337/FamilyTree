package UI;

import FamilyTrees.FamilyTree;
import Humans.Human;
import Presenter.Presenter;
import java.awt.*;
import java.util.List;
import java.util.Scanner;

public  class Console<T> implements View{
    private Scanner scanner;
    private Presenter presenter;
    private Menu menu;
    private boolean work;
    private Human human;
    private List humanList;


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
    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
    public void HumanAdd(){
        System.out.println("Введите имя");
        String firstName = scanner.nextLine();
        System.out.println("Введите фамилию");
        String lastName =  scanner.nextLine();
        presenter.HumanAdd(scanner.nextLine());
    }



}
