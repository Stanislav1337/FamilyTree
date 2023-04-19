package Presenter;

import Services.Service;
import Genders.Sex;
import UI.View;


import java.util.List;


public class Presenter {
    private View view;
    private Service service;



    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void addHuman(List<String> human) {
        service.addHuman(human.get(0), human.get(1), Sex.valueOf(human.get(2)));
        view.print("Объект добавлен");
    }

    public void delHuman(int id) {
        if (service.delHumanID(id)){ view.print("Объект удален");}
        else view.print("Удаление по этому ID невозможно");
    }

    public void searchHuman(String lastName) {
        if(service.searchHuman(lastName).size()==0)
            view.print("Ты чё братан такого челика здесь нет");
        view.print(service.searchHuman(lastName).toString());
    }

    public void saveList(String nameFile){
        service.saveFamilyGroup(nameFile);
        view.print("Сохранён");
    }
    public void loadList(String nameFile){
        service.loadFamilyGroup(nameFile);
        view.print("Загружено");
    }

    public void showList(){
        if(service.getFamilyGroup().getFamilyTree().size()==0){view.print("Сорян чел список пуст");}
        else view.print(service.getFamilyGroup().toString());
    }


}

